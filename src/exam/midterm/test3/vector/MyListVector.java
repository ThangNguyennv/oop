package exam.midterm.test3.vector;

import java.util.ArrayList;
import java.util.List;

public class MyListVector extends AbstractMyVector {
    private List<Double> data;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyListVector() {
        /* TODO */
        data = new ArrayList<>();
    }

    public MyListVector(List<Double> data) {
        /* TODO */
        this.data = new ArrayList<>(data);
    }

    @Override
    public int size() {
        /* TODO */
        return data.size();
    }

    @Override
    public double coordinate(int index) {
        /* TODO */
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return data.get(index);
    }

    @Override
    public double[] coordinates() {
        /* TODO */
        double[] newArray = new double[data.size()];
        for (int i = 0; i < size(); i++) {
            newArray[i] = data.get(i);
        }
        return newArray;
    }

    @Override
    public void set(double value, int index) {
        /* TODO */
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        data.set(index, value);
    }

    /**
     * Cộng các giá trị tọa độ với value.
     *
     * @param value
     * @return vector hiện tại.
     */
    public MyListVector add(double value) {
        /* TODO */
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            result.add(data.get(i) + value);
        }
        return new MyListVector(result);
    }

    /**
     * Cộng vector khác vào vector hiện tại.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     *
     * @param another
     * @return vector hiện tại.
     */
    public MyListVector add(MyListVector another) {
        /* TODO */
        if (data.size() != another.data.size()) {
            throw new IllegalArgumentException("Vector dimensions do not match.");
        }
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            result.add(data.get(i) + another.data.get(i));
        }
        return new MyListVector(result);
    }

    /**
     * Trừ các giá trị tọa độ của vector cho value.
     *
     * @return vector hiện tại.
     */
    public MyListVector minus(double value) {
        /* TODO */
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            result.add(data.get(i) - value);
        }
        return new MyListVector(result);
    }

    /**
     * Trừ vector hiện tại với vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     *
     * @return
     */
    public MyListVector minus() {
        /* TODO */
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            result.add(-data.get(i));
        }
        return new MyListVector(result);
    }

    /**
     * Trừ vector hiện tại với vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     *
     * @return vector hiện tại.
     */
    public MyListVector minus(MyListVector another) {
        /* TODO */
        if (data.size() != another.data.size()) {
            throw new IllegalArgumentException("Vector dimensions do not match.");
        }
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            result.add(data.get(i) - another.data.get(i));
        }
        return new MyListVector(result);
    }

    /**
     * Tích vô hướng của hai vector.
     * Hai vector chỉ có tích vô hướng nếu có cùng số chiều.
     * Nếu hai vector không cùng số chiều, in ra thông báo lỗi hoặc ném exception.
     *
     * @return vector hiện tại.
     */
//    public MyListVector dot() {
//        /* TODO */
//    }

    public MyListVector dot(MyListVector another) {
        /* TODO */
        if (data.size() != another.data.size()) {
            throw new IllegalArgumentException("Vector dimensions do not match.");
        }
        List<Double> resultList = new ArrayList<>();
        double result = 0.0;
        for (int i = 0; i < size(); i++) {
            result += (data.get(i) * another.data.get(i));
        }
        resultList.add(result);
        return new MyListVector(resultList);
    }

    /**
     * Các giá trị của vector được lấy mũ power.
     *
     * @param power
     * @return vector hiện tại.
     */
    public MyListVector pow(double power) {
        /* TODO */
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            result.add(Math.pow(data.get(i), power));
        }
        return new MyListVector(result);
    }

    /**
     * Các giá trị tọa độ của vector được nhân với value.
     *
     * @return vector hiện tại.
     */
    public MyListVector scale(double value) {
        /* TODO */
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            result.add(data.get(i) * value);
        }
        return new MyListVector(result);
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
     *
     * @param value
     * @return vector hiện tại.
     */
    public MyListVector insert(double value) {
        /* TODO */
        data.add(value);
        return this;
    }

    /**
     * Thêm một giá trị vào tọa độ vector ở vị trí index.
     *
     * @param value
     * @param index
     * @return vector hiện tại.
     */
    public MyListVector insert(double value, int index) {
        /* TODO */
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        data.add(index, value);
        return this;
    }

    /**
     * Xóa giá trị ở tọa độ thứ index.
     * Nếu index không hợp lệ thì in ra thông báo lỗi hoặc ném exception.
     *
     * @param index
     * @return vector hiện tại.
     */
    public MyListVector remove(int index) {
        /* TODO */
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        data.remove(index);
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
    public MyListVector extract(int[] indices) {
        /* TODO */
        if (indices == null) {
            throw new IllegalArgumentException("Indices array cannot be null.");
        }
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < indices.length; i++) {
            int idx = indices[i];
            if (idx < 0 || idx >= size()) {
                throw new IndexOutOfBoundsException("Invalid index in indices: " + idx);
            }
            result.add(data.get(idx));
        }
        return new MyListVector(result);
    }
}
