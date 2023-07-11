package com.knf.dev.demo.helloworld;

import java.io.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;


@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) throws IOException {
	SpringApplication.run(HelloworldApplication.class, args);

    

  }

}
