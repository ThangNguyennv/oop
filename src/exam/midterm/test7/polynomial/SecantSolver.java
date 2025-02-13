package exam.midterm.test7.polynomial;

public class SecantSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     *
     * @param tolerance
     * @param maxIterations
     */
    public SecantSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức theo phương pháp Secant
     *
     * @param polynomial
     * @param lower
     * @param upper
     * @return nghiệm của đa thức trong khoảng [lower, upper]
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        /* TODO */
        double x0 = lower;
        double x1 = upper;
        double x2 = 0;

        for (int i = 0; i < maxIterations; i++) {
            double f0 = polynomial.evaluate(x0);
            double f1 = polynomial.evaluate(x1);

            if (Math.abs(f1 - f0) < tolerance) {
                break;
            }

            x2 = x1 - f1 * (x1 - x0) / (f1 - f0);

            if (Math.abs(x2 - x1) < tolerance) {
                return x2;
            }

            x0 = x1;
            x1 = x2;
        }

        return x2;
    }
}
