package org.example.streams;

import org.example.Main;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Epam {

    /*
            String input = "Java articles are Awesome";
           Find the first non-repeated character using Java 8 concepts like Streams, Functional Interfaces, Method references
     */
    public static void main(String[] args) {
        String input = "Java articles are Awesome";

        Map<Character,Integer> mapData = new LinkedHashMap<>();
        for(char c:input.toCharArray()){

            mapData.put(c,mapData.getOrDefault(c,0)+1);
        }
        System.out.println(mapData);

        mapData.forEach((k,v)-> {
            if(v == 1){
                System.out.println(k);
            }
        });

    }
}
