package exam.midterm.test4.datastructure;

public class MyStack {
    private MyList stackData;

    public MyStack() {
        this.stackData = new MyLinkedList();
    }

    /**
     * Thêm dữ liệu vào đầu stack.
     * @param value
     */
    public void push(int value) {
        /* TODO */
    }

    /**
     * Trả lại giá trị ở vị trí đầu stack và xóa luôn phần tử dữ liệu đó.
     * @return
     */
    public int pop() {
        /* TODO */
    }

    /**
     * Kiểm tra xem stack có rỗng không.
     * @return true nếu stack rỗng, false nếu stack không rỗng.
     */
    public boolean isEmpty() {
        /* TODO */
    }

    /**
     * Trả lại giá trị ở đầu stack mà không xóa phần tử dữ liệu.
     * @return giá trị ở vị trí đầu stack.
     */
    public int peek() {
        /* TODO */
    }

    /**
     * Lấy kích thước của stack.
     * @return
     */
    public int size() {
        /* TODO */
    }
}
