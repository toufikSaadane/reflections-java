package com.toufik.javareflectionapi.reflection101.model;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;


class PersonTest {


    String personClassName = "com.toufik.javareflectionapi.reflection101.model.Person";

    private Class getClassName() throws ClassNotFoundException {
        Class<?> personClass = Class.forName(personClassName);
        return personClass;
    }


    @Test
    void getPersonClassName() throws ClassNotFoundException {
        System.out.println("Class name: ");
        System.out.println(getClassName());
    }

    @Test
    void getDeclaredFields() throws ClassNotFoundException {
        Field[] declaredFields = getClassName().getDeclaredFields();
        System.out.println("DeclaredFields: ");
        System.out.println(Arrays.toString(declaredFields));
    }

    @Test
    void getDeclaredMethods() throws ClassNotFoundException {
        System.out.println("Methods:");
        Method[] methods = getClassName().getMethods();
        for (Method method: methods) {
            System.out.println(method);
        }
    }
}