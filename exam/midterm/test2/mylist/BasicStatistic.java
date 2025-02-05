package exam.midterm.test2.mylist;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        /* TODO */
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * @return giá trị lớn nhất.
     */
    public double max() {
        /* TODO */
        if (data.size() == 0) {
            throw new IllegalStateException("List is empty");
        }

        double max_value = Double.MIN_VALUE;
        for (int i = 0; i < data.size(); i++) {
            max_value = Math.max(max_value, (double)data.get(i));
        }
        return max_value;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        /* TODO */
        if (data.size() == 0) {
            throw new IllegalStateException("List is empty");
        }

        double min_value = Double.MAX_VALUE;
        for (int i = 0; i < data.size(); i++) {
            min_value = Math.min(min_value, (double)data.get(i));
        }
        return min_value;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        /* TODO */
        if (data.size() == 0) {
            throw new IllegalStateException("List is empty");
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
            throw new IllegalStateException("List is empty");
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
}
