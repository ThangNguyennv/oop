package hus.oop.lab1.part3;

import java.util.Scanner;

public class ExtractDigits {
    public static void extractDigits(int n) {
        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit + " ");
            n /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        extractDigits(n);
    }
}
