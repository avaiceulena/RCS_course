package org.example;

public class Main {
    public static void main(String[] args) {
        // String value1 = "aaa";
        // String value2 = "bbb";
        //String value3 = "ccc";

        //sampleWith(value1, value2, value3);
        //sample2(3);



        //int sum = task4(-1);
        //System.out.println(sum);

        task5("suns ", 3);

    }

    public static void task5 (String a, int b){
        for(int i = 1; i <= b; i++){
           for(int j = 1; j <= i; j++){
               System.out.print(a);
           }
            System.out.println();
        }
    }

    // Vienkāršāks variants
    public static void task6 (String a, int b){
        String symbol = "";
        for(int i = 1; i <= b; i++){
            symbol = symbol + a;
            System.out.println(symbol);
        }
    }


    public static int task4(int number){
        int sum = 0;
        if(number > 0){
            for(int i = 0; i <= number; i++){
                sum = sum + i;
            }
        } else {
            sum = 0;
        }
        return sum;

    }
    public static void sample2(int a){
        if(a >= 1){
            for(int i = 0; i <= a; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print("&");
                }
                System.out.println();
            }
        } else {
            System.out.println("$");
        }
    }


    public static void  sampleWith(String value1, String value2, String value3 ){
       // System.out.println(value3 + value2 + value1);

        int len = value3.length() + value2.length() + value1.length();
        if(len > 15){
            System.out.println(value1 + value3);
        }else {
            System.out.println(value1 + value2 + value3);
        }

    }
}