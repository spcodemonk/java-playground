package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StremingExamples {

    public static List<Student> getAll() {
        return Stream.of(
                new Student(101, "john", "john@gmail.com", Arrays.asList("011727277", "010129912")),
                new Student(102, "smith", "smith@gmail.com", Arrays.asList("09328328", "1211212122")),
                new Student(103, "peter", "peter@gmail.com", Arrays.asList("09129129", "212121212")),
                new Student(104, "kely", "kely@gmail.com", Arrays.asList("0818128128", "9191020120"))
        ).toList();
    }

    public static void main(String[] args) {

        System.out.println("-------------------Map----------------------------");
        System.out.println(getAll().stream().map(Student::email).toList());

        System.out.println("-------------------FlatMap-------------------------");
        System.out.println(getAll().stream().flatMap(student -> student.phoneNumbers().stream()).toList());
    }

}
record Student(int id, String name, String email, List<String> phoneNumbers){}
