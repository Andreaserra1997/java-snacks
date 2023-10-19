package org.lessons.java;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        String numberString = scan.nextLine();;

        int length = numberString.length();
        int result = 0;

        for (int i = 0; i < length; i++) {
            char charDigit = numberString.charAt(i);

            int intFigure = charDigit - '0';
            result = result * 10 + intFigure;
        }

        System.out.println("Il numero convertito è: " + result);
        scan.close();
    }
}
