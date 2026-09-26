package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("array uzunluğunu girin");
        int arrayInput = Integer.parseInt(scanner.next());

        int[] array = new int[arrayInput];

        System.out.println("kaç adet sayı gireceksiniz");
        int sayiadetInput = Integer.parseInt(scanner.next());

        int enBuyuk = 0;
        int sayac = 0;








        while(sayiadetInput >= sayac) {

            System.out.println("indexi girin");
            int index = Integer.parseInt(scanner.next());

            System.out.println("sayiyi girin");
            int sayi = Integer.parseInt(scanner.next());

            for (int i = 1; i < arrayInput - index; i++) {
                array[index + i] += sayi;
            }


            for (int j = 0; j < 100; j++) {
                if (enBuyuk < array[j]) {
                    enBuyuk = array[j];

                }
            }

            System.out.println("en büyük sayı" + enBuyuk);
            sayac++;
        }
    }
}