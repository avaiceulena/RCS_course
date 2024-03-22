package org.example;

import java.util.Scanner;

public class Tasks {

    public static void task3(){
        Scanner sc = new Scanner(System.in);
        String[] b = new String[5];

        for(int i = 0; i < b.length; i++){
            System.out.println("Ievadi vārdus");
            b[i] = sc.nextLine();
        }
        for(int i = 0; i < b.length; i++){
            int c = b[i].length();
            System.out.println(b[i] + " " + c);
        }
    }

    public static void task2b(){
        task2();
    }
        private static void task2() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ievadi skaitli!");
            int input1 = sc.nextInt();
            int last = Integer.MIN_VALUE;

            while (input1 > last) {
                System.out.println("Ievadi skaitli!");
                int input2 = sc.nextInt();

                if (input2 < input1) {
                    System.out.println("Hello world!");
                    input1 = input2;
                } else {
                    break;
                }
            }
        }


    public static int number(int count){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i = 1; i <= count; i++){
            System.out.println("Ievadi skaitli!");
            int input = sc.nextInt();

            sum = (sum + input);
            //sum+=input;
        }
        return sum / count;
    }
}
