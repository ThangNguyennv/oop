package exam.midterm.test2.statistics;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        /*
        TODO

        I. Viết các chức năng test cho chương trình.
        Viết hàm test cho ArrayDataSet:
            1. Tạo một tập dữ liệu ít nhất 10 phần tử. Trong đó có test các chức năng:
                + Thêm phần tử vào cuối tập dữ liệu.
                + Thêm phần tử vào đầu tập dữ liệu.
            2. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
            3. Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
            4. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).

         Viết hàm test cho ListDataSet:
            1. Tạo một tập dữ liệu ít nhất 10 phần tử. Trong đó có test các chức năng:
                + Thêm phần tử vào cuối tập dữ liệu.
                + Thêm phần tử vào đầu tập dữ liệu.
            2. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
            3. Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
            4. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).

         II. Chạy các hàm test để test chương trình.
         Copy kết quả chạy chương trình và lưu vào file text có tên <Ten_MaSinhVien_Statistics>.txt
         (ví dụ, NguyenVanA_123456S_Statistics.txt).
         Nén các file source code và file text kết quả chạy chương trình theo định dạng .zip,
         đặt tên là <Ten_MaSinhVien_Statistics>.zip (ví dụ, NguyenVanA_123456_Statistics.zip) và nộp lên classroom.
         */

        // Viết hàm test cho ArrayDataSet:
        ArrayDataSet arrayDataSet = new ArrayDataSet();
        BasicStatistic statistic1 = new BasicStatistic();
        arrayDataSet.append(1);
        arrayDataSet.append(2);
        arrayDataSet.append(3);
        arrayDataSet.append(4);
        arrayDataSet.append(5);
        arrayDataSet.insert(555,0);
        arrayDataSet.insert(678,0);
        arrayDataSet.insert(789,0);
        arrayDataSet.insert(123,0);
        arrayDataSet.append(100);
        statistic1.setDataSet(arrayDataSet);
        System.out.println("----- Thông tin tập dữ liệu ban đầu -----");
        printDataSet(statistic1);
        System.out.println();
        printStatistics(statistic1);

        System.out.println("------------------------------------------");

        arrayDataSet.remove(0);
        arrayDataSet.remove(arrayDataSet.size() - 1);
        System.out.println("----- Dữ liệu sau khi xóa các phần tử đầu và cuối -----");
        printDataSet(statistic1);
        System.out.println();
        printStatistics(statistic1);

        System.out.println("------------------------------------------");

        // Viết hàm test cho ListDataSet:
        ListDataSet listDataSet = new ListDataSet();
        BasicStatistic statistic2 = new BasicStatistic();
        listDataSet.append(1);
        listDataSet.append(2);
        listDataSet.append(3);
        listDataSet.append(4);
        listDataSet.append(5);
        listDataSet.insert(555,0);
        listDataSet.insert(678,0);
        listDataSet.insert(789,0);
        listDataSet.insert(123,0);
        listDataSet.append(100);
        statistic2.setDataSet(listDataSet);
        System.out.println("----- Thông tin tập dữ liệu ban đầu -----");
        printDataSet(statistic2);
        System.out.println();
        printStatistics(statistic2);

        System.out.println("------------------------------------------");

        listDataSet.remove(0);
        listDataSet.remove(listDataSet.size() - 1);
        System.out.println("----- Dữ liệu sau khi xóa các phần tử đầu và cuối -----");
        printDataSet(statistic2);
        System.out.println();
        printStatistics(statistic2);
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
