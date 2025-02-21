package exam.finals.test2.fraction;

public class Fraction implements FractionComparable {
    private int numerator;
    private int denominator;

    /**
     * Hàm dựng khởi tạo giá trị mặc định là 1/1.
     */
    public Fraction() {
        /* TODO */
    }

    /**
     * Hàm dựng khởi tạo giá trị cho tử số và mẫu số.
     *
     * @param numerator
     * @param denominator
     */
    public Fraction(int numerator, int denominator) {
        /* TODO */
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Hàm dựng copy, copy giá trị của phân số truyền vào.
     *
     * @param copyFraction
     */
    public Fraction(Fraction copyFraction) {
        /* TODO */
        this.numerator = copyFraction.numerator;
        this.denominator = copyFraction.denominator;
    }

    public int getNumerator() {
        /* TODO */
        return numerator;
    }

    public void setNumerator(int numerator) {
        /* TODO */
        this.numerator = numerator;
    }

    public int getDenominator() {
        /* TODO */
        return denominator;
    }

    public void setDenominator(int denominator) {
        /* TODO */
        this.denominator = denominator;
    }

    /**
     * Phương thức trả về giá trị kiểu byte của phân số.
     *
     * @return
     */
    public byte byteValue() {
        /* TODO */
        return (byte) (numerator / denominator);
    }

    /**
     * Phương thức trả về giá trị kiểu int của phân số.
     *
     * @return
     */
    public int intValue() {
        /* TODO */
        return numerator / denominator;
    }

    /**
     * Phương thức trả về giá trị kiểu long của phân số.
     *
     * @return
     */
    public long longValue() {
        /* TODO */
        return numerator / denominator;
    }

    /**
     * Phương thức trả về giá trị kiểu short của phân số.
     *
     * @return
     */
    public short shortValue() {
        /* TODO */
        return (short) (numerator / denominator);
    }

    /**
     * Phương thức trả về giá trị kiểu double của phân số.
     *
     * @return
     */
    public double doubleValue() {
        /* TODO */
        return (double) (numerator * 1.0 / denominator);
    }

    /**
     * Phương thức trả về giá trị kiểu float của phân số.
     *
     * @return
     */
    public float floatValue() {
        /* TODO */
        return (float) (numerator * 1.0 / denominator);
    }

    /**
     * Phương thức tính ước số chung lớn nhất của tử số và mẫu số.
     *
     * @return ước số chung lớn nhất của tử số và mẫu số.
     */
    private int gcd() {
        /* TODO */
        int tu = Math.abs(numerator);
        int mau = Math.abs(denominator);
        int min_val = Math.min(tu, mau);
        int check = 0;
        for (int i = 1; i <= min_val; i++) {
            if (tu % i == 0 && mau % i == 0) {
                check = i;
            }
        }
        return check;
    }

    /**
     * Phương thức rút gọn phân số về phân số tối giản.
     */
    public void simplify() {
        /* TODO */
        int gcd = gcd();
        this.numerator = this.numerator / gcd;
        this.denominator = this.denominator / gcd;
        if (this.denominator < 0) {
            this.numerator = -1 * this.numerator;
            this.denominator = -1 * this.denominator;
        }
    }

    @Override
    public int compareTo(Fraction another) {
        /* TODO */
        if (this.doubleValue() != another.doubleValue()) {
            if (this.doubleValue() > another.doubleValue()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return Double.compare(this.denominator, another.denominator);
        }
    }

    /**
     * Phương thức mô tả phân số theo định dạng numerator/denominator;
     *
     * @return
     */
    @Override
    public String toString() {
        /* TODO */
        if (this.denominator == 1) {
            return "Fraction: " + this.numerator;
        } else {
            return "Fraction: " + this.numerator + "/" + this.denominator;
        }
    }
}
