package exam.midterm.test7.polynomial;

public class BisectionSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public BisectionSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức theo phương pháp chia đôi (Bisection)
     * @param polynomial
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        /* TODO */
        double mid = 0;
        for (int i = 0; i < maxIterations; i++) {
            mid = (lower + upper) / 2;
            if (Math.abs(polynomial.evaluate(mid)) <= tolerance || (upper - lower) / 2 < tolerance) {
                return mid;
            }
            if (polynomial.evaluate(mid) * polynomial.evaluate(lower) < 0) {
                upper = mid;
            } else {
                lower = mid;
            }
        }
        return mid;
    }
}
