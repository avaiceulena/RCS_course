package org.example;

public class Main {
    public static void main(String[] args) {
       int c =  task2(1, 4);
       System.out.println(c);
       // vai System.out.println(task2(1, 4));

        Samples.sample1();

        System.out.println(Tasks.biggestNumber(6));


    }
    public static int task2 (int num1, int num2){
        if(num1 > num2){
            return num1;
        }else {
            return num2;
        }
    }
}