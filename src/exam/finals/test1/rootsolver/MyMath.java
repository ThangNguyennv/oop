package exam.finals.test1.rootsolver;

public class MyMath {
    public static double sin(double x) {
        /* TODO */
        double sinX = x;
        double term = x;
        int index = 0;
        while (Math.abs(term) > 1e-10) {
            term *= (-x * x) / ((2 * index + 3) * (2 * index + 2));
            sinX += term;
            index++;
        }
        return sinX;
    }

    public static double cos(double x) {
        /* TODO */
        double cosX = 1;
        double term = 1;
        int index = 0;
        while (Math.abs(term) > 1e-10) {
            term *= -x * x / ((2 * index + 2) * (2 * index + 1));
            cosX += term;
            index++;
        }
        return cosX;
    }

    public double exp(double x) {
        /* TODO */
        double e = 1;
        double term = 1;
        int index = 0;
        while (Math.abs(term) > 1e-10) {
            term *= x / (index + 1);
            e += term;
            index++;
        }
        return e;
    }

    public double ln(double x) {
        /* TODO */
        if (x <= 0) {
            throw new IllegalArgumentException("x must be positive");
        }
        double len = x;
        double term = x;
        int index = 1;
        while (Math.abs(term) > 1e-10) {
            term *= (-x * index) / (index + 1);
            len += term;
            index++;
        }
        return len;
    }
}
