package com.sda.algorytmy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie {

    public static void zad1(){
        List<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true){
            String linia = sc.nextLine();
            // tu linia dodaje do listy
                    if( linia.equals("-")){
                        break;
                    }
                    list.add(linia);
        }
        System.out.println("Lista Imion: ");
        for (String el: list){
            System.out.println("IMIE: " + el);
        }

    }
}
