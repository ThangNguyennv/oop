package exam.finals.test2.integration;

import java.util.Arrays;

public class MyArrayPolynomial extends MyAbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 8;
    private double[] coefficients;
    private int length;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyArrayPolynomial() {
        /* TODO */
        coefficients = new double[DEFAULT_CAPACITY];
        length = 0;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     *
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }
        return coefficients[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     *
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        return Arrays.copyOf(coefficients, length);
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     *
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public MyArrayPolynomial append(double coefficient) {
        /* TODO */
        if (length == coefficients.length) {
            enlarge();
        }
        coefficients[length++] = coefficient;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * Nếu index nằm ngoài đoạn [0, length] thì không thêm được.
     *
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public MyArrayPolynomial insert(double coefficient, int index) {
        /* TODO */
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (length == coefficients.length) {
            enlarge();
        }
        System.arraycopy(coefficients, index, coefficients, index + 1, size - index);
        coefficients[index] = coefficient;
        length++;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     *
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public MyArrayPolynomial set(double coefficient, int index) {
        /* TODO */
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        coefficients[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     *
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        /* TODO */
        return length - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     *
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double result = 0.0;
        for (int i = 0; i < length; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     *
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public MyPolynomial derivative() {
        /* TODO */
        MyArrayPolynomial derivative = new MyArrayPolynomial();
        for (int i = 1; i < length; i++) {
            derivative.append(coefficients[i] * i);
        }
        return derivative;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     *
     * @param another
     * @return đa thức hiện tại.
     */
    public MyArrayPolynomial plus(MyArrayPolynomial another) {
        /* TODO */
        int maxLength = Math.max(length, another.length);
        MyArrayPolynomial result = new MyArrayPolynomial();
        for (int i = 0; i < maxLength; i++) {
            double coefficient = coefficient(i) + another.coefficient(i);
            result.append(coefficient);
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     *
     * @param another
     * @return đa thức hiện tại.
     */
    public MyArrayPolynomial minus(MyArrayPolynomial another) {
        /* TODO */
        int maxLength = Math.max(length, another.length);
        MyArrayPolynomial result = new MyArrayPolynomial();
        for (int i = 0; i < maxLength; i++) {
            double coefficient = coefficient(i) - another.coefficient(i);
            result.append(coefficient);
        }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     *
     * @param another
     * @return đa thức hiện tại.
     */
    public MyArrayPolynomial multiply(MyArrayPolynomial another) {
        /* TODO */
        int resultSize = length + another.length - 1;
        MyArrayPolynomial result = new MyArrayPolynomial();
        for (int i = 0; i < resultSize; i++) {
            double coefficient = 0.0;
            for (int j = 0; j <= i; j++) {
                if (j < length && (i - j) < another.length) {
                    coefficient += coefficient(j) * another.coefficient(i - j);
                }
            }
            result.append(coefficient);
        }
        return result;
    }

    /**
     * Tăng kích thước gấp đôi để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        /* TODO */
        int newCapacity = coefficients.length * 2;
        coefficients = Arrays.copyOf(coefficients, newCapacity);
    }
}
