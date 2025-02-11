package exam.finals.test1.search;

import java.util.Random;

public class TestBinarySearch {
    public static void main(String[] args) {
        /* Yêu cầu:
        - Sinh ra ngẫu nhiên một số tự nhiên có giá trị nằm trong khoảng [20 - 30].
        - Sinh ra ngẫu nhiên một mảng các số kiểu double, có kích thước bằng số tự nhiên đã sinh ngẫu nhiên ở trên.
        - Tạo đối tượng có kiểu dữ liệu BinarySearch. Dùng đối tượng này test thuật toán tìm kiếm nhị phân với
          mảng dữ liệu đã sinh ra, và sử dụng 3 thuật toán sắp xếp khác nhau như đã cho.

          Các kết quả test được in ra terminal theo định dạng: ví dụ
          Using Bubble Sort Algorithm:
          Before sorting: [5.0 4.0 3.0 2.0 1.0]
          After sorting: [1.0 2.0 3.0 4.0 5.0]
          Binary search giá trị 3.0: 2

          Using Insertion Sort Algorithm:
          Before sorting: [5.0 4.0 3.0 2.0 1.0]
          After sorting: [1.0 2.0 3.0 4.0 5.0]
          Binary search giá trị 6.0:-1

        - Kết quả chạy chương trình lưu vào file text được đặt tên <TenSinhVien_MaSinhVien_BinarySearch.txt.
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BinarySearch>.zip (Ví dụ, NguyenVanA_123456_BinarySearch.zip),
          nộp lên classroom
         */
        Random random1 = new Random();
        int arrayLength = random1.nextInt(10) + 1;
        double[] array = new double[arrayLength];
        double[] array1 = new double[arrayLength];
        double[] array2 = new double[arrayLength];

        Random random2 = new Random();
        for (int i = 0; i < arrayLength; i++) {
            double elements = random2.nextDouble(5) + 1;
            array[i] = elements;
            array1[i] = elements;
            array2[i] = elements;
        }

        BinarySearch binarySearch = BinarySearch.getInstance();
        Sorter bubbleSort = new BubbleSort();
        Sorter insertionSort = new InsertionSort();
        Sorter selectionSort = new SelectionSort();

        System.out.println("Using Bubble Sort Algorithm:");
        System.out.print("Before sorting: ");
        System.out.print("[");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
        System.out.print("After sorting:");
        bubbleSort.sort(array, true);
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
        System.out.println("Binary search giá trị: " + binarySearch.search(array, 3));

        System.out.println();

        binarySearch.setSorter(insertionSort);

        System.out.println("Using Insertion Sort Algorithm:");
        System.out.print("Before sorting: ");
        System.out.print("[");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("]");
        insertionSort.sort(array1, true);
        System.out.print("After sorting:");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("]");
        System.out.println("Binary search giá trị: "  + binarySearch.search(array1, 1));

        System.out.println();

        binarySearch.setSorter(selectionSort);

        System.out.println("Using Selection Sort Algorithm:");
        System.out.print("Before sorting: ");
        System.out.print("[");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("]");
        selectionSort.sort(array2, true);
        System.out.print("After sorting:");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("]");
        System.out.println("Binary search giá trị: " + binarySearch.search(array2, 2));
    }
}
