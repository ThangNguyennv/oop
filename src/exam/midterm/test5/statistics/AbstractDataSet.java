package exam.midterm.test5.statistics;

public abstract class AbstractDataSet implements DataSet {
    /**
     * Mô tả tập dữ liệu.
     * @return mô tả tập dữ liệu dạng [a1, a2, a3, ..., an].
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append(String.format("[%s]", elementAt(i)));
        }
        return sb.toString();
    }
}
