package exam.finals.test2.basicstatistics;

import java.util.NoSuchElementException;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;

    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        /* TODO */
        head = null;
        size = 0;
    }

    /**
     * Lấy kích thước của list.
     *
     * @return
     */
    @Override
    public int size() {
        /* TODO */
        return size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     *
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        /* TODO */
        MyLinkedListNode node = getNodeByIndex(index);
        return node.getPayload();
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            MyLinkedListNode prevNode = getNodeByIndex(index - 1);
            MyLinkedListNode currentNode = prevNode.getNext();
            prevNode.setNext(currentNode.getNext());
        }
        size--;
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     *
     * @param payload
     */
    @Override
    public void append(Object payload) {
        /* TODO */
        MyLinkedListNode newNode = new MyLinkedListNode(payload);
        if (head == null) {
            head = newNode;
        } else {
            MyLinkedListNode lastNode = getNodeByIndex(size - 1);
            lastNode.setNext(newNode);
        }
        size++;
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     *
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        /* TODO */
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        MyLinkedListNode newNode = new MyLinkedListNode(payload);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            MyLinkedListNode prevNode = getNodeByIndex(index - 1);
            MyLinkedListNode currentNode = prevNode.getNext();
            prevNode.setNext(newNode);
            newNode.setNext(currentNode);
        }
        size++;
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     *
     * @return
     */
    @Override
    public MyIterator iterator() {
        /* TODO */
        return new MyLinkedListIterator(head);
    }

    /**
     * Lấy node ở vị trí index.
     *
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        /* TODO */
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty.");
        }
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    private class MyLinkedListIterator implements MyIterator {
        /*
         * MyLinkedListIterator cần phải tham chiếu đến node hiện tại của MyLinkedList để có thể duyệt qua
           các phần tử còn lại trong MyLinkedList.
        */
        private MyLinkedListNode currentNode;
        private MyLinkedListNode previousNode;
        private boolean canRemove;

        /**
         * Khởi tạo dữ liệu cho Iterator là node hiện tại trong MyLinkedList.
         *
         * @param node
         */
        public MyLinkedListIterator(MyLinkedListNode node) {
            /* TODO */
            currentNode = node;
            previousNode = null;
            canRemove = false;
        }

        /**
         * Kiểm tra trong MyLinkedList có còn phần tử tiếp theo không.
         * Nếu còn thì trả về true, nếu không còn thì trả về false.
         *
         * @return
         */
        @Override
        public boolean hasNext() {
            /* TODO */
            return currentNode != null;
        }

        /**
         * iterator dịch chuyển sang phần tử kế tiếp của MyLinkedList và trả ra dữ liệu (payload) của phần tử hiện tại của MyLinkedList.
         *
         * @return payload của phần tử hiện tại.
         */
        @Override
        public Object next() {
            /* TODO */
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements in the list.");
            }
            Object payload = currentNode.getPayload(); // Lấy dữ liệu từ node hiện tại
            previousNode = currentNode;
            currentNode = currentNode.getNext(); // Di chuyển tới node tiếp theo
            canRemove = true;
            return payload;
        }

        @Override
        public void remove() {
            /* TODO */
            if (!canRemove) {
                throw new IllegalStateException("Call next() before remove()");
            }
            if (previousNode == head) {
                head = currentNode;
            } else {
                MyLinkedListNode temp = head;
                while (temp.getNext() != previousNode) {
                    temp = temp.getNext();
                }
                temp.setNext(currentNode);
            }
            size--;
            canRemove = false;
        }
    }
}
