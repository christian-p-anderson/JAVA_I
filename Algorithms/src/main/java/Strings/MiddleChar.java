package Strings;

//get the middle char of a word

public class MiddleChar {

    public static void main(String[] args) {
        System.out.println(
                middleChar("hello")
        );
    }

    public static char middleChar(String word) {
        char char1;

        if (word.length() % 2 == 0) {
            char1 = word.charAt((word.length() / 2) - 1);
        } else {
            char1 = word.charAt(word.length() / 2);
        }

        return char1;
    }
}
