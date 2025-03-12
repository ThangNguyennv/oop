package hus.oop.lab3.part2;

import java.util.Scanner;

public class SortingAndSearching {
    static Scanner scanner = new Scanner(System.in);

    //Exercise 2.1
    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void testLinearSearch() {
        System.out.print("Enter the length of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.print("Enter the element of array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the key: ");
        int key = scanner.nextInt();
        if (linearSearch(array, key)) {
            System.out.println("The key is found.");
        } else {
            System.out.println("The key is not found.");
        }
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void testLinearSearchIndex() {
        System.out.print("Enter the length of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.print("Enter the element of array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the key: ");
        int key = scanner.nextInt();
        if (linearSearchIndex(array, key) == -1) {
            System.out.println("The key is not found");
        } else {
            System.out.println("The key is found and the array index is: " + linearSearchIndex(array, key));
        }
    }

    //Exercise 2.2
    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            if (array[fromIdx] == key) {
                return true;
            }
            return false;
        } else {
            int middle = (fromIdx + toIdx) / 2;
            if (key == array[middle]) {
                return true;
            } else if (key < array[middle]) {
                toIdx = middle;
            } else {
                fromIdx = middle + 1;
            }
            return binarySearch(array, key, fromIdx, toIdx);
        }
    }

    public static void testBinarySearch() {
        System.out.print("Enter the length of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.print("Enter the element of array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the key: ");
        int key = scanner.nextInt();
        System.out.print("Enter the fromIdx: ");
        int fromIdx = scanner.nextInt();
        System.out.print("Enter the toIdx: ");
        int toIdx = scanner.nextInt();
        if (binarySearch(array, key, fromIdx, toIdx)) {
            System.out.println("The key is found");
        } else {
            System.out.println("The key is not found");
        }
    }

    //Exercise 2.3
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void bubbleSort(int[] array) {
        int length = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < length; i++) {
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                    swapped = true;
                }
            }
            length = length - 1;
        } while (swapped);
    }

    public static void testBubbleSort() {
        System.out.print("Enter the length of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.print("Enter the element of array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        bubbleSort(array);
        System.out.println("The array is sorted: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //Exercise 2.4
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min_pos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_pos]) {
                    min_pos = j;
                }
            }
            int temp = array[min_pos];
            array[min_pos] = array[i];
            array[i] = temp;
        }
    }

    public static void testSelectionSort() {
        System.out.print("Enter the length of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.print("Enter the element of array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        selectionSort(array);
        System.out.println("The array is sorted: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //Exercise 2.5
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            //Lấy ra phần tử ở chỉ số i
            int x = array[i], pos = i - 1;
            while (pos >= 0 && x < array[pos]) {
                array[pos + 1] = array[pos]; //Dịch phần tử ở vị trí pos sang phải
                pos--;
            }
            array[pos + 1] = x;
        }
    }

    public static void testInsertionSort() {
        System.out.print("Enter the length of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.print("Enter the element of array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        insertionSort(array);
        System.out.println("The array is sorted: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        testLinearSearch();
        testLinearSearchIndex();
        testBinarySearch();
        testBubbleSort();
        testSelectionSort();
        testInsertionSort();
    }
}
