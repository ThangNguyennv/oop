package exam.finals.test2.integration;

public class SimpsonMethod extends AbstractIntegrator {
    public SimpsonMethod(double precision, int maxIterations) {
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
        int numOfSubIntervals = 2;
        double result = integrate(polynomial, lower, upper, numOfSubIntervals);
        double prevResult;

        int iterations = 0;
        do {
            prevResult = result;
            numOfSubIntervals *= 2;
            result = integrate(polynomial, lower, upper, numOfSubIntervals);
            iterations++;
        } while (iterations < maxIterations && Math.abs(result - prevResult) / 15 >= precision);

        return result;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals (số chẵn) khoảng phân hoạch đều.
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

        for (int i = 0; i < numOfSubIntervals; i += 2) {
            double x0 = lower + i * deltaX;
            double x1 = lower + (i + 1) * deltaX;
            double x2 = lower + (i + 2) * deltaX;

            double y0 = polynomial.evaluate(x0);
            double y1 = polynomial.evaluate(x1);
            double y2 = polynomial.evaluate(x2);

            result += (y0 + 4 * y1 + y2);
        }

        result *= (deltaX / 3.0);

        return result;
    }
}
