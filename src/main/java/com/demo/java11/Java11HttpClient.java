package com.demo.java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Java11HttpClient {
    public static void demo() {
        System.out.println("\n3. Standard HTTP Client:");
        
        try {
            HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();
            
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/get"))
                .GET()
                .build();
            
            System.out.println("  Sending HTTP GET request to httpbin.org...");
            HttpResponse<String> response = client.send(request, 
                HttpResponse.BodyHandlers.ofString());
            
            System.out.println("  Status Code: " + response.statusCode());
            System.out.println("  Response Body (first 200 chars): ");
            System.out.println("    " + response.body().substring(0, 
                Math.min(200, response.body().length())) + "...");
        } catch (Exception e) {
            System.out.println("  HTTP request failed (this is normal in offline environments): " + e.getMessage());
        }
    }
}
