package com.tomgregory;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class SimpleASCIIArtGenerator {
    private static final List<String> EXCLAMATIONS = asList("4tw", "rocks", "4eva", "to the moon");
    private static final Random random = new Random();

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Must provide a string to convert to ASCII art");
            System.exit(1);
        }
        String formattedString = String.format("%s %s!", args[0], EXCLAMATIONS.get(randomIndex()));

        System.out.println(formattedString);
    }

    private static int randomIndex() {
        return random.nextInt(EXCLAMATIONS.size());
    }
}