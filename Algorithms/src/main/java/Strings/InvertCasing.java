package Strings;

//invert casing in string

public class InvertCasing {

    public static void main(String[] args) {
        System.out.println(
                invertCase("Hello My Name is Christian")
        );
    }

    public static String invertCase(String str) {
        
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }

        return new String(chars);
    }
}
