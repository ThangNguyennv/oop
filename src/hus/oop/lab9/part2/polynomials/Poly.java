package hus.oop.lab9.part2.polynomials;

public interface Poly {
    int degree();

    Poly derivative();

    double coefficient(int degree);

    double[] coefficients();
}
