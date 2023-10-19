package org.lessons.java;

public class Snack3 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sumOdd = 0;

        for (int i = 0; i < number.length; i++) {
            if (i % 2 == 1) {
                int element = number[i];
                sumOdd += element;
            }
        }

        System.out.println("La somma degli elementi in posizione dispari è: " + sumOdd);
    }
}
