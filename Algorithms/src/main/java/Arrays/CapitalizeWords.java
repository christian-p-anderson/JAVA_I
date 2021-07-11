package Arrays;

//capitalize each letter in the string

import java.util.Locale;

public class CapitalizeWords {

    public static void main(String[] args) {
        System.out.println(
                capitalizeWords("my name is christian!")
        );
    }

    private static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        String capitalizedWord = "";

        for (String element: words) {
            String firstLetter = element.substring(0, 1);
            String afterFirstLetter = element.substring(1);
            capitalizedWord += firstLetter.toUpperCase() + afterFirstLetter + " ";
        }

        return capitalizedWord.trim();
    }

}
