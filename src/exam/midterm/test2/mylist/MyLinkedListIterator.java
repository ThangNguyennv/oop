package exam.midterm.test2.mylist;

public class MyLinkedListIterator implements MyIterator {
    /* GỢI Ý: */
    /*
    MyLinkedListIterator cần phải tham chiếu đến node hiện tại của MyLinkedList để có thể duyệt qua
    các phần tử còn lại trong MyLinkedList.
     */
    private MyLinkedListNode currentNode;

    /**
     * Khởi tạo dữ liệu cho Iterator là node hiện tại trong MyLinkedList.
     * @param node
     */
    public MyLinkedListIterator(MyLinkedListNode node) {
        this.currentNode = node;
    }

    /**
     * Kiểm tra trong MyLinkedList có còn phần tử tiếp theo không.
     * Nếu còn thì trả về true, nếu không còn thì trả về false.
     * @return
     */
    @Override
    public boolean hasNext() {
        /* TODO */
        return currentNode != null;
    }

    /**
     * iterator dịch chuyển sang phần tử kế tiếp của MyLinkedList và trả ra dữ liệu (payload) của phần tử hiện tại của MyLinkedList.
     * @return payload của phần tử hiện tại.
     */
    @Override
    public Object next() {
        /* TODO */
        if (!hasNext()) {
            throw new java.util.NoSuchElementException("No more elements in the list.");
        }
        Object payload = currentNode.getPayload(); // Lấy dữ liệu từ node hiện tại
        currentNode = currentNode.getNext(); // Di chuyển tới node tiếp theo
        return payload;
    }
}
