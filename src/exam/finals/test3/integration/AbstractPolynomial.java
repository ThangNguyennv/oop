package exam.finals.test3.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     *
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder stringBuilder = new StringBuilder();
        int degree = degree();
        for (int i = 0; i <= degree; i++) {
            double coefficient = coefficient(i);
            if (coefficient != 0) {
                if (!stringBuilder.isEmpty()) {
                    stringBuilder.append(" + ");
                }
                stringBuilder.append(coefficient);
                if (i > 0) {
                    stringBuilder.append("x");
                    if (i > 1) {
                        stringBuilder.append("^").append(i);
                    }
                }
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     *
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        /* TODO */
        int degree = degree();
        if (degree == 0) {
            return new double[]{0.0};
        }
        double[] derivativeCoefficients = new double[degree];
        for (int i = 1; i <= degree; i++) {
            double coefficient = coefficient(i);
            derivativeCoefficients[i - 1] = coefficient * i;
        }
        return derivativeCoefficients;
    }
}
