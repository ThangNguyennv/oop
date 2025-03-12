package hus.oop.homework3.part1;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();
        System.out.println("The grades are: " + Arrays.toString(grades));
        System.out.printf("The average is: %.2f%n", average(grades));
        System.out.printf("The median is: %.2f%n", median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.printf("The standard deviation is: %.2f%n", standardDeviation(grades));
    }

    public static void readGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        grades = new int[n];
        for (int i = 0; i < n; i++) {
            int grade;
            do {
                System.out.print("Enter the grade for student " + (i + 1) + ": ");
                grade = sc.nextInt();
                if (grade < 0 || grade > 100) {
                    System.out.println("Invalid grade. Please enter a value between 0 and 100.");
                }
            } while (grade < 0 || grade > 100);
            grades[i] = grade;
        }
        sc.close();
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double median(int[] array) {
        int[] copy = array.clone();
        Arrays.sort(copy);
        int n = copy.length;
        if (n % 2 == 1) {
            return copy[n / 2];
        } else {
            return (copy[(n / 2) - 1] + copy[n / 2]) / 2.0;
        }
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max)
                max = num;
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min)
                min = num;
        }
        return min;
    }

    // Tính độ lệch chuẩn theo công thức:
    // σ = sqrt((1/n * sum(x^2)) - (mean)^2)
    public static double standardDeviation(int[] array) {
        double mean = average(array);
        double sumSq = 0;
        for (int num : array) {
            sumSq += num * num;
        }
        double variance = (sumSq / array.length) - (mean * mean);
        return Math.sqrt(variance);
    }
}
