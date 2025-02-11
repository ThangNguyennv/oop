package exam.finals.test1.search;

public class BinarySearch implements Search {
    private static BinarySearch instance;
    private Sorter sorter;

    private BinarySearch() {
        /* TODO */
        sorter = new BubbleSort();
    }

    /**
     * Tạo đối tượng BinarySearch.
     * @return
     */
    public static BinarySearch getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new BinarySearch();
        }
        return instance;
    }

    public void setSorter(Sorter sorter) {
        /* TODO */
        this.sorter = sorter;
    }

    @Override
    public int search(double[] data, double value) {
        sort(data);
        return binarySearch(data, value);
    }

    private int binarySearch(double[] data, double value) {
        /* TODO */
        int left = 0, right = data.length - 1;
        int result = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (data[mid] == value) {
                result = mid;
                return result;
            } else if (data[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    private void sort(double[] data) {
        /* TODO */
        sorter.sort(data, true);
    }
}
