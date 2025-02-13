package exam.midterm.test6.sortstrategy;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        /* TODO */
        // Tạo một mảng các số tự nhiên, các số tự nhiên được sinh ngẫu nhiên
        // In ra mảng vừa tạo theo định dạng, ví dụ [1 2 3 4 5].
        // Sắp xếp mảng theo thứ tự tăng dần sử dụng các thuật toán sắp xếp khác nhau.
        // In ra mảng sau khi sắp xếp.
        // In ra số lần đổi vị trí trong thuật toán đang sử dụng.
        // Ví dụ:
        // Using Bubble Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Using Selection Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Kết quả chạy chương trình lưu vào file SortStrategy<Mã sinh viên>.txt và nộp cùng source code.

        Random random = new Random();
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[5];

        for (int i = 0; i < 5; i++) {
            array1[i] = 1 + random.nextInt(10);
            array2[i] = 1 + random.nextInt(10);
            array3[i] = 1 + random.nextInt(10);
        }

        SortStrategy sortStrategy = SortStrategy.getInstance();
        ISort insertionSort = new InsertionSort();
        ISort bubbleSort = new BubbleSort();

        System.out.println("------------------------------------------");
        System.out.println("Using Selection Sort Algorithm:");
        System.out.print("Before sorting: [");
        printArray(array1);
        System.out.println("]");
        int numberOfSwap = sortStrategy.sort(array1);
        System.out.print("After sorting: [");
        printArray(array1);
        System.out.println("]");
        System.out.println("Number of swap: " + numberOfSwap);
        System.out.println("------------------------------------------");

        sortStrategy.setSortee(insertionSort);
        numberOfSwap = 0;

        System.out.println("------------------------------------------");
        System.out.println("Using Insertion Sort Algorithm:");
        System.out.print("Before sorting: [");
        printArray(array2);
        System.out.println("]");
        numberOfSwap = sortStrategy.sort(array2);
        System.out.print("After sorting: [");
        printArray(array2);
        System.out.println("]");
        System.out.println("Number of swap: " + numberOfSwap);
        System.out.println("------------------------------------------");

        sortStrategy.setSortee(bubbleSort);
        numberOfSwap = 0;

        System.out.println("------------------------------------------");
        System.out.println("Using Bubble Sort Algorithm:");
        System.out.print("Before sorting: [");
        printArray(array3);
        System.out.println("]");
        numberOfSwap = sortStrategy.sort(array3);
        System.out.print("After sorting: [");
        printArray(array3);
        System.out.println("]");
        System.out.println("Number of swap: " + numberOfSwap);
        System.out.println("------------------------------------------");

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
