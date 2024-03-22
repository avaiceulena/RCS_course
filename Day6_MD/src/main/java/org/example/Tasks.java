package org.example;

public class Tasks {
    public static int arr(int[] numbers){

        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static int arrayAverage(int[] numbers){
        int sumAverage = 0;
        for (int i = 0; i < numbers.length; i++){
            sumAverage = sumAverage + numbers[i];
        }
        return sumAverage / numbers.length;
    }
}
