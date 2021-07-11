package Strings;

//return the last word in the sentence

public class ReturnLastWord {
    public static void main(String[] args) {
        System.out.println(
                lastWord("Hello my name is Christian")
        );
    }

    public static String lastWord(String string) {
        String strArr[] = string.split(" ");
        return strArr[strArr.length - 1];
    }
}
