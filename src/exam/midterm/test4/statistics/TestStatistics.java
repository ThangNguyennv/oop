package exam.midterm.test4.statistics;

import java.util.Arrays;
import java.util.Random;

public class TestStatistics {
    public static void main(String[] args) {
        /* TODO

         - Viết các hàm test như yêu cầu và chạy test chương trình.
         - Copy kết quả chạy chương trình và lưu vào file text có tên <Ten_MaSinhVien_Statistics>.txt
         (ví dụ, NguyenVanA_123456S_Statistics.txt).
          - Nén các file source code và file text kết quả chạy chương trình theo định dạng .zip,
         đặt tên là <Ten_MaSinhVien_Statistics>.zip (ví dụ, NguyenVanA_123456_Statistics.zip) và nộp lên classroom.
         */

        testArrayDataSet();
        testListDataSet();

    }

    public static void testArrayDataSet() {
        /* TODO
         - Sinh ra một số tự nhiên ngẫu nhiên trong đoạn [10, 20], gọi là n.
         - Sinh ra n số thực kiểu double ngẫu nhiên, cho vào tập dữ liệu.
         - In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
         - Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
           In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
         */

        Random random1 = new Random();
        Random random2 = new Random();
        ArrayDataSet arrayDataSet = new ArrayDataSet();
        BasicStatistic basicStatistic = new BasicStatistic();
        int n = 10 + random1.nextInt(11);
        for (int i = 0; i < n; i++) {
            double number = random2.nextDouble();
            arrayDataSet.append(number);
        }
        basicStatistic.setDataSet(arrayDataSet);

        System.out.println("----- Thông tin tập dữ liệu ban đầu -----");
        printDataSet(basicStatistic);
        System.out.println();
        printStatistics(basicStatistic);
        System.out.println("------------------------------------------");

        arrayDataSet.remove(0);
        arrayDataSet.remove(arrayDataSet.size() - 1);

        System.out.println("----- Dữ liệu sau khi xóa các phần tử đầu và cuối -----");
        printDataSet(basicStatistic);
        System.out.println();
        printStatistics(basicStatistic);
        System.out.println("------------------------------------------");
    }

    public static void testListDataSet() {
        /* TODO
         - Sinh ra một số tự nhiên ngẫu nhiên trong đoạn [10, 20], gọi là n.
         - Sinh ra n số thực kiểu double ngẫu nhiên, cho vào tập dữ liệu.
         - In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
         - Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
           In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
         */

        Random random1 = new Random();
        Random random2 = new Random();
        ListDataSet listDataSet = new ListDataSet();
        BasicStatistic basicStatistic = new BasicStatistic();
        int n = 10 + random1.nextInt(11);
        for (int i = 0; i < n; i++) {
            double number = random2.nextDouble();
            listDataSet.append(number);
        }
        basicStatistic.setDataSet(listDataSet);

        System.out.println("----- Thông tin tập dữ liệu ban đầu -----");
        printDataSet(basicStatistic);
        System.out.println();
        printStatistics(basicStatistic);
        System.out.println("------------------------------------------");

        listDataSet.remove(0);
        listDataSet.remove(listDataSet.size() - 1);

        System.out.println("----- Dữ liệu sau khi xóa các phần tử đầu và cuối -----");
        printDataSet(basicStatistic);
        System.out.println();
        printStatistics(basicStatistic);
        System.out.println("------------------------------------------");
    }

    public static void printDataSet(BasicStatistic statistic) {
        System.out.print("DataSet: ");
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
        System.out.println("Rank: " + Arrays.toString(statistic.rank()));
        System.out.println("Median: " + statistic.median());
    }
}
