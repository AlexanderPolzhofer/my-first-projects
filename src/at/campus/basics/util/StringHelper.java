package at.campus.basics.util;

public class StringHelper {

    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String text) {

        boolean isPalindrome = true;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != reverseString(text).charAt(i)) {
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println("Das ist ein Palindrom.");
        } else {
            System.out.println("Das ist kein Palindrom.");
        }
        return isPalindrome;
    }

    public static String reverseString(String text) {

        char[] charArray = text.toCharArray();
        String reverseWord = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reverseWord += charArray[i];
        }

        return reverseWord;
    }

    public static String printAmountOfLetters(String text) {

        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                sum++;
            }
        }
        return Integer.toString(sum);
    }

    public static String countLetters(String text, char c) {

        int count = 0;
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c) {
                count++;
            }
        }
        return Integer.toString(count);
    }

    public static boolean isLowerCase(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean isUpperCase(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static char getReverseCharacter(char c) {
        char cUcLc = ' ';
        if (StringHelper.isLowerCase(c)) {
            cUcLc = Character.toUpperCase(c);
        }
        if (StringHelper.isUpperCase(c)) {
            cUcLc = Character.toLowerCase(c);
        }

        return cUcLc;
    }
}