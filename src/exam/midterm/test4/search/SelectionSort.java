package exam.midterm.test4.search;

public class SelectionSort implements Sorter {
    /**
     * Sắp xếp mảng dữ liệu, sử dụng thuật toán Selection sort.
     *
     * @param data
     * @param order: true sắp xếp theo thứ tự tăng dần, false sắp xếp theo thứ tự giảm dần.
     */
    @Override
    public void sort(double[] data, boolean order) {
        /* TODO */
        if (order) {
            sortAscending(data);
        } else {
            sortDescending(data);
        }
    }

    /**
     * Sắp xếp mảng dữ liệu theo thứ tự tăng dần, sử dụng thuật toán Selection sort.
     *
     * @param data
     */
    private void sortAscending(double[] data) {
        /* TODO */
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[i]) {
                    double temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }

    }

    /**
     * Sắp xếp mảng dữ liệu theo thứ tự giảm dần, sử dụng thuật toán Selection sort.
     *
     * @param data
     */
    private void sortDescending(double[] data) {
        /* TODO */
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[i]) {
                    double temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
}
