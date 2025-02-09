package exam.midterm.test2.statistics;

import java.util.*;

public class BasicStatistic implements Statistic {
    private DataSet dataSet;

    /**
     * Hàm dựng khởi tạo tập dữ liệu.
     */
    public BasicStatistic() {
        /* TODO */
        dataSet = new ArrayDataSet();
    }

    public void setDataSet(DataSet dataSet) {
        /* TODO */
        this.dataSet = dataSet;
    }

    @Override
    public int size() {
        /* TODO */
        return dataSet.size();
    }

    @Override
    public double max() {
        /* TODO */
        if (dataSet.size() == 0) {
            throw new IllegalStateException("List is empty!");
        }
        double maxValue = Double.MIN_VALUE;
        for (int i = 0; i < size(); i++) {
            maxValue = Math.max(maxValue, (double) dataSet.element(i));
        }
        return maxValue;
    }

    @Override
    public double min() {
        /* TODO */
        if (dataSet.size() == 0) {
            throw new IllegalStateException("List is empty!");
        }
        double minValue = Double.MAX_VALUE;
        for (int i = 0; i < size(); i++) {
            minValue = Math.min(minValue, (double) dataSet.element(i));
        }
        return minValue;
    }

    @Override
    public double mean() {
        /* TODO */
        if (dataSet.size() == 0) {
            throw new IllegalStateException("List is empty!");
        }
        double sum = 0.0;
        for (int i = 0; i < dataSet.size(); i++) {
            double value = (double) dataSet.element(i);
            sum += value;
        }
        return sum / dataSet.size();
    }

    @Override
    public double variance() {
        /* TODO */
        if (dataSet.size() == 0) {
            throw new IllegalStateException("List is empty!");
        }
        double mean = mean();
        double sumSquaredDeviations = 0.0;
        for (int i = 0; i < dataSet.size(); i++) {
            double value = (double) dataSet.element(i);
            double deviation = value - mean;
            sumSquaredDeviations += deviation * deviation;
        }
        return sumSquaredDeviations / dataSet.size();
    }

    @Override
    public double[] rank() {
        /* TODO */
        if (dataSet.size() == 0) {
            throw new IllegalStateException("List is empty!");
        }
        int length = dataSet.size();
        double[] ranks = new double[length];

        // Tạo một lớp nội bộ để lưu thông tin về chỉ số ban đầu và giá trị.
        class Pair {
            int index;
            double value;

            Pair(int index, double value) {
                this.index = index;
                this.value = value;
            }
        }

        // Tạo mảng các cặp (index, value)
        Pair[] pairs = new Pair[length];
        for (int i = 0; i < length; i++) {
            pairs[i] = new Pair(i, dataSet.element(i));
        }

        // Sắp xếp các cặp theo giá trị tăng dần.
        Arrays.sort(pairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return Double.compare(p1.value, p2.value);
            }
        });

        // Duyệt qua mảng đã sắp xếp và tính rank với xử lý tie (các giá trị bằng nhau).
        int i = 0;
        while (i < length) {
            int j = i;
            // Tìm nhóm các phần tử có cùng giá trị.
            while (j < length && Double.compare(pairs[j].value, pairs[i].value) == 0) {
                j++;
            }
            // Các phần tử trong khoảng [i, j-1] có cùng giá trị.
            // Thứ hạng của phần tử đầu tiên trong nhóm là i + 1, của phần tử cuối là j.
            // Rank trung bình cho nhóm này là: ((i + 1) + j) / 2.0
            double avgRank = ((i + 1) + j) / 2.0;
            for (int k = i; k < j; k++) {
                // Đưa giá trị rank về vị trí ban đầu của phần tử.
                ranks[pairs[k].index] = avgRank;
            }
            i = j;
        }
        return ranks;
    }

    @Override
    public double median() {
        /* TODO */
        if (dataSet.size() == 0) {
            throw new IllegalStateException("List is empty!");
        }
        List<Double> sorted = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            sorted.add(dataSet.element(i));
        }
        Collections.sort(sorted);
        int length = dataSet.size();
        if (length % 2 == 1) {
            return sorted.get(length / 2);
        } else {
            return (sorted.get((length / 2) - 1) + sorted.get(length / 2)) / 2;
        }
    }

    // Hàm viết thêm
    public double element(int index) {
        return dataSet.element(index);
    }
}
