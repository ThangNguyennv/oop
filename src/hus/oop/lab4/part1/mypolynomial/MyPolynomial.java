package hus.oop.lab4.part1.mypolynomial;

class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int degree = getDegree();
        boolean firstNotZero = false;

        for (int i = degree; i >= 0; i--) {
            double coeff = coeffs[degree - i];
            if (coeff != 0) {
                if (coeff > 0 && firstNotZero) {
                    builder.append(" + ");
                } else if (coeff < 0) {
                    builder.append(" - ");
                }
                coeff = Math.abs(coeff);
                if (i == 0 || coeff != 1) {
                    builder.append(coeff);
                }
                if (i >= 1) {
                    builder.append("x");

                    if (i > 1) {
                        builder.append("^").append(i);
                    }
                }
                firstNotZero = true;
            }
        }
        return builder.toString();
    }

    public double evaluate(double x) {
        double result = 0;
        int degree = getDegree();
        for (int i = degree; i >= 0; i--) {
            result += coeffs[degree - i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int degree1 = getDegree();
        int degree2 = right.getDegree();
        int maxDegree = Math.max(degree1, degree2);
        double[] coefficientArray = new double[maxDegree + 1];
        for (int i = 0; i <= degree1; i++) {
            coefficientArray[maxDegree - degree1 + i] += coeffs[i];
        }
        for (int i = 0; i <= degree2; i++) {
            coefficientArray[maxDegree - degree2 + i] += right.coeffs[i];
        }
        coeffs = coefficientArray;
        return this;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int degree1 = getDegree();
        int degree2 = right.getDegree();
        int resultDegree = degree1 + degree2;
        double[] coefficientArray = new double[resultDegree + 1];
        for (int i = 0; i <= degree1; i++) {
            for (int j = 0; j <= degree2; j++) {
                coefficientArray[i + j] += coeffs[i] * right.coeffs[j];
            }
        }
        coeffs = coefficientArray;
        return this;
    }
}