package com.exercise;

import java.util.ArrayList;
import java.util.List;

class personDemo {
  


    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("hello", "hello@example.com"));
        personList.add(new Person("boby", "boby@example.com"));
        personList.add(new Person("Bob", "bob@example.com"));

        
        personList.forEach(System.out::println);

       
        
    }
}