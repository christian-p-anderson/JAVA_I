package Loops;

//encrypt a string by shifting each letter by three chracters

public class Encryption {

    public static void main(String[] args) {
        System.out.println(
                encrypt("My name is Christian Anderson")
        );
    }

    private static String encrypt(String string) {
        Integer shiftLetter = 3;
        String encryptedString = "";

        for (int i = 0; i < string.length(); i++) {
            char newChar = (char) (string.charAt(i) + shiftLetter);
            if(newChar > 'z') {
                encryptedString += (char) (string.charAt(i) - (26 - shiftLetter));
            } else {
                encryptedString += (char) (string.charAt(i) + shiftLetter);
            }
        }

        return encryptedString;
    }

}
