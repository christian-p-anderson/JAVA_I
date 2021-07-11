package Arrays;

//take a sentence and return an `array of words

import java.util.Arrays;

public class ArrayOfWords {

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        returnArrayOfWords("I am hungry")
                )
        );
    }

    private static String[] returnArrayOfWords(String string) {
        return string.split(" ");
    }
}
