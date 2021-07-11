package Strings;

//reverse the letters in the string

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(
                reverseStr("christian")
        );
    }

    private static String reverseStr(String str) {
        StringBuilder revString = new StringBuilder();
        revString.append(str).reverse();

        return revString.toString();
    }
}
