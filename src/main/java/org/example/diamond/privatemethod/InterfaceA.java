package org.example.diamond.privatemethod;

public interface InterfaceA {
    private String getValue(){
        return System.getProperty("java.version");
    }

    default String  getJavaVersion(){
        return " Current Java version is -->"+ getValue();
    }
}
