package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci una stringa palindroma: ");
        String word = scan.nextLine();
        String palindrome = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            palindrome = palindrome + word.charAt(i);
        }

        if (word.equals(palindrome)) {
            System.out.println("La stringa è palindroma.");
        } else {
            System.out.println("La stringa non è palindroma.");
        }

        scan.close();
    }
}
