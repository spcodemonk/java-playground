package org.example.functionlInterface;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface MySupplier<T>{
    public T getDate();

}
public class FTest {

    public static void main(String[] args) {

        MySupplier<String> supplier = ()->{
                    return "Bob";
        };



        System.out.println(supplier.getDate());



        Function<String,Integer> data = (str) -> {
         return 123;
        };


        System.out.println(data.apply("asd"));

        Predicate<Integer> predicate = num-> num%2==0;

        System.out.println(predicate.test(2));

        Consumer<String> consumer = (s)-> System.out.println(s);

        consumer.accept("Robert");

    }
    }


