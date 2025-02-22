package exam.finals.test2.integration;

public class IntegrationCalculator {
    private Integrator integrator;
    private MyPolynomial polynomial;

    /**
     * Hàm dựng, khởi tạo đa thức cần tính tích phân.
     *
     * @param polynomial
     */
    public IntegrationCalculator(MyPolynomial polynomial) {
        /* TODO */
        this.polynomial = polynomial;
    }

    /**
     * Hàm dựng, khởi tạo phương pháp tính tích phân và đa thức cần tính tích phân.
     *
     * @param integrator
     * @param polynomial
     */
    public IntegrationCalculator(Integrator integrator, MyPolynomial polynomial) {
        /* TODO */
        this.integrator = integrator;
        this.polynomial = polynomial;
    }

    public void setPolynomial(MyPolynomial polynomial) {
        /* TODO */
        this.polynomial = polynomial;
    }

    public void setIntegrator(Integrator integrator) {
        /* TODO */
        this.integrator = integrator;
    }

    public double integrate(double lower, double upper) {
        /* TODO */
        if (integrator == null) {
            throw new IllegalStateException("No integrator set.");
        }

        if (polynomial == null) {
            throw new IllegalStateException("No polynomial set.");
        }
        return integrator.integrate(polynomial, lower, upper);
    }
}
