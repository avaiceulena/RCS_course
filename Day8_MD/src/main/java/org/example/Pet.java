package org.example;

public class Pet {
    public String name;
    public int age;
    public String eMail;

    //Konstruktors ->uz leju
    public Pet(String type, int age, String eMail){
        this.name = type;
        this.age = age;
        this.eMail = eMail;
    }

    public void printPet(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(eMail);
        System.out.println("-------");
    }
}
