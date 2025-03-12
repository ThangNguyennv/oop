package hus.oop.lab3.part1;

import java.util.Scanner;

public class FactorialRecursive {
    static Scanner sc = new Scanner(System.in);

    //Exercise 1.1
    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static void testFactorial() {
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println("Factorial(" + i + ") = " + factorial(i));
        }
    }

    //Exercise 1.2
    public static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void testFibonacci() {
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println("F(" + i + ") = " + fibonacci(i) + " ");
        }
    }

    //Exercise 1.3
    public static String len(int number) {
        if (number == 1) {
            return "1";
        }
        return len(number - 1) + String.valueOf(number);
    }

    public static void testLen() {
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println("S(" + i + ") = " + len(i));
        }
    }

    //Exercise 1.4
    public static int gcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        // If b < 0 then return -1
        return secondNumber > 0 ? gcd(secondNumber, firstNumber % secondNumber) : -1;
    }

    public static void testGCD() {
        System.out.print("Enter the first number: ");
        int firstNum = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the second number: ");
        int secondNum = sc.nextInt();
        if (gcd(firstNum, secondNum) < 0) {
            System.out.println("Input must be positive integer");
            return;
        }
        System.out.println("GCD of the two number " +
                firstNum + " and " + secondNum + " is: " + gcd(firstNum, secondNum));
    }

    public static void main(String[] args) {
        testFactorial();
        testFibonacci();
        testLen();
        testGCD();
    }
}
