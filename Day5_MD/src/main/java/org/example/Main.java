package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String input3 = "";

        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Lūdzu ievadi 1. skaitli!");
            double input1 = sc.nextDouble();

            System.out.println("Lūdzi ievadi 2. skaitli!");
            double input2 = sc.nextDouble();

            Scanner op = new Scanner(System.in);
            System.out.println("Izvēlies darbību: 1) saskaitīt (+), 2) atņemt (-), reizināt (*) vai dalīt (/)");
            String operation = op.nextLine();

            System.out.println(Calculations.calculationOptions(input1, input2, operation));

            System.out.println("Vai vēlies turpināt? - Yes or No");
            input3 = op.nextLine();

        }while (input3.equals("Yes"));


    }
}