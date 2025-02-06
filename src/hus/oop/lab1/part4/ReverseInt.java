package hus.oop.lab1.part4;

import java.util.Scanner;

public class ReverseInt {
    public static void reverseInt(int number) {
        int result = 0;
        while (number > 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        System.out.print("The reverse is: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        reverseInt(number);
    }
}
