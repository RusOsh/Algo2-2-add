package com.rus;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10 , 20 , 30 , 40};
        int max, max2;
        max = 0;
        max2 = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max2 = max;
                max = mas[i];
            } else if (mas[i] > max2) {
                max2 = mas[i];
            }
        }
        System.out.println("Вывод : " + max2);
    }
}


