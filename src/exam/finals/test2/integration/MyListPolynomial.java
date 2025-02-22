package exam.finals.test2.integration;

import java.util.ArrayList;
import java.util.List;

public class MyListPolynomial extends MyAbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyListPolynomial() {
        /* TODO */
        coefficients = new ArrayList<>();
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     *
     * @return
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        if (index >= 0 && index < coefficients.size()) {
            return coefficients.get(index);
        }
        return 0.0;
    }

    /**
     * Lấy các hệ số của đa thức.
     *
     * @return
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        double[] coeffs = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            coeffs[i] = coefficients.get(i);
        }
        return coeffs;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     *
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public MyListPolynomial append(double coefficient) {
        /* TODO */
        coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * Nếu index nằm ngoài đoạn [0, coefficients.length()] thì không thêm được.
     *
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public MyListPolynomial insert(double coefficient, int index) {
        /* TODO */
        coefficients.add(index, coefficient);
        return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     *
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public MyListPolynomial set(double coefficient, int index) {
        /* TODO */
        coefficients.set(index, coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     *
     * @return
     */
    @Override
    public int degree() {
        /* TODO */
        return coefficients.size() - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     *
     * @return
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double result = 0.0;
        for (int i = 0; i < coefficients.size(); i++) {
            result += coefficients.get(i) * Math.pow(x, i);
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     *
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public MyPolynomial derivative() {
        /* TODO */
        MyListPolynomial derivative = new MyListPolynomial();
        for (int i = 1; i < coefficients.size(); i++) {
            derivative.append(coefficients.get(i) * i);
        }
        return derivative;
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     *
     * @param another
     * @return đa thức hiện tại.
     */
    public MyListPolynomial plus(MyListPolynomial another) {
        /* TODO */
        int maxLength = Math.max(coefficients.size(), another.degree() + 1);
        MyListPolynomial result = new MyListPolynomial();
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
    public MyListPolynomial minus(MyListPolynomial another) {
        /* TODO */
        int maxLength = Math.max(coefficients.size(), another.degree() + 1);
        MyListPolynomial result = new MyListPolynomial();
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
    public MyListPolynomial multiply(MyListPolynomial another) {
        /* TODO */
        int resultSize = coefficients.size() + another.degree() + 1 - 1;
        MyListPolynomial result = new MyListPolynomial();
        for (int i = 0; i < resultSize; i++) {
            double coefficient = 0.0;
            for (int j = 0; j <= i; j++) {
                if (j < coefficients.size() && (i - j) < another.degree() + 1) {
                    coefficient += coefficient(j) * another.coefficient(i - j);
                }
            }
            result.append(coefficient);
        }
        return result;
    }
}
