package org.example;

import java.util.Scanner;
public class Calculations {
    public static double calculationOptions(double input1, double input2, String operation){

        double result = 5.5;
        result = Double.NaN;

            if (operation.equals("+")) {
                result = input1 + input2;
            } else if (operation.equals("-")) {
                result = input1 - input2;
            } else if (operation.equals("*")) {
                result = input1 * input2;
            } else if (operation.equals("/")) {
                result = input1 / input2;
            } else {
                System.out.println("Kļūda!");
            }
            return result;

    }
}
