package exam.midterm.test7.polynomial;

public class NewtonRaphsonSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public NewtonRaphsonSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức sử dụng phương pháp Newton-Raphson.
     * @param polynomial
     * @param lower
     * @param upper
     * @return nghiệm của đa thức.
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        /* TODO */
        double x = lower;
        for (int i = 0; i < maxIterations; i++) {
            double f = polynomial.evaluate(x);
            double df = (polynomial.evaluate(x + tolerance) - f) / tolerance;

            if (Math.abs(f) < tolerance) {
                return x;
            }

            x = x - f / df;

            if (Math.abs(f / df) < tolerance) {
                return x;
            }
        }
        return x;
    }
}
