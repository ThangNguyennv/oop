package exam.midterm.test1.datastructure;

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
        // MyStack stack = new MyStack();
        // Random random1 = new Random();
        // Random random2 = new Random();
        // int n = 15 + random1.nextInt(16);
        // for (int i = 0; i < n; i++) {
        //     int randomNumber = random2.nextInt();
        //     stack.push(randomNumber);
        // }
        // System.out.println("Cac phan tu trong stack la: ");
        // stack.printStack();
        // System.out.println();
        // while (!stack.isEmpty()) {
        //     System.out.println("Phan tu bi xoa la: " + stack.pop());
        //     System.out.println("Phan tu con lai la: ");
        //     stack.printStack();
        //     System.out.println();
        // }
        // MyQueue queue = new MyQueue();
        // Random random1 = new Random();
        // Random random2 = new Random();
        // int n = 15 + random1.nextInt(16);
        // for (int i = 0; i < n; i++) {
        //     int randomNumber = random2.nextInt();
        //     queue.add(randomNumber);
        // }
        // System.out.println("Cac phan tu trong queue la: ");
        // queue.printQueue();
        // System.out.println();
        // while (!queue.isEmpty()) {
        //     System.out.println("Phan tu bi xoa la: " + queue.remove());
        //     System.out.println("Phan tu con lai la: ");
        //     queue.printQueue();
        //     System.out.println();
        // }

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
