package exam.finals.test2.basicstatistics;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        /* TODO */
        this.data = data;
    }

    public int size() {
        return data.size();
    }

    public MyList getData() {
        return data;
    }

    public void setData(MyList data) {
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * @return giá trị lớn nhất.
     */
    public double max() {
        /* TODO */
        if (data.size() == 0) {
            throw new IllegalStateException("List is empty!");
        }
        double maxValue = Double.MIN_VALUE;
        for (int i = 0; i < data.size(); i++) {
            maxValue = Math.max(maxValue, (double) data.get(i));
        }
        return maxValue;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        /* TODO */
        if (data.size() == 0) {
            throw new IllegalStateException("List is empty!");
        }
        double minValue = Double.MAX_VALUE;
        for (int i = 0; i < data.size(); i++) {
            minValue = Math.min(minValue, (double) data.get(i));
        }
        return minValue;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        /* TODO */
        if (data.size() == 0) {
            throw new IllegalStateException("List is empty!");
        }
        double sum = 0.0;
        for (int i = 0; i < data.size(); i++) {
            double value = (double) data.get(i);
            sum += value;
        }
        return sum / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * @return phương sai.
     */
    public double variance() {
        /* TODO */
         if (data.size() == 0) {
            throw new IllegalStateException("List is empty!");
        }
        double mean = mean();
        double sumSquaredDeviations = 0.0;
        for (int i = 0; i < data.size(); i++) {
            double value = (double) data.get(i);
            double deviation = value - mean;
            sumSquaredDeviations += deviation * deviation;
        }
        return sumSquaredDeviations / data.size();
    }

    // Hàm viết thêm
    public Object element(int index) {
        return data.get(index);
    }
}
