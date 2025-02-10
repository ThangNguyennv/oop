package exam.midterm.test3.student;

import hus.oop.lab11.designpattern.iterator.exercise1.Iterator;

public class TestMyList {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
           (ví dụ, NguyenVanA_123456_MyList.txt)
         - Nộp kết quả chạy chương trình (file text trên) cùng với các file source code.
         */

        testMyArrayList();
        System.out.println();
        System.out.println("------------------------------------");
        testMyLinkedList();
        System.out.println();
        System.out.println("------------------------------------");
    }

    public static void testMyArrayList() {
        /*
         TODO

         - Tạo ra một list kiểu MyArrayList có ít nhất 10 Student.

         - Sử dụng StudentStatistics để
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần về average.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần về average.
         */
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.append(new Student("Duc", "Nguyen", 8.5));
        myArrayList.append(new Student("An", "Ta", 5.5));
        myArrayList.append(new Student("Thang", "Ngo", 9.5));
        myArrayList.append(new Student("Duc", "Bat", 7.5));
        myArrayList.append(new Student("Bao", "Ly", 6.5));

        StudentStatistics studentStatistics = new StudentStatistics(myArrayList);

        System.out.println("Sử dụng MyArrayList: ");
        System.out.println("Danh sách các Student theo thứ tự tăng dần theo tên và họ: ");
        System.out.println(studentStatistics.sortByFullname(true));
        System.out.println("Danh sách các Student theo thứ tự giảm dần theo tên và họ: ");
        System.out.println(studentStatistics.sortByFullname(false));
        System.out.println("Danh sách các Student theo thứ tự tăng dần về average");
        System.out.println(studentStatistics.sortByAverage(true));
        System.out.println("Danh sách các Student theo thứ tự giảm dần về average");
        System.out.println(studentStatistics.sortByAverage(false));

        System.out.println("Test iterator: ");
        testIterator(myArrayList);
    }

    public static void testMyLinkedList() {
        /*
         TODO

         - Tạo ra một list kiểu MyLinkedList có ít nhất 10 Student.

         - Sử dụng StudentStatistics để
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần về average.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần về average.
         */
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(new Student("Duc", "Nguyen", 8.5));
        myLinkedList.append(new Student("An", "Ta", 5.5));
        myLinkedList.append(new Student("Thang", "Ngo", 9.5));
        myLinkedList.append(new Student("Duc", "Bat", 7.5));
        myLinkedList.append(new Student("Bao", "Ly", 6.5));

        StudentStatistics studentStatistics = new StudentStatistics(myLinkedList);

        System.out.println("Sử dụng MyLinkedList: ");
        System.out.println("Danh sách các Student theo thứ tự tăng dần theo tên và họ: ");
        System.out.println(studentStatistics.sortByFullname(true));
        System.out.println("Danh sách các Student theo thứ tự giảm dần theo tên và họ: ");
        System.out.println(studentStatistics.sortByFullname(false));
        System.out.println("Danh sách các Student theo thứ tự tăng dần về average");
        System.out.println(studentStatistics.sortByAverage(true));
        System.out.println("Danh sách các Student theo thứ tự giảm dần về average");
        System.out.println(studentStatistics.sortByAverage(false));

        System.out.println("Test iterator: ");
        testIterator(myLinkedList);
    }

    public static void testIterator(MyList myList) {
        /*
         TODO

         Sử dụng iterator duyệt qua tất cả các phần tử trong danh sách myList và in ra thông tin về phần tử đó.
         */
        MyIterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
