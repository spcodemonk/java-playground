package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class ListExample {
    public static void main(String[] args) {

       String s =  new StringJoiner(":").add("1").add("2").add("3")
                .add("4").add("5").toString();

        System.out.println(s);

//        List<Employee> empList = List.of(new Employee(1),
//                new Employee(2),
//                new Employee(3));
//
//        empList.set(0, new Employee(50));// Not Supported
//        System.out.println(empList);
//
//
//        List<Employee> empList1 = Arrays.asList(new Employee(1),
//                new Employee(2),
//                new Employee(3));
//
//        empList1.set(0, new Employee(50));// Supported
//        System.out.println(empList1);

    }
}

class Employee {
    private int id;

    public Employee(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                '}';
    }
}
