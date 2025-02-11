package exam.finals.test1.search;

public class SelectionSort implements Sorter {
    /**
     * Phương thức sắp xếp dữ liệu sử dụng thuật toán Selection sort.
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
     * sử dụng thuật toán Selection sort.
     * @param data
     */
    private void sortAscending(double[] data) {
        /* TODO */
        for (int i = 0; i < data.length; i++) {
            int min_pos = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[min_pos]) {
                    min_pos = j;
                }
            }
            double tmp = data[min_pos];
            data[min_pos] = data[i];
            data[i] = tmp;
        }
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự giảm dần,
     * sử dụng thuật toán Selection sort.
     * @param data
     */
    private void sortDescending(double[] data) {
        /* TODO */
        for (int i = 0; i < data.length; i++) {
            int min_pos = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[min_pos]) {
                    min_pos = j;
                }
            }
            double tmp = data[min_pos];
            data[min_pos] = data[i];
            data[i] = tmp;
        }
    }
}
