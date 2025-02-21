package exam.midterm.test2.mylist;

public class TestMyList {
    public static void main(String[] args) {
        /*
         * TODO
         * Chạy demo các hàm test.
         * Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
         * (ví dụ, NguyenVanA_123456_MyList.txt)
         */

        testMyArrayList();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */

        MyArrayList myList = new MyArrayList();
        // Thêm các phần tử vào danh sách
        myList.append(10.5);
        myList.append(7.2);
        myList.append(9.8);
        myList.append(12.1);
        myList.append(6.5);

        // Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản
        BasicStatistic statistic = new BasicStatistic(myList);

        // In ra thông tin về dữ liệu và các đại lượng thống kê
        System.out.println("Dữ liệu trong MyArrayList: " + myList);
        System.out.println("Giá trị lớn nhất: " + statistic.max());
        System.out.println("Giá trị nhỏ nhất: " + statistic.min());
        System.out.println("Kỳ vọng: " + statistic.mean());
        System.out.println("Phương sai: " + statistic.variance());
        System.out.println();
    }

    public static void testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */

        MyLinkedList myList = new MyLinkedList();
        // Thêm các phần tử vào danh sách
        myList.append(10.5);
        myList.append(7.2);
        myList.append(9.8);
        myList.append(12.1);
        myList.append(6.5);

        // Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản
        BasicStatistic statistic = new BasicStatistic(myList);

        // In ra thông tin về dữ liệu và các đại lượng thống kê
        System.out.println("Dữ liệu trong MyLinkedList: " + myList);
        System.out.println("Giá trị lớn nhất: " + statistic.max());
        System.out.println("Giá trị nhỏ nhất: " + statistic.min());
        System.out.println("Kỳ vọng: " + statistic.mean());
        System.out.println("Phương sai: " + statistic.variance());
        System.out.println();
    }
}
