package exam.finals.test2.basicstatistics;

import java.util.Iterator;
import java.util.Random;

public class BasicStatisticsTestDrive {
    public static void main(String[] args) {
        /*
           - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
             là <TenSinhVien_MaSinhVien_BasicStatistics>.txt (Ví dụ, NguyenVanA_123456_BasicStatistics.txt).
           - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
             <TenSinhVien_MaSinhVien_BasicStatistics>.zip (Ví dụ, NguyenVanA_123456_BasicStatistics.zip),
             nộp lên classroom.
         */
        testMyArrayList();
        System.out.println("---------------------------");
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
           - Sinh ngẫu nhiên một số tự nhiên nằm trong đoạn [30, 50], lưu vào biến length.
           - Tạo một danh sách kiểu MyArrayList có các phần tử dữ liệu kiểu Double, các giá trị của phần
             tử được sinh ngẫu nhiên nằm trong đoạn [1, 20].
           - Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
             In ra các dữ liệu và các đại lượng thống kê.
         */
        Random random1 = new Random();
        Random random2 = new Random();
        MyArrayList arrayList = new MyArrayList();
        BasicStatistic basicStatistic = new BasicStatistic(arrayList);
        int length = 30 + random1.nextInt(21);
        for (int i = 0; i < length; i++) {
            double number = 1 + random2.nextDouble(20);
            arrayList.append(number);
        }

        basicStatistic.setData(arrayList);

        System.out.println("----- Thông tin tập dữ liệu ban đầu -----");
        printDataSet(basicStatistic);
        System.out.println();
        printStatistics(basicStatistic);
        System.out.println("------------------------------------------");

        arrayList.remove(0);
        arrayList.remove(arrayList.size() - 1);

        System.out.println("----- Dữ liệu sau khi xóa các phần tử đầu và cuối -----");
        printDataSet(basicStatistic);
        System.out.println();
        printStatistics(basicStatistic);
        System.out.println("------------------------------------------");

        System.out.println("Test Iterator:");
        testIterator(arrayList);
    }

    public static void testMyLinkedList() {
        /*
           - Sinh ngẫu nhiên một số tự nhiên nằm trong đoạn [30, 50], lưu vào biến length.
           - Tạo ra một danh sách kiểu MyLinkedList có các phần tử dữ liệu kiểu Double, các giá trị của phần
             tử được sinh ngẫu nhiên nằm trong đoạn [1, 20].
           - Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
             In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */

        Random random1 = new Random();
        Random random2 = new Random();
        MyLinkedList myLinkedList = new MyLinkedList();
        BasicStatistic basicStatistic = new BasicStatistic(myLinkedList);
        int n = 30 + random1.nextInt(21);
        for (int i = 0; i < n; i++) {
            double number = 1 + random2.nextDouble(20);
            myLinkedList.append(number);
        }
        basicStatistic.setData(myLinkedList);

        System.out.println("----- Thông tin tập dữ liệu ban đầu -----");
        printDataSet(basicStatistic);
        System.out.println();
        printStatistics(basicStatistic);
        System.out.println("------------------------------------------");

        myLinkedList.remove(0);
        myLinkedList.remove(myLinkedList.size() - 1);

        System.out.println("----- Dữ liệu sau khi xóa các phần tử đầu và cuối -----");
        printDataSet(basicStatistic);
        System.out.println();
        printStatistics(basicStatistic);
        System.out.println("------------------------------------------");

        System.out.println("Test Iterator:");
        testIterator(myLinkedList);
    }

    public static void printDataSet(BasicStatistic statistic) {
        System.out.print("Data: ");
        for (int i = 0; i < statistic.size(); i++) {
            System.out.print(statistic.element(i) + " ");
        }
    }

    public static void printStatistics(BasicStatistic statistic) {
        System.out.println("Cỡ mẫu: " + statistic.size());
        System.out.println("Max: " + statistic.max());
        System.out.println("Min: " + statistic.min());
        System.out.println("Kỳ vọng (mean): " + statistic.mean());
        System.out.println("Phương sai (variance): " + statistic.variance());
    }

    public static void testIterator(MyList myList) {
        MyIterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
