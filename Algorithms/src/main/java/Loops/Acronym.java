package Loops;

//create an acronym based on a string

import java.util.Locale;

public class Acronym {

    public static void main(String[] args) {
        System.out.println(
                acronym("ruby on rails")
        );
    }

    private static String acronym(String phrase) {
        String acronym = "";
        String[] split = phrase.split(" ");

        for (String s: split) {
            acronym += s.charAt(0);
        }

        return acronym.toUpperCase();
    }
}
