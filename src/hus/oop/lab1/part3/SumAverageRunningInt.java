package hus.oop.lab1.part3;

import java.util.Scanner;

public class SumAverageRunningInt {
    public static void sumAverageRunningInt(int LOWERBOUND, int UPPERBOUND) {
        double sum = 0;
        double average;
        int count = 0;

        // For dùng khi biết trước số lần lặp, while-do dùng khi chỉ cần kiểm tra điều kiện trước mỗi lần lặp.
        //While-do kiểm tra điều kiện trước rồi mới thực hiện lặp, do-while thực hiện lặp ít nhất một lần rồi mới kiểm tra điều kiện.

        // Use "for" loop
//        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
//            sum += number;
//            count++;
//        }

        // Use "while-do" loop
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            sum += number;
            ++number;
            count++;
        }

        // Use "do-while" loop
//        int number = LOWERBOUND;
//        do {
//            sum += number;
//            ++number;
//            count++;
//        } while (number <= UPPERBOUND);

        average = sum / count;
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is " + average);
    }

    public static void sumOfTheSquares(int LOWERBOUND, int UPPERBOUND) {
        double sum = 0;
        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            sum += number * number;
        }
        System.out.println("The sum of the squares " + sum);
    }

    public static void sumOfTheNumber(int LOWERBOUND, int UPPERBOUND) {
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        System.out.println("The sum of odd numbers : " + sumEven);
        System.out.println("The sum of even numbers : " + sumOdd);
        System.out.println(absDiff = (sumOdd > sumEven) ? Math.abs(sumOdd - sumEven) : Math.abs(sumEven - sumOdd));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int LOWERBOUND = sc.nextInt();
        final int UPPERBOUND = sc.nextInt();
        sumAverageRunningInt(LOWERBOUND, UPPERBOUND);
        sumOfTheSquares(LOWERBOUND, UPPERBOUND);
        sumOfTheNumber(LOWERBOUND, UPPERBOUND);
    }
}
