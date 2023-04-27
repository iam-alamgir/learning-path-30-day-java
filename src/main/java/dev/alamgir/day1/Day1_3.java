package dev.alamgir.day1;

// Classes and Objects
public class Day1_3 {
    public static void main(String[] args) {
        // Objects are instances of classes and have attributes (fields) and behaviors (methods)
        Person person = new Person();
        person.name = "John Doe";
        person.age = 30;
        person.introduce();
    }

    // Classes are blueprints for creating objects
    public static class Person {
        String name;
        int age;

        void introduce() {
            System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
        }
    }
}
