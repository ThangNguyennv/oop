package exam.midterm.test1.datastructure;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        /*
        Yêu cầu:

        - Hoàn thiện code chương trình theo mẫu đã cho.

        - Sinh ra một số tự nhiên ngẫu nhiên nằm trong đoạn [15 - 30], gọi là n.
        - Sinh ra n số nguyên ngẫu nhiên, cho vào stack.
            + In ra các phần tử trong stack.
            + Lần lượt xóa các phần tử trong stack. Sau mỗi lần xóa, in ra các phần tử còn lại trong stack.

        - Sinh ra n số nguyên ngẫu nhiên, cho vào queue.
            + In ra các phần tử trong queue.
            + Lần lượt xóa các phần tử trong queue. Sau mỗi lần xóa, in ra các phần tử còn lại trong queue.
        */


        testStack();
        testQueue();
        MyStack stack = new MyStack();
        Random random1 = new Random();
        Random random2 = new Random();
        int n1 = 15 + random1.nextInt(16);
        for (int i = 0; i < n1; i++) {
            int randomNumber = random2.nextInt();
            stack.push(randomNumber);
        }
        System.out.println("Các phần tử trong myStack là: ");
        stack.printStack();
        System.out.println();
        while (!stack.isEmpty()) {
            System.out.println("Phần tử bị xóa là: " + stack.pop());
            if (!stack.isEmpty()) {
                System.out.println("Các phần tử hiện tại trong myStack là: ");
                stack.printStack();
                System.out.println();
            } else {
                System.out.println("myStack rỗng!!!");
                return;
            }
        }

        MyQueue queue = new MyQueue();
        Random random3 = new Random();
        Random random4 = new Random();
        int n2 = 15 + random3.nextInt(16);
        for (int i = 0; i < n2; i++) {
            int randomNumber = random4.nextInt();
            queue.add(randomNumber);
        }
        System.out.println("Các phần tử trong queue là: ");
        queue.printQueue();
        System.out.println();
        while (!queue.isEmpty()) {
            System.out.println("Phần tử bị xóa là: " + queue.remove());
            if (!queue.isEmpty()) {
                System.out.println("Các phần tử hiện tại trong queue là: ");
                queue.printQueue();
                System.out.println();
            } else {
                System.out.println("queue rỗng!!!");
                return;
            }
        }

    }

    public static void testStack() {
        /* TODO */
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());
    }

    public static void testQueue() {
        /* TODO */
        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.peek());
    }
}
