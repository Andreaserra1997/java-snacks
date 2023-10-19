package org.lessons.java;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il numero di secondi: ");
        int totalSeconds = scan.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        String risultato = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println("Tempo convertito: " + risultato);

        scan.close();
    }
}
