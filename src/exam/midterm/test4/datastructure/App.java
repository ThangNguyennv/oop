package exam.midterm.test4.datastructure;

import exam.midterm.test1.datastructure.MyQueue;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        /* TODO
        Yêu cầu:

        - Hoàn thiện code chương trình theo mẫu đã cho.

        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_DataStructure>.txt (Ví dụ, NguyenVanA_123456_DataStructure.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_DataStructure>.zip (Ví dụ, NguyenVanA_123456_DataStructure.zip),
          nộp lên classroom.
        */

        testStack();
        testQueue();
    }

    public static void testStack() {
        /* TODO
         - Sinh ra một số tự nhiên ngẫu nhiên nằm trong đoạn [20 - 30], gọi là n.
         - Sinh ngẫu nhiên ra n số nguyên, cho vào stack.
            + In ra các phần tử trong stack.
            + Lần lượt xóa các phần tử trong stack. Sau mỗi lần xóa, in ra các phần tử còn lại trong stack.
         */
        MyStack myStack = new MyStack();
        Random random = new Random();
        int n = 20 + random.nextInt(11);
        for (int i = 0; i < n; i++) {
            int randomNumber = random.nextInt();
            myStack.push(randomNumber);
        }
        System.out.println("Các phần tử trong myStack là: ");
        myStack.printStack();
        System.out.println();
        while (!myStack.isEmpty()) {
            System.out.println("Phần tử bị xóa là: " + myStack.pop());
            if (!myStack.isEmpty()) {
                System.out.println("Các phần tử hiện tại trong myStack là: ");
                myStack.printStack();
                System.out.println();
            } else {
                System.out.println("myStack rỗng!!!");
                return;
            }
        }
    }

    public static void testQueue() {
        /* TODO
         - Sinh ra một số tự nhiên ngẫu nhiên nằm trong đoạn [20 - 30], gọi là n.
         - Sinh ra n số nguyên ngẫu nhiên, cho vào queue.
            + In ra các phần tử trong queue.
            + Lần lượt xóa các phần tử trong queue. Sau mỗi lần xóa, in ra các phần tử còn lại trong queue.
         */

        MyQueue myQueue = new MyQueue();
        Random random = new Random();
        int n = 20 + random.nextInt(11);
        for (int i = 0; i < n; i++) {
            int randomNumber = random.nextInt();
            myQueue.add(randomNumber);
        }
        System.out.println("Các phần tử trong myQueue là: ");
        myQueue.printQueue();
        System.out.println();
        while (!myQueue.isEmpty()) {
            System.out.println("Phần tử bị xóa là: " + myQueue.remove());
            if (!myQueue.isEmpty()) {
                System.out.println("Các phần tử hiện tại trong myQueue là: ");
                myQueue.printQueue();
                System.out.println();
            } else {
                System.out.println("myQueue rỗng!!!");
                return;
            }
        }
    }
}
