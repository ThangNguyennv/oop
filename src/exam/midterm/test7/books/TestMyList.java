package exam.midterm.test7.books;

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

         - Tạo ra một list kiểu MyArrayList có ít nhất 10 Book.

         - Sử dụng BookManager để
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo title.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo title.
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo số trang.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo số trang.
         */

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.append(new Book("4", 2000, 123));
        myArrayList.append(new Book("3", 2010, 21));
        myArrayList.append(new Book("2", 2200, 12));
        myArrayList.append(new Book("1", 2001, 111));
        myArrayList.append(new Book("5", 2020, 1));

        BookManager bookManager = new BookManager(myArrayList);
        System.out.println("Sử dụng MyArrayList: ");
        System.out.println("Danh sách các book theo thứ tự tăng dần theo title: ");
        System.out.println(bookManager.sortByTitle(true));
        System.out.println("Danh sách các book theo thứ tự giảm dần theo title: ");
        System.out.println(bookManager.sortByTitle(false));
        System.out.println("Danh sách các book theo thứ tự tăng dần về pages");
        System.out.println(bookManager.sortByPageNumber(true));
        System.out.println("Danh sách các book theo thứ tự giảm dần về pages");
        System.out.println(bookManager.sortByPageNumber(false));

        System.out.println("Test iterator: ");
        testIterator(myArrayList);
    }

    public static void testMyLinkedList() {
        /*
         TODO

         - Tạo ra một list kiểu MyLinkedList có ít nhất 10 Book.

         - Sử dụng BookManager để
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo tên sách.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo tên sách.
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo số trang.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo số trang.
         */

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(new Book("4", 2000, 123));
        myLinkedList.append(new Book("3", 2010, 21));
        myLinkedList.append(new Book("2", 2200, 12));
        myLinkedList.append(new Book("1", 2001, 111));
        myLinkedList.append(new Book("5", 2020, 1));

        BookManager bookManager = new BookManager(myLinkedList);
        System.out.println("Sử dụng MyLinkedList: ");
        System.out.println("Danh sách các book theo thứ tự tăng dần theo title: ");
        System.out.println(bookManager.sortByTitle(true));
        System.out.println("Danh sách các book theo thứ tự giảm dần theo title: ");
        System.out.println(bookManager.sortByTitle(false));
        System.out.println("Danh sách các book theo thứ tự tăng dần về pages");
        System.out.println(bookManager.sortByPageNumber(true));
        System.out.println("Danh sách các book theo thứ tự giảm dần về pages");
        System.out.println(bookManager.sortByPageNumber(false));

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
