package com.knf.dev.demo.helloworld.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

@CrossOrigin(origins = "*", maxAge = 4800)
@RestController
@RequestMapping("/api/v1/")
public class HelloWorldController {

    @GetMapping("/bitte")
    public String hello() throws IOException {
    	try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
      HttpGet httpget = new HttpGet("http://localhost:8080/api/v1/hello");

      System.out.println("Executing GET request...");
      HttpResponse response = httpclient.execute(httpget);
      String responseBody = new BasicResponseHandler().handleResponse(response);

      System.out.println("Response: " + responseBody);
    return responseBody;
    }
        
    }
}
