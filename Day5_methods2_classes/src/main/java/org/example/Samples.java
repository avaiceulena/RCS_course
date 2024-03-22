package org.example;

public class Samples {

    public static int c = 3; //globāls mainīgais.
    //System.out.println(Samples.c); // var izsaukt citā klasē, bet nav ideālais variants

    //Klasei jānonāk līdz main -- >  Samples.run();

    public static void sample1(){
        int a = 99;
        System.out.println(a);
    }
}
