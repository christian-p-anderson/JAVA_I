package Strings;

//remove the first and last character from a string

public class RemoveFirstAndLastChar {
    public static void main(String[] args) {
        System.out.println(
                firstAndLast("anderson")
        );
    }

    public static String firstAndLast(String str) {
        return str.substring(1, (str.length() - 1));
    }
}
