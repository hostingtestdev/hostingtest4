# BUILD STAGE #
FROM maven:3.8.3-openjdk-17 AS build
COPY src /home/app/backend/src
COPY pom.xml /home/app/backend
RUN mvn -f /home/app/backend/pom.xml clean package

# RUN STAGE #
FROM openjdk:17-alpine
COPY --from=build /home/app/backend/target/helloworld-0.0.1-SNAPSHOT.jar /usr/local/lib/helloworld-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/helloworld-0.0.1-SNAPSHOT.jar"]
