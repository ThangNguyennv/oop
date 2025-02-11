package exam.midterm.test4.search;

import java.util.Random;

public class TestBinarySearch {
    public static void main(String[] args) {
        /* Yêu cầu:
        - Sinh ra ngẫu nhiên một số tự nhiên có giá trị nằm trong khoảng [10 - 20].
        - Sinh ra ngẫu nhiên một mảng các số kiểu double, có kích thước bằng số tự nhiên đã sinh ngẫu nhiên ở trên.
        - Tạo đối tượng có kiểu dữ liệu BinarySearch được tham chiếu đến bởi một biến có kiểu dữ liệu Search.
          Dùng đối tượng này test thuật toán tìm kiếm nhị phân với mảng dữ liệu đã sinh ra sử dụng 3 thuật toán sắp xếp khác nhau như đã cho.

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
        Random random2 = new Random();
        int arrayLength = 10 + random1.nextInt(11);
        double[] array1 = new double[arrayLength];
        double[] array2 = new double[arrayLength];
        double[] array3 = new double[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            double element = random2.nextDouble();
            array1[i] = element;
            array2[i] = element;
            array3[i] = element;
        }

        BinarySearch binarySearch = new BinarySearch();
        Sorter bubbleSort = new BubbleSort();
        Sorter insertionSort = new InsertionSort();
        Sorter selectionSort = new SelectionSort();

        System.out.println("Using Bubble Sort Algorithm:");
        System.out.print("Before sorting: [");
        binarySearch.printArray(array1);
        System.out.println("]");
        bubbleSort.sort(array1, true);
        System.out.print("After sorting: [");
        binarySearch.printArray(array1);
        System.out.println("]");
        System.out.println("Binary search giá trị: " + binarySearch.search(array1, 3));

        System.out.println("----------------------------------------");
        binarySearch.setSorter(insertionSort);

        System.out.println("Using Insertion Sort Algorithm:");
        System.out.print("Before sorting: [");
        binarySearch.printArray(array2);
        System.out.println("]");
        insertionSort.sort(array2, true);
        System.out.print("After sorting: [");
        binarySearch.printArray(array2);
        System.out.println("]");
        System.out.println("Binary search giá trị: " + binarySearch.search(array2, 3));

        System.out.println("----------------------------------------");
        binarySearch.setSorter(selectionSort);

        System.out.println("Using Insertion Sort Algorithm:");
        System.out.print("Before sorting: [");
        binarySearch.printArray(array3);
        System.out.println("]");
        selectionSort.sort(array3, true);
        System.out.print("After sorting: [");
        binarySearch.printArray(array3);
        System.out.println("]");
        System.out.println("Binary search giá trị: " + binarySearch.search(array3, 3));
    }
}
