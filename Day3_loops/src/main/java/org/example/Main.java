package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MD2();
    }


    //Uztaisīt tā, lai lietotājs var ievadīt skaitļus un skaitlis uzreiz tiek izvadīts.
    // Katru nākamo skaitļi izvadīt tikai tad, ja jaunais skaitlis ir lielāks par iepriekšējo.
    //Līdz ko ievadītais skaitlis ir mazāks vai vienāds ar iepriekšējo beigt programmas darbību. (while cikls)

    public static void MD2() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Lūdzu ievadi 1. skaitli!");
        int input1 = sc.nextInt();
        System.out.println("Tu ievadīji - " + input1);

        // int last = Integer.MIN_VALUE; - mazākais skaitlis
        // int max = Integer.MAX_VALUE; - lielākais skaitlis

        while (input1 >= 0){
            System.out.println("Lūdzu ievadi nākamo skaitli!");
            int input2 = sc.nextInt();

            if(input1 < input2){
                System.out.println("Tu ievadīji - " + input2 + ". " + "Turpini!");
                input1 = input2;
            }else {
                System.out.println("Spēle beidzās!");
                break;
            }
        }
    }


    public static void MD1() {

        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print("$");
            }
            System.out.println();
        }
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        String word = "exit";
        String input = "";

        while (!input.equals(word)) {
            System.out.println("Uzmini vārdu!");
            input = sc.nextLine();

            if (!input.equals(word)) {
                System.out.println("Mēģini vēlreiz!");
            }

        }
        System.out.println("Tu uzminēji!");
    }


    public static void sample6() {
        //Uztaisīt ciklu, kas darbojas kamēr lietotājs neievada negatīvu skaitli
        //Izvadīt skaitļu summu
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int input = 0;

        while (input >= 0) {

            System.out.println("Ievadiet skaitli!");
            input = sc.nextInt();
            if (input < 0) {
                break;
            }

            sum = sum + input;
        }

        System.out.println("Summa ir " + sum);
    }

    public static void sample5() {
        Scanner sc = new Scanner(System.in);
        String input = "";
        //cikls darbojas, kamer cilveks neuzraksta vardu "exit"
        while (!input.equals("exit")) {
            System.out.println("Hello world!");

            System.out.println("Ievadīt simbolu virkni!");
            input = sc.nextLine();
        }
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Lūdzu ievadiet skaitli!");
            int number = sc.nextInt();

            if (number > 0) {
                sum = sum + number;
            } else {
                System.out.println("Kļūda!");
            }

        }
        System.out.println("Summa ir " + sum);
    }

    public static void sample4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lūdzu ievadiet skaitli!");
        int number = sc.nextInt();

        if (number == 5) {
            for (int i = 0; i < 5; i++) {
                System.out.println("hello");
            }
        } else {
            System.out.println("Kļūda");
        }
    }

    public static void sample3() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Lūdzu ievadiet skaitli!");
            int number = sc.nextInt();

            if (number == 0) {
                System.out.println("Kļūda");
            } else if (number == 4) {
                System.out.println("Hello world!");
            } else {
                System.out.println("Hello world!2");
            }
        }
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);

        //String a = "aaa";
        // int b = a.length();


        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ievadi string tipa vērtības!");
            String c = sc.nextLine();
            int b = c.length();
            sum = sum + b;

            // pareizāk sum = sum + c.length;

        }
        System.out.println("summa ir " + sum);
    }

    public static void sample2() {
        Scanner sc = new Scanner(System.in);

        //String a = "aaa";
        // int b = a.length();


        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ievadi skaitli!");
            int number = sc.nextInt();
            sum = sum + number;
            System.out.println(number);
            System.out.println("-------");
        }
        System.out.println("summa ir " + sum);
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("Ievadi skaitli!");
            int number = sc.nextInt();
            System.out.println(number + 5);
        }

    }

    public static void sample1() {
        // i++ -> i= i+1 var arī rakstīt i=i+2 vai i = +2
        // 5 vietā var ielikt mainīgo a
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Hello world!");
        }
    }
}