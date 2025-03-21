package exam.finals.test2.integration;

public class MidpointMethod extends AbstractIntegrator {
    public MidpointMethod(double precision, int maxIterations) {
        /* TODO */
        super(precision, maxIterations);
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng lặp vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n_0 tùy ý, sau đó tính I_n với n = n_0, 2n_0, 4n_0, ...
     * Việc tính toán dừng lại khi |I_2n - I_n|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     *
     * @param polynomial
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(MyPolynomial polynomial, double lower, double upper) {
        /* TODO */
        int numOfSubIntervals = 1;
        double result = integrate(polynomial, lower, upper, numOfSubIntervals);
        double prevResult;

        int iterations = 0;
        do {
            prevResult = result;
            numOfSubIntervals *= 2;
            result = integrate(polynomial, lower, upper, numOfSubIntervals);
            iterations++;
        } while (iterations < maxIterations && Math.abs(result - prevResult) / 3 >= precision);

        return result;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals khoảng phân hoạch đều.
     *
     * @param polynomial
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(MyPolynomial polynomial, double lower, double upper, int numOfSubIntervals) {
        /* TODO */
        double deltaX = (upper - lower) / numOfSubIntervals;
        double result = 0.0;
        for (int i = 0; i < numOfSubIntervals; i++) {
            double x0 = lower + i * deltaX;
            double x1 = lower + (i + 1) * deltaX;
            double midPoint = (x0 + x1) / 2.0;

            result += polynomial.evaluate(midPoint);
        }

        result *= deltaX;

        return result;
    }
}
