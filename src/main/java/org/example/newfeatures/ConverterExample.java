package org.example.newfeatures;

public class ConverterExample {
    public static void main(String[] args) {

        Converter<String,Integer> converter = Integer::valueOf;

        System.out.println(converter.convert("100") + 20);
    }
}

@FunctionalInterface
interface Converter<String, Integer>{
    public abstract int convert(String str);
}
