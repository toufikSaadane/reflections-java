package com.toufik.javareflectionapi.reflection101.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Person {
    private String name;
    private int age;
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
