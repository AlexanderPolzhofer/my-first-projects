package at.campus.basics.stringExercises;

public class StringHelper {

    public static void main(String[] args) {
        System.out.println(reverseString(""));
        System.out.println(isPalindrome(""));
        System.out.println(printAmountOfLetters(""));
        System.out.println(countLetters("", ' '));
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
}