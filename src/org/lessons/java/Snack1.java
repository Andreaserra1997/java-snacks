package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.print("Il tuo numero pari è: " + number);
        } else if (number % 2 == 1) {
            System.out.print("Hai inserito un numero dispari, stampo il numero successivo: " + (number + 1));
        } else {
            System.out.print("Hai inserito un numero negativo");
        }
        scan.close();
    }
}
