package hus.oop.lab2.part3;

import java.util.Arrays;
import java.util.Scanner;

public class MethodExercise {
    //bai3.1
    public static int exponent(int base, int exp) {
        int product = 1;
        for (int i = 0; i < exp; i++) {
            product *= base;
        }
        return product;
    }

    public static void testExponent(Scanner sc) {
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = sc.nextInt();
        System.out.println(base + " raise to the power of " + exp + " is: " + exponent(base, exp));
    }

    //bai3.2
    public static boolean hasEight(int number) {
        while (number != 0) {
            if (number % 10 == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static int testMagicSum(Scanner in) {
        System.out.print("Enter a positive integer (or -1 to end): ");
        int number = in.nextInt();
        int sum = 0;
        while (number != -1) {
            if (hasEight(number)) {
                sum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
        }
        return sum;
    }

    //bai3.3
    public static void print(int[] array) {
        System.out.print("[" + array[0] + ",");
        for (int i = 1; i < array.length - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    public static void print(double[] array) {
        System.out.print("[" + array[0] + ",");
        for (int i = 1; i < array.length - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println(array[array.length - 1]);
    }

    public static void print(float[] array) {
        System.out.print("[" + array[0] + ",");
        for (int i = 1; i < array.length - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println(array[array.length - 1]);
    }

    //bai3.4
    public static String arrayToString(int[] array) {
        String arrStr = "";
        arrStr += "[" + array[0] + ",";
        for (int arrIdx = 1; arrIdx < array.length - 1; arrIdx++) {
            arrStr += array[arrIdx] + ",";
        }
        arrStr += array[array.length - 1] + "]";
        return arrStr;
    }

    //bai3.5
    public static boolean contains(int[] array, int key) {
        for (int arrVal : array) {
            if (arrVal == key) {
                return true;
            }
        }
        return false;
    }

    //bai3.6
    public static int search(int[] array, int key) {
        for (int arrIdx = 0; arrIdx < array.length; arrIdx++) {
            if (array[arrIdx] == key) {
                return arrIdx;
            }
        }
        return -1;
    }

    //bai3.7
    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int arrIdx = 0; arrIdx < array1.length; arrIdx++) {
            if (array1[arrIdx] != array2[arrIdx]) {
                return false;
            }
        }
        return true;
    }

    //bai3.8
    public static int[] copyOf(int[] array) {
        int[] newArr = new int[array.length];
        for (int arrIdx = 0; arrIdx < array.length; arrIdx++) {
            newArr[arrIdx] = array[arrIdx];
        }
        return newArr;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] newArr = new int[newLength];
        for (int arrIdx = 0; arrIdx < newLength; arrIdx++) {
            if (arrIdx < array.length) {
                newArr[arrIdx] = array[arrIdx];
            } else {
                newArr[arrIdx] = 0;
            }
        }
        return newArr;
    }

    //bai3.9
    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        int temp;
        for (int arrIdx = 0; arrIdx < array1.length; arrIdx++) {
            temp = array1[arrIdx];
            array1[arrIdx] = array2[arrIdx];
            array2[arrIdx] = temp;
        }
        return true;
    }

    //bai3.10
    public static void reverse(int[] array) {
        System.out.print("[" + array[array.length - 1] + ",");
        for (int arrIdx = array.length - 2; arrIdx >= 1; arrIdx--) {
            System.out.print(array[arrIdx] + ",");
        }
        System.out.print(array[0] + "]");
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] otherArray = {4, 3, 2, 1};
        Scanner sc = new Scanner(System.in);

        testExponent(sc);
        System.out.println("The magic sum is: " + testMagicSum(sc));
        print(array);
        System.out.println(arrayToString(array));
        System.out.println(contains(array, 0));
        System.out.println(search(array, 0));
        System.out.println(equals(array, otherArray));
        System.out.println(Arrays.toString(copyOf(array)));
        System.out.println(swap(array, otherArray));
        print(array);
        reverse(array);
    }
}
