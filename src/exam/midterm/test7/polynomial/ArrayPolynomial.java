package exam.midterm.test7.polynomial;

import java.util.Arrays;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficents;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        /* TODO */
        size = 0;
        coefficents = new double[DEFAULT_CAPACITY];
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        if (index >= 0 && index < size) {
            return coefficents[index];
        }
        return 0.0;
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        return Arrays.copyOf(coefficents, size);
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        /* TODO */
        if (size == coefficents.length) {
            enlarge();
        }
        coefficents[size++] = coefficient;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        /* TODO */
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Invalid index");
        }
        if (size == coefficents.length) {
            enlarge();
        }
        System.arraycopy(coefficents, index, coefficents, index + 1, size - index);
        coefficents[index] = coefficient;
        size++;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        /* TODO */
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Invalid index");
        }
        coefficents[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        /* TODO */
        return size - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double result = 0.0;
        for (int i = 0; i < size; i++) {
            result += coefficents[i] * Math.pow(x, i);
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        ArrayPolynomial derivative = new ArrayPolynomial();
        for (int i = 1; i < size; i++) {
            derivative.append(coefficents[i] * i);
        }
        return derivative;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        /* TODO */
        int maxLength = Math.max(size, another.size);
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < maxLength; i++) {
            double coefficient = coefficient(i) + another.coefficient(i);
            result.append(coefficient);
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        /* TODO */
        int maxLength = Math.max(size, another.size);
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < maxLength; i++) {
            double coefficient = coefficient(i) - another.coefficient(i);
            result.append(coefficient);
        }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        /* TODO */
        int resultSize = size + another.size - 1;
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < resultSize; i++) {
            double coefficient = 0.0;
            for (int j = 0; j <= i; j++) {
                if (j < size && (i - j) < another.size) {
                    coefficient += coefficient(j) * another.coefficient(i - j);
                }
            }
            result.append(coefficient);
        }
        return result;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        /* TODO */
        int newCapacity = coefficents.length * 2;
        coefficents = Arrays.copyOf(coefficents, newCapacity);
    }
}
