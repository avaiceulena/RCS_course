package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tasks {

    public static void task3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi skaitli");
        int num;
        try{
            num = sc.nextInt();
            System.out.println(num);
        }
        catch (Exception e){
            num = 0;
        }
    }

    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi vērtību:");

//        while (true){
//            List<String> stringInput = new ArrayList<>();
//            stringInput.add(sc.nextLine());
//
//            if(stringInput.equals("STOP")){
//                break;
//            }
//        }
//
//        System.out.println("Vai vēlies izvadīt visu vai kādu konkrētu vērtību?");
//        String input2 = sc.nextLine();
//
//        if(input2.equals("visu")){
//            System.out.println("Ievadi vērtību:");
//        }

        List<String> stringInput = new ArrayList<>();
        System.out.println("Cik vērtības tu vēlies ievadīt?");
        int input1 = sc.nextInt();

        System.out.println("Lūdzu ievadi vērtības");
        for(int i = 0; i <= input1; i++){
            stringInput.add(sc.nextLine());
        }

        System.out.println("Ievadi 1, ja gribi izvadīt visu, 2, ja vērtību!");
        String input2 = sc.nextLine();

        if(input2.equals("1")){

            for(String el : stringInput){
                System.out.println(el);
            }

        }else if (input2.equals("2")){

            System.out.println("Ievadi indeksu!");
            int a = sc.nextInt();
            System.out.println(stringInput.get(a));

        }else {
            System.out.println("Kļūda!");
        }
    }

    public static double task1(double[] number){

        double largest = number[0];
        for(int i = 0; i < number.length; i++){
            if(number[i] > largest){
                largest = number[i];

            }
        }
        return largest;
    }
}
