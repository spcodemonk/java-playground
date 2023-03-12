package org.example.diamond.privatemethod;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

public class Test implements InterfaceA {
    public static void main(String[] args) throws IOException, InterruptedException {
        Test t = new Test();
        System.out.println(t.getJavaVersion());


        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        List<Integer> data = List.of(1,2,3,4,5,6,7,8,9);

        List<Integer> result =  data.stream().filter( value -> value%2 ==0).toList();

        System.out.println(result);
    }
}
