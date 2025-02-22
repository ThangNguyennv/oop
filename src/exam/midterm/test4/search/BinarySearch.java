package exam.midterm.test4.search;

public class BinarySearch implements Search {
    private Sorter sorter;


    public BinarySearch() {
        /* TODO */
        sorter = new SelectionSort();
    }

    public void setSorter(Sorter sorter) {
        /* TODO */
        this.sorter = sorter;
    }

    /**
     * Tìm kiếm giá trị value trong mảng data.
     * @param data: mảng tập hợp các giá trị.
     * @param value: giá trị cần tìm kiếm.
     * @return
     */
    @Override
    public int search(double[] data, double value) {
        /* TODO */
        return binarySearch(data, value);
    }

    /**
     * Tìm kiếm giá trị value trong mảng data, sử dụng thuật toán tìm kiếm nhị phân.
     * @param data
     * @param value
     * @return
     */
    private int binarySearch(double[] data, double value) {
        /* TODO */
        sort(data);
        int left = 0, right = data.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (data[mid] == value) {
                index = mid;
            } else if (data[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }

    /**
     * Sắp xếp mảng dữ liệu data.
     * @param data
     */
    private void sort(double[] data) {
        /* TODO */
        sorter.sort(data, true);
    }

    public void printArray(double[] data) {
        for (double element : data) {
            System.out.print(element + " ");
        }
    }
}
