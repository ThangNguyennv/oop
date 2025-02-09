package exam.midterm.test3.vector;

import java.util.Arrays;

public class MyArrayVector extends AbstractMyVector {
    private static final int DEFAULT_CAPACITY = 1;
    private double[] data;
    private int size;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyArrayVector() {
        /* TODO */
        data = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyArrayVector(double[] data) {
        /* TODO */
        this.data = Arrays.copyOf(data, data.length);
        size = data.length;
    }

    @Override
    public int size() {
        /* TODO */
        return this.size;
    }

    @Override
    public double coordinate(int index) {
        /* TODO */
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return data[index];
    }

    @Override
    public double[] coordinates() {
        /* TODO */
        return Arrays.copyOf(data, size);
    }

    @Override
    public void set(double value, int index) {
        /* TODO */
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        data[index] = value;
    }

    /**
     * Cộng các giá trị tọa độ với value.
     *
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector add(double value) {
        /* TODO */
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = data[i] + value;
        }
        return new MyArrayVector(result);
    }

    /**
     * Cộng vector khác vào vector hiện tại.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     *
     * @param another
     * @return vector hiện tại.
     */
    public MyArrayVector add(MyArrayVector another) {
        /* TODO */
        if (size() != another.size()) {
            throw new IllegalArgumentException("Vector dimensions do not match.");
        }
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = data[i] + another.data[i];
        }
        return new MyArrayVector(result);
    }

    /**
     * Trừ các giá trị tọa độ của vector cho value.
     *
     * @return vector hiện tại.
     */
    public MyArrayVector minus(double value) {
        /* TODO */
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = data[i] - value;
        }
        return new MyArrayVector(result);
    }

    /**
     * Trừ vector hiện tại với vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     *
     * @return
     */
    public MyArrayVector minus() {
        /* TODO */
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = -data[i];
        }
        return new MyArrayVector(result);
    }

    /**
     * Trừ vector hiện tại với vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     *
     * @return vector hiện tại.
     */
    public MyArrayVector minus(MyArrayVector another) {
        /* TODO */
        if (size() != another.size()) {
            throw new IllegalArgumentException("Vector dimensions do not match.");
        }
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = data[i] - another.data[i];
        }
        return new MyArrayVector(result);
    }

    /**
     * Tích vô hướng của hai vector.
     * Hai vector chỉ có tích vô hướng nếu có cùng số chiều.
     * Nếu hai vector không cùng số chiều, in ra thông báo lỗi hoặc ném exception.
     *
     * @return vector hiện tại.
     */
//    public MyArrayVector dot() {
//        /* TODO */
//    }

    public MyArrayVector dot(MyArrayVector another) {
        /* TODO */
        if (size() != another.size()) {
            throw new IllegalArgumentException("Vector dimensions do not match.");
        }

        double result = 0.0;
        for (int i = 0; i < size; i++) {
            result += data[i] * another.data[i];
        }
        return new MyArrayVector(new double[] {result});
    }

    /**
     * Các giá trị của vector được lấy mũ power.
     *
     * @param power
     * @return vector hiện tại.
     */
    public MyArrayVector pow(double power) {
        /* TODO */
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = Math.pow(data[i], power);
        }
        return new MyArrayVector(result);
    }

    /**
     * Các giá trị tọa độ của vector được nhân với value.
     *
     * @return vector hiện tại.
     */
    public MyArrayVector scale(double value) {
        /* TODO */
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = data[i] * value;
        }
        return new MyArrayVector(result);
    }

    /**
     * Lấy chuẩn của vector.
     *
     * @return chuẩn của vector.
     */
    @Override
    public double norm() {
        /* TODO */
        double sumOfSquares = 0.0;
        for (double value : data) {
            sumOfSquares += value * value;
        }
        return Math.sqrt(sumOfSquares);
    }

    /**
     * Thêm một giá trị value vào tọa độ vector ở vị trí cuối cùng.
     * Nếu vector không còn đủ chỗ, mở rộng thêm kích thước vector.
     *
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector insert(double value) {
        /* TODO */
        if (size == data.length) {
            enlarge();
        }
        data[size] = value;
        size++;
        return this;
    }

    /**
     * Thêm một giá trị vào tọa độ vector ở vị trí index.
     * Nếu vector không còn đủ chỗ, mở rộng thêm kích thước vector.
     *
     * @param value
     * @param index
     * @return vector hiện tại.
     */
    public MyArrayVector insert(double value, int index) {
        /* TODO */
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index.");
        }
        if (size == data.length) {
            enlarge();
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        size++;
        return this;
    }

    /**
     * Xóa giá trị ở tọa độ thứ index.
     * Nếu index không hợp lệ thì in ra thông báo lỗi hoặc ném exception.
     *
     * @param index
     * @return vector hiện tại.
     */
    public MyArrayVector remove(int index) {
        /* TODO */
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index.");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return this;
    }

    /**
     * Trích xuất ra một vector con của vector ban đầu, có các giá trị tọa độ
     * được lấy theo các chỉ số của mảng đầu vào.
     * Ví dụ, cho vector [1 2 3 4 5], cho mảng đầu vào là {2, 1} thì vector trích xuất ra
     * có tọa độ là [2 1].
     * Nếu có thỉ số trong mảng đầu vào không hợp lệ thì in ra thông báo lỗi,
     * hoặc ném exception.
     *
     * @param indices
     * @return vector mới có tọa độ được trích xuất từ vector hiện tại.
     */
    public MyArrayVector extract(int[] indices) {
        /* TODO */
        if (indices == null) {
            throw new IllegalArgumentException("Indices array cannot be null.");
        }
        double[] result = new double[indices.length];
        for (int i = 0; i < indices.length; i++) {
            int idx = indices[i];
            if (idx < 0 || idx >= size) {
                throw new IndexOutOfBoundsException("Invalid index in indices: " + idx);
            }
            result[i] = data[idx];
        }
        return new MyArrayVector(result);
    }

    /**
     * Mở rộng kích thước vector lên gấp đôi khi cần thiết.
     *
     * @return vector hiện tại.
     */
    private MyArrayVector enlarge() {
        /* TODO */
        double[] newData = new double[data.length * 2];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
        return this;
    }
    public void printMyArrayVector() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
