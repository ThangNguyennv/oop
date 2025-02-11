package exam.finals.test1.search;

public class InsertionSort implements Sorter {
    /**
     * Phương thức sắp xếp dữ liệu sử dụng thuật toán Insertion sort.
     * @param data
     * @param order: true sắp xếp theo thứ tự tăng dần, false sắp xếp theo thứ tự giảm dần.
     */
    @Override
    public void sort(double[] data, boolean order) {
        /* TODO */
        if (order == true) {
            sortAscending(data);
        } else {
            sortDescending(data);
        }
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự tăng dần,
     * sử dụng thuật toán Insertion sort.
     * @param data
     */
    private void sortAscending(double[] data) {
        /* TODO */
        for (int i = 1; i < data.length; i++) {
            int pos = i - 1;
            double x = data[i];
            while (pos >= 0 && data[pos] > x) {
                data[pos + 1] = data[pos];
                --pos;
            }
            data[pos + 1] = x;
        }
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự giảm dần,
     * sử dụng thuật toán Insertion sort.
     * @param data
     */
    private void sortDescending(double[] data) {
        /* TODO */
        for (int i = 1; i < data.length; i++) {
            int pos = i - 1;
            double x = data[i];
            while (pos >= 0 && data[pos] < x) {
                data[pos + 1] = data[pos];
                --pos;
            }
            data[pos + 1] = x;
        }
    }
}
