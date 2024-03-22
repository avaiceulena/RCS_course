package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[] {2, 4, 8, 10, 6};
        System.out.println(Tasks.arr(numbers));
        System.out.println(Tasks.arrayAverage(numbers));
    }
}