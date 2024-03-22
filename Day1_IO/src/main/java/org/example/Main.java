package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name!");
        String input1 = sc.nextLine();

        System.out.println("Enter your surname!");
        String input2 = sc.nextLine();

        System.out.println("Enter your sign!");
        String input3 = sc.nextLine();

        System.out.println(input3 + " " + input2 + " " + input1);
    }
}