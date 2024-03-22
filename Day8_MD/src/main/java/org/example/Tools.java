package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tools {

    public static List<Pet> createPetList(int a){
        List<Pet> petList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < a; i++){
            System.out.println("Ievadi dzīvnieka vārdu");
            String name = sc.nextLine();
            System.out.println("Ievadi dzīvnieka vecumu");
            int age = sc.nextInt();
            System.out.println("Ievadi e-pastu");
            String eMail = sc.nextLine();
            sc.nextLine();

            petList.add(new Pet(name, age, eMail));
        }


        return petList;
    }

    public static void addPet(List<Pet> petList) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadi dzīvnieka vārdu");
        String type = sc.nextLine();
        System.out.println("Ievadi dzīvnieka vecumu");
        int age = sc.nextInt();
        System.out.println("Ievadi e-pastu");
        String eMail = sc.nextLine();

        petList.add(new Pet(type, age, eMail));
    }
}
