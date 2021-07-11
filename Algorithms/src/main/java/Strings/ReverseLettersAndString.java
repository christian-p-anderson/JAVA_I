package Strings;

//reverse letters of each word in string and then reverse string

public class ReverseLettersAndString {

    public static void main(String[] args) {
        System.out.println(
                revRev("all the way home")
        );
    }

    public static String revRev(String str) {
        String reversedLetters = "";
        StringBuilder reverseLetters = new StringBuilder();

        String[] words = str.split(" ");

        for (String word : words) {
            reversedLetters = new StringBuilder(word).reverse().toString();
            reverseLetters.append(reversedLetters).append(" ");
        }

        String reverseWords = reverseLetters.toString().trim();
        String[] split = reverseWords.split(" ");

        String result = "";

        for (int i = split.length - 1; i >= 0; i--) {
            if (i == split.length - 1) {
                result += split[i];
            } else {
                result += " " + split[i];
            }
        }

        return result;
    }

}
