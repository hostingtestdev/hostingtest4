# BACKEND #
# BUILD STAGE #
# switch if not working
FROM maven:latest as builder 
COPY backend2/helloworld/src /home/app/backend/src
COPY backend2/helloworld/pom.xml /home/app/backend
RUN mvn -f /home/app/backend/pom.xml clean package

# RUN STAGE #
FROM openjdk:17-alpine
COPY --from=builder /home/app/backend/target/helloworld-0.0.1-SNAPSHOT.jar /usr/local/lib/helloworld-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/helloworld-0.0.1-SNAPSHOT.jar"]
