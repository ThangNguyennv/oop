package exam.finals.test3.integration;

public class MidpointRule implements Integrator {
    private double precision;
    private int maxIterations;

    public MidpointRule(double precision, int maxIterations) {
        /* TODO */
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     *
     * @param poly
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        /* TODO */
        int numOfSubIntervals = 1;
        double result = integrate(poly, lower, upper, numOfSubIntervals);
        double prevResult;

        int iterations = 0;
        do {
            prevResult = result;
            numOfSubIntervals *= 2;
            result = integrate(poly, lower, upper, numOfSubIntervals);
            iterations++;
        } while (iterations < maxIterations && Math.abs(result - prevResult) / 3 >= precision);

        return result;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals khoảng phân hoạch đều.
     *
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        /* TODO */
        double deltaX = (upper - lower) / numOfSubIntervals;
        double result = 0.0;
        for (int i = 0; i < numOfSubIntervals; i++) {
            double x0 = lower + i * deltaX;
            double x1 = lower + (i + 1) * deltaX;
            double midPoint = (x0 + x1) / 2.0;

            result += poly.evaluate(midPoint);
        }

        result *= deltaX;

        return result;
    }
}
