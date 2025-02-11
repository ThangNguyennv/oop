package exam.finals.test1.mybookmanager;

import java.util.NoSuchElementException;

public class MyLinkedList extends AbstractMyList {
    private Node head;
    private int size;

    private class MyLinkedListIterator implements MyIterator {
        private int currentPosition;

        public MyLinkedListIterator(int start) {
            /* TODO */
            currentPosition = start;
        }

        @Override
        public boolean hasNext() {
            /* TODO */
            return currentPosition < size();
        }

        @Override
        public Object next() {
            /* TODO */
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            Object element = getNodeByIndex(currentPosition).getData();
            currentPosition++;
            return element;
        }
    }

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public MyLinkedList() {
        /* TODO */
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        /* TODO */
        return size;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * @param data
     * @param index
     */
    @Override
    public void set(Object data, int index) {
        /* TODO */
        if (!checkBoundaries(index, size - 1)) {
            throw new IndexOutOfBoundsException();
        }
        Node currentNode = getNodeByIndex(index);
        currentNode.setData(data);

    }

     /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     * @param payload
     */
    @Override
    public void append(Object payload) {
        /* TODO */
        Node newNode = new Node(payload);
        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = getNodeByIndex(size - 1);
            lastNode.setNext(newNode);
        }
        size++;
    }


    /**
     * Thêm phần tử dữ liệu vào đầu tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(Object value) {
        /* TODO */
        Node newNode = new Node(value, head);
        head = newNode;
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(Object value) {
        /* TODO */
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     * @param value
     * @param index
     */
    @Override
    public void insertAtPosition(Object value, int index) {
        /* TODO */
        if (!checkBoundaries(index, size - 1)) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            insertAtStart(value);
        } else {
            Node previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.getNext();
            }
            Node newNode = new Node(value, previous.getNext());
            previous.setNext(newNode);
        }
        size++;
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size() - 1)]
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (!checkBoundaries(index, size - 1)) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            Node previousNode = getNodeByIndex(index - 1);
            Node currentNode = previousNode.getNext();
            previousNode.setNext(currentNode.getNext());
        }
        size--;
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        /* TODO */
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    @Override
    public MyIterator iterator() {
        /* TODO */
        return new MyLinkedListIterator(0);
    }

    @Override
    public Object get(int index) {
        /* TODO */
        if (!checkBoundaries(index, size - 1)) {
            throw new IndexOutOfBoundsException();
        }
        Node node = getNodeByIndex(index);
        return node.getData();
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
