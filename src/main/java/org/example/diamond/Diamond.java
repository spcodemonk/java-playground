package org.example.diamond;

import java.util.ArrayList;
import java.util.List;

public class Diamond {
    public static void main(String[] args) {

        //Java 5
        List<String> list = new ArrayList<String>();

        //Java 7
        List<String> list1 = new ArrayList<>();

        //Java 9
        MathUtils<Integer> sp = new MathUtils<>() {
            @Override
            Integer sum(Integer num1, Integer num2) {
                return num1+num2;
            }
        };

    }
}




abstract class MathUtils<T>{

    abstract T sum(T num1, T num2);

//    abstract Integer sum(Integer num1, Integer num2);
}