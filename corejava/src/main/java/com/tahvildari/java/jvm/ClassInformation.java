package com.tahvildari.java.jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//This class is used to show the Class object
public class ClassInformation {

    public static void main(String[] args) {
        Student student = new Student();

        Class aClass = student.getClass();

        //getting class name
        System.out.println("aClass.getName() = " + aClass.getName());

        //getting all Class methods in Array
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method.getName() = " + method.getName());
        }


        Field[] fields = aClass.getDeclaredFields();
        //getting all class fields in Array
        for (Field field : fields) {
            System.out.println("field.getName() = " + field.getName());
        }


    }
}
