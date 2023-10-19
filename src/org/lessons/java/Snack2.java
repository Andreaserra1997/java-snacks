package org.lessons.java;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String[] name = {"Andrea", "Roberta", "Paolo", "Mario", "Silvana"};
        String[] surname = {"Serra", "Carboni", "Rossi", "Bianchi", "Soggiu"};

        Random listRandom = new Random();

        int numGuest = 5;

        for (int i = 0; i < numGuest; i++) {
            String nameRandom = name[listRandom.nextInt(name.length)];
            String surnameRandom = surname[listRandom.nextInt(surname.length)];

            System.out.println("Invitato " + (i + 1) + ": " + nameRandom + " " + surnameRandom);
        }
    }
}
