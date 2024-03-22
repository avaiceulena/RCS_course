package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        List<Student> lst= new ArrayList<>();
//        lst.add(new Student("test", "aaa", 1));
//        lst.add(new Student("aa", "dd",1));
//
//        //printStudentList(lst);
//
//        List<Student> studentList = getStudentLst(2);
//
//        printStudentList(studentList);
        List<Pet> petList = Tools.createPetList(2);
        Tools.addPet(petList);
        printList(petList);
    }

    private static void printList(List<Pet> petList){
        for(var pet : petList){
            pet.printPet();
        }
    }
    public static void MD(){
        List<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 2; i++){
            System.out.println("Ievadi studenta vārdu");
            String name = sc.nextLine();
            System.out.println("Ievadi studenta uzvārdu");
            String lastName = sc.nextLine();
            System.out.println("Ievadi studenta kursa numuru");
            int course = sc.nextInt();
            sc.nextLine();

            studentList.add(new Student(name, lastName, course));
        }
        for(int i = 0; i < studentList.size(); i++){
            studentList.get(i).print();
        }
    }

    private static void printStudentList(List<Student> lst){
        for(Student st : lst){
            st.print();
        }
    }

    private static List<Student> getStudentLst(int a){
        List<Student> studentList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 2; i++){
            System.out.println("Ievadi studenta vārdu");
            String name = sc.nextLine();
            System.out.println("Ievadi studenta uzvārdu");
            String lastName = sc.nextLine();
            System.out.println("Ievadi studenta kursa numuru");
            int course = sc.nextInt();
            sc.nextLine();

            studentList.add(new Student(name, lastName, course));
        }
        return studentList;
    }
}