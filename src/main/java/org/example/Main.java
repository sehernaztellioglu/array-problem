package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100];
        int enBuyuk = 0;

        int sayac = 0;

        while (sayac < 100) {

            System.out.println("index giriniz");
            String input = scanner.next();

            if (input.equals("enough")) {
                break;
            }

            int index = Integer.parseInt(input);

            System.out.println("sayı giriniz");
            int sayi = Integer.parseInt(scanner.next());




            for (int i = 1; i < 100 - index; i++) {
                array[index + i] += sayi;
            }


            for (int j = 0; j < 100; j++) {
                if (enBuyuk < array[j]) {
                    enBuyuk = array[j];

                }
            }


            sayac++;

        }


        System.out.println(enBuyuk);
    }
}