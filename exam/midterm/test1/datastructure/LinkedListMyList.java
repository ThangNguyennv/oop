package exam.midterm.test1.datastructure;

public class LinkedListMyList extends AbstractMyList {
    private Node start;
    private Node end;
    private int size;

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public LinkedListMyList() {
        this.start = null;
        this.end = null;
        size = 0;
    }

    @Override
    public int size() {
        /* TODO */
        return this.size;
    }

    /**
     * Lấy giá trị của phần tử ở vị trí index.
     *
     * @param index
     * @return
     */
    @Override
    public int get(int index) {
        /* TODO */
        if (!checkBoundaries(index, size - 1)) {
            throw new IndexOutOfBoundsException("Chỉ số không hợp lệ!!!");
        }
        Node node = getNodeByIndex(index);
        return node.getData();
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     *
     * @param data
     * @param index
     */
    @Override
    public void set(int data, int index) {
        /* TODO */
        if (!checkBoundaries(index, size - 1)) {
            throw new IndexOutOfBoundsException("Chỉ số không hợp lệ!!!");
        }
        Node node = getNodeByIndex(index);
        node.setData(data);
    }

    /**
     * Thêm phần tử dữ liệu vào đầu tập dữ liệu.
     *
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(int value) {
        /* TODO */
        Node newNode = new Node(value);
        if (start == null) {
            start = newNode;
            end = newNode;
        } else {
            newNode.next = start;
            start = newNode;
        }
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     *
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(int value) {
        /* TODO */
        Node newNode = new Node(value);
        if (size == 0) {
            start = newNode;
            end = newNode;
        } else {
            end.next = newNode;
            end = newNode;
        }
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     *
     * @param value
     * @param index
     */
    @Override
    public void insertAtPos(int value, int index) {
        /* TODO */
        Node newNode = new Node(value);
        if (!checkBoundaries(index, size)) {
            throw new IndexOutOfBoundsException("Chỉ số không hợp lệ!!!");
        }
        if (index == 0) {
            insertAtStart(value);
        } else if (index == size) {
            insertAtEnd(value);
        } else {
            Node cur = start;
            Node prev = null;
            for (int i = 0; i < index; i++) {
                prev = cur;
                cur = cur.next;
            }
            newNode.next = cur;
            prev.next = newNode;
            size++;
        }
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size() - 1)]
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (!checkBoundaries(index, size - 1)) {
            throw new IndexOutOfBoundsException("Chỉ số không hợp lệ!!!");
        }
        if (index == 0) {
            start = start.next;
            if (size == 1) {  // Nếu chỉ có 1 phần tử, cập nhật lại end
                end = null;
            }
        } else {
            Node prev = null;
            Node cur = start;
            for (int i = 0; i < index; i++) {
                prev = cur;
                cur = cur.next;
            }
            prev.next = cur.next;
            if (cur == end) {
                end = prev;
            }
        }
        size--;
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     *
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        /* TODO */
        if (!checkBoundaries(index, size - 1)) {
            throw new IndexOutOfBoundsException("Chỉ số không hợp lệ!!!");
        }
        Node current = start;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    /**
     * Lấy ra dữ liệu được lưu theo cấu trúc dữ liệu kiểu mảng.
     *
     * @return
     */
    @Override
    public int[] toArray() {
        /* TODO */
        int[] result = new int[size];
        Node current = start;
        int index = 0;
        while (current != null) {
            result[index++] = current.getData();
            current = current.getNext();
        }
        return result;
    }

    public void printLinkedListMyList() {
        Node current = start;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
