package hus.oop.homework3.part1;

import java.util.Scanner;

public class GradesHistogram {
    public static void main(String[] args) {
        int[] grades = readGrades();
        int[] frequency = calculateFrequency(grades);

        System.out.println("\nHorizontal Histogram:");
        printHorizontalHistogram(frequency);

        System.out.println("\nVertical Histogram:");
        printVerticalHistogram(frequency);
    }

    public static int[] readGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[] grades = new int[n];
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
        return grades;
    }

    // Tính tần số cho từng khoảng: 0-9, 10-19, …, 90-100
    public static int[] calculateFrequency(int[] grades) {
        // Có 10 khoảng (90-100 bao gồm cả 100)
        int[] freq = new int[10];
        for (int grade : grades) {
            // Với điểm 100, cần đảm bảo rơi vào khoảng cuối cùng
            int index = (grade == 100) ? 9 : grade / 10;
            freq[index]++;
        }
        return freq;
    }

    // In biểu đồ ngang
    public static void printHorizontalHistogram(int[] freq) {
        for (int i = 0; i < freq.length; i++) {
            int lower = i * 10;
            int upper = (i == 9) ? 100 : lower + 9;
            System.out.print(lower + " - " + upper + " : ");
            for (int j = 0; j < freq[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // In biểu đồ dọc
    public static void printVerticalHistogram(int[] freq) {
        // Tìm số sao lớn nhất trong các khoảng
        int max = 0;
        for (int count : freq) {
            if (count > max) max = count;
        }
        // In các dòng từ max xuống 1
        for (int level = max; level > 0; level--) {
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] >= level) {
                    System.out.print("  *  ");
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
        // In nhãn cho từng khoảng
        for (int i = 0; i < freq.length; i++) {
            int lower = i * 10;
            int upper = (i == 9) ? 100 : lower + 9;
            System.out.printf("%2d-%-3d", lower, upper);
            System.out.print(" ");
        }
        System.out.println();
    }
}
