package org.example;

public class Student {
    public String name;
    public String lastName;
    public int course;

    public Student(String name, String lastName, int course){
        this.name = name;
        this.lastName = lastName;
        this.course = course;
    }

    public void print(){
        System.out.println(name + " " + lastName);
        System.out.println("Kurss: " + course);
        System.out.println("---------------");
    }
}
