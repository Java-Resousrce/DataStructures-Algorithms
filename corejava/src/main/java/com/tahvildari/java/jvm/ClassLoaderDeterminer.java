package com.tahvildari.java.jvm;


//demonstrating Class
public class ClassLoaderDeterminer {
    public static void main(String[] args) {

        System.out.println(Student.class.getClassLoader());

        System.out.println(Integer.class.getClassLoader());
    }

}
