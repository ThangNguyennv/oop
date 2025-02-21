package exam.finals.test2.fraction;

public class DataSet {
    private static int DEFAULT_CAPACITY = 8;
    private Fraction[] data;
    private int length;

    /**
     * Hàm dựng khởi tạo mảng chứa các phân số có kích thước là DEFAULT_CAPACITY.
     */
    public DataSet() {
        data = new Fraction[DEFAULT_CAPACITY];
        length = 0;
    }

    /**
     * Hàm dựng khởi tạo mảng chứa các phân số theo data.
     *
     * @param data
     */
    public DataSet(Fraction[] data) {
        this.data = data;
    }

    /**
     * Phương thức chèn phân số fraction vào vị trí index.
     * Nếu index nằm ngoài đoạn [0, length] thì không chèn được vào.
     * Nếu mảng hết chỗ để thêm dữ liệu, mở rộng kích thước mảng gấp đôi.
     *
     * @param fraction là một phân số.
     * @return true nếu chèn được số vào, false nếu không chèn được số vào.
     */
    public boolean insert(Fraction fraction, int index) {
        /* TODO */
        if (!checkBoundaries(0, index)) {
            return false;
        } else {
            for (int i = length - 1; i > index; i--) {
                data[i + 1] = data[i];
            }
            data[index] = fraction;
            length++;
            return true;
        }
    }

    /**
     * Phương thức tạo ra một tập dữ liệu lưu các phân số tối giản của các phân số trong tập dữ liệu gốc.
     *
     * @return tập dữ liệu mới lưu các phân số tối giản của các phân số trong tập dữ liệu gốc.
     */
    public DataSet toSimplify() {
        /* TODO */
        DataSet dataSet = this;
        for (int i = 0; i < dataSet.data.length; i++) {
            if (dataSet.data[i] != null) {
                dataSet.data[i].simplify();
            }
        }
        return dataSet;
    }

    /**
     * Phương thức thêm phân số fraction vào vị trí cuối cùng chưa có dứ liệu của mảng data.
     * Nếu mảng hết chỗ để thêm dữ liệu, mở rộng kích thước mảng gấp đôi.
     *
     * @param fraction
     * @return
     */
    public void append(Fraction fraction) {
        /* TODO */
        if (fraction.getNumerator() == 0) {
            throw new ArithmeticException("Mau so bang 0");
        } else {
            if (length == data.length) {
                enlarge();
            }
            data[length] = fraction;
            length++;
        }
    }

    /**
     * Sắp xếp mảng các phân số theo thứ tự có giá trị tăng dần.
     * Nếu hai phân số bằng nhau thì sắp xếp theo thứ tự có mẫu số tăng dần.
     *
     * @return mảng mới được sắp xếp theo thứ tự có giá trị tăng dần.
     */
    public Fraction[] sortIncreasing() {
        /* TODO */
        Fraction[] result = new Fraction[length];
        System.arraycopy(data, 0, result, 0, length);
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] != null) {
                    if (result[i].compareTo(result[j]) > 0) {
                        Fraction temp = result[i];
                        result[i] = result[j];
                        result[j] = temp;
                    }
                }
            }
        }
        return result;
    }

    /**
     * Sắp xếp mảng các phân số theo thứ tự có giá trị giảm dần.
     * Nếu hai phân số bằng nhau thì sắp xếp theo thứ tự có mẫu số giảm dần.
     *
     * @return mảng mới được sắp xếp theo thứ tự có giá trị giảm dần.
     */
    public Fraction[] sortDecreasing() {
        /* TODO */
        Fraction[] result = new Fraction[length];
        System.arraycopy(data, 0, result, 0, length);
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] != null) {
                    if (result[i].compareTo(data[j]) < 0) {
                        Fraction temp = result[i];
                        result[i] = result[j];
                        result[j] = temp;
                    }
                }
            }
        }
        return result;
    }

    /**
     * Phương thức mở rộng kích thước mảng gấp đôi, bằng cách tạo ra mảng mới có kích thước
     * gấp đôi, sau đó copy dự liệu từ mảng cũ vào.
     */
    private void enlarge() {
        /* TODO */
        Fraction[] newData = new Fraction[data.length * 2];
        System.arraycopy(data, 0, newData, 0, length);
        data = newData;
    }

    /**
     * Phương thức kiểm tra xem index có nằm trong khoảng [0, upperBound] hay không.
     *
     * @param index
     * @param upperBound
     * @return true nếu index nằm trong khoảng [0, upperBound], false nếu ngược lại.
     */
    private boolean checkBoundaries(int index, int upperBound) {
        /* TODO */
        return index >= 0 && index <= upperBound;
    }

    /**
     * In ra tập dữ liệu theo định dạng [a1, a2, ... , an].
     *
     * @return
     */
    @Override
    public String toString() {
        /* TODO */
        String result = "";
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                result += data[i].toString() + "\n";
            }
        }
        return result;
    }

    /**
     * In ra mảng các phân số fractions theo định dạng [a1, a2, ... , an].
     *
     * @param fractions
     */
    public static void printFractions(Fraction[] fractions) {
        /* TODO */
        for (int i = 0; i < fractions.length; i++) {
            System.out.println(fractions[i].intValue() + " ");
        }
    }
}
