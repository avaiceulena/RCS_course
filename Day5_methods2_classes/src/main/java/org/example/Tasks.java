package org.example;

import java.util.Scanner;

public class Tasks {
    public static int biggestNumber(int count){
        Scanner sc = new Scanner(System.in);
        int last = Integer.MIN_VALUE;

        for(int i = 1; i <= count; i++){
            System.out.println("Lūdzu ievadi nākamo skaitli");
            int number = sc.nextInt();

            if(number > last){
                last = number;
            }
        }
        return last;
    }
}
