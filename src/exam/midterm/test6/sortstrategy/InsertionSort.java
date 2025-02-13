package exam.midterm.test6.sortstrategy;

public class InsertionSort implements ISort {
    @Override
    public int sort(int[] data) {
        /* TODO */
        int numberOfSwap = 0;
        int n = data.length;
        for (int i = 1; i < n; ++i) {
            int key = data[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
                numberOfSwap++;
            }
            data[j + 1] = key;
        }
        return numberOfSwap;
    }
}
