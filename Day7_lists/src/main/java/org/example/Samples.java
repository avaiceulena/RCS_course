package org.example;

import java.util.ArrayList;
import java.util.List;

public class Samples {

    public static void run(){
        samples1();
    }
    private static void samples1(){
        List<Integer> numberList = new ArrayList<>();
        numberList.add(3);
        numberList.add(6);

//        System.out.println(numberList.get(0));

        for(int i = 0; i < numberList.size(); i++){
            System.out.println(numberList.get(i));
        }
        numberList.remove(0); // izdzēš vērtību
    }
}
