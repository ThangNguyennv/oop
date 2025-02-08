package hus.oop.lab2homework.part3;

import java.util.*;

public class StringAndCharacterHomework {

    static Scanner sc = new Scanner(System.in);

    //bai3.1
    public static String exchangeCipher(String inStr) {
        String result = "";
        for (char inChar : inStr.toCharArray()) {
            int key = inChar - 'A';
            inChar = (char) ('Z' - key);
            result += inChar;
        }
        return result;
    }

    public static void testExchangeCipher() {
        System.out.print("Enter a plaintext String: ");
        String inStr = sc.nextLine().toUpperCase();
        System.out.print("The ciphertext string is: ");
        System.out.println(exchangeCipher(inStr));
        System.out.println();
    }

    //bai3.2
    public static boolean isPalindromicWord(String Str) {
        int fIdx = 0;
        int bIdx = Str.length() - 1;
        while (fIdx < bIdx) {
            if (Str.charAt(fIdx) != Str.charAt(bIdx)) {
                return false;
            }
            ++fIdx;
            --bIdx;
        }
        return true;
    }

    public static void testPalindromicWord() {
        System.out.print("Enter a palindromic word string: ");
        String Str = sc.nextLine();
        String str = Str.toUpperCase();
        if (isPalindromicWord(str)) {
            System.out.println(Str + " is a palindromic word");
        } else {
            System.out.println(Str + " is a not palindromic word");
        }
    }

    public static boolean isPalindromicPhrase(String Str) {
        String result = "";
        for (char inChar : Str.toCharArray()) {
            if ((inChar >= 65 && inChar <= 90) || (inChar >= 97 && inChar <= 122)) {
                result += inChar;
            }
        }
        result = result.toUpperCase();
        return isPalindromicWord(result);
    }

    public static void testPalindromicPhrase() {
        System.out.print("Enter a palindromic phrase string: ");
        String Str = sc.nextLine();
        if (isPalindromicPhrase(Str)) {
            System.out.println(Str + " is a palindromic phrase word");
        } else {
            System.out.println(Str + " is a not palindromic phrase word");
        }
    }

    public static void main(String[] args) {
        testExchangeCipher();
        testPalindromicPhrase();
        testPalindromicWord();
    }
}
