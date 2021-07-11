package Strings;

//remove character from string

public class RemoveChar {

    public static void main(String[] args) {
        System.out.println(
                removeChar("madDog", "a")
        );
    }

    public static String removeChar(String value, String charToRemove) {
        return value.replace(charToRemove.toString(), "");
    }
}
