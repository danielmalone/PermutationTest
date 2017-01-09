package com.finepointmobile;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String firstString = "aza";
        String secondString = "zza";

        Character firstCharacters[] = new Character[firstString.length()];
        Character secondCharacters[] = new Character[secondString.length()];

        if (firstCharacters.length != secondCharacters.length) {
            return;
        }

        for (int i = 0; i < firstString.length(); i++) {
            firstCharacters[i] = firstString.charAt(i);
        }

        for (int i = 0; i < secondString.length(); i++) {
            secondCharacters[i] = secondString.charAt(i);
        }

        Arrays.sort(firstCharacters);
        Arrays.sort(secondCharacters);

        for (int i = 0; i < firstCharacters.length; i++) {
            if (!firstCharacters[i].equals(secondCharacters[i])) {
                System.out.println("Doesn't match!");
                return;
            }
        }
        System.out.println("Matches!");
    }
}
