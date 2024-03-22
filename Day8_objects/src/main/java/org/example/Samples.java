package org.example;

public class Samples {
    // ja ir runa par objektiem, tad vārdu static nelietojam
    public String name; //objekta vērtība
    public String lastName;
    public int course;

    public Samples(String name, String lastName, int course){
        this.name = name;
        this.lastName = lastName;
        this.course = course;
    }
    //konstruktors

    public void print(){
        System.out.println(name + " " + lastName);
        System.out.println("Kurss: " + course);
    }
}
