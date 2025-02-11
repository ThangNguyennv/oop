package exam.midterm.test4.statistics;

import java.util.ArrayList;
import java.util.List;

public class ListDataSet extends AbstractDataSet {
    private List<Double> data;

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public ListDataSet() {
        /* TODO */
        data = new ArrayList<>();
    }

    @Override
    public int size() {
        /* TODO */
        return data.size();
    }

    @Override
    public double getAt(int index) {
        /* TODO */
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return data.get(index);
    }

    @Override
    public double[] getAll(int from, int to) {
        /* TODO */
        if ((from < 0 || from >= size()) && (to < 0 || to >= size())) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        int length = to - from + 1;
        double[] newArray = new double[length];
        int index = 0;
        for (int i = from; i <= to; i++) {
            newArray[index++] = data.get(i);
        }
        return newArray;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void append(double value) {
        /* TODO */
        data.add(value);
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * @param index
     * @param value
     */
    @Override
    public void insert(int index, double value) {
        /* TODO */
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        data.add(index, value);
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        data.remove(index);
    }

    /**
     * Xóa tất cả các phần tử dữ liệu có giá trị bằng value trong tập dữ liệu.
     * @param value
     */
    @Override
    public void remove(double value) {
        /* TODO */
        data.remove(value);
    }
}
