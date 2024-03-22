package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        taskMD();
    }

    public static void taskMD(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadi simbolu virkni!");
        String c = sc.nextLine();

        int len = c.length();


        if(c.length() > 10){
            System.out.println("###");
        }else if(c.length() == 10){
            System.out.println("#");
        }else{
            System.out.println("##");
        }

        if(c.length() > 4 && c.length() <= 10){
            System.out.println("OK");
        }else{
            System.out.println("NOT OK");
        }

//        if(c.length() == 5){
//            System.out.println("OK");
//        }else if(c.length() == 6){
//            System.out.println("OK");
//        }else if(c.length() == 7){
//            System.out.println("OK");
//        }else if(c.length() == 8){
//            System.out.println("OK");
//        }else if(c.length() == 9){
//            System.out.println("OK");
//        }else if(c.length() == 10){
//            System.out.println("OK");
//        }else{
//            System.out.println("NOT OK");
//        }
    }
    public static void sample5(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadi vārdu!");
        String b = sc.nextLine();

        int len = b.length(); // simbolu skaits

        if(b.equals("bbb") || b.length() == 3){
            System.out.println("ir vienāds");

            // || ir vai
            // && ir un
        }
    }


    public static void sample4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi skaitli!");
        int skaitlis3 = sc.nextInt();

        if(skaitlis3 > 5){
            System.out.println("###");
        }else{
            System.out.println("####");
        }
    }

    public static void sample3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi pirmo skaitli!");
        int skaitlis1 = sc.nextInt();

        // >
        // <
        // >=
        // <=
        // ==
        // !=

        if(skaitlis1 > 0){
            System.out.println("Jā");
        }else if(skaitlis1 < 0){
            System.out.println("Nē");
        }else{
            System.out.println("Kļūda!");
        }

        // String if
        // ir vai nav vienāds

        String a = "agnese";
        String b = sc.nextLine();
        if(b.equals("aaa")){
            System.out.println("ir vienāds");
        }
    }




    public static void sample2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadi pirmo skaitli!");
        int skaitlis1 = sc.nextInt();

        System.out.println("Ievadi otro skaitli!");
        int skaitlis2 = sc.nextInt();

        System.out.println(skaitlis1 + skaitlis2);
    }
}