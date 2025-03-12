package hus.oop.lab4.part1.mycomplex;

public class MyComplexVersionTwo {
    private double real;
    private double imag;

    public MyComplexVersionTwo() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplexVersionTwo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        if (imag > 0) {
            return "(" + this.real + " + " + this.imag + "i" + ")";
        }
        return "(" + this.real + " - " + Math.abs(this.imag) + "i" + ")";
    }

    public boolean isReal() {
        return this.imag == 0;
    }

    public boolean isImaginary() {
        return this.real == 0;
    }

    public boolean equals(double real, double imag) {
        return this.real == this.imag;
    }

    public boolean equals(MyComplexVersionOne another) {
        return (this.real == another.getReal()) && (this.imag == another.getImag());
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplexVersionTwo add(MyComplexVersionTwo right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public MyComplexVersionTwo addNew(MyComplexVersionTwo right) {
        return new MyComplexVersionTwo(this.real + right.getReal(), this.imag + right.getImag());
    }

    public MyComplexVersionTwo subtract(MyComplexVersionTwo right) {
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }

    public MyComplexVersionTwo subtractNew(MyComplexVersionTwo right) {
        return new MyComplexVersionTwo(this.real - right.getReal(), this.imag - right.getImag());
    }

    // z1 = a + bi,
    // z2 = c + di
    // => z1 * z2 = (a * c - b * d) + (a * d + b * c)i
    public MyComplexVersionTwo multiply(MyComplexVersionTwo right) {
        double realNumber = (this.real * right.getReal()) - (this.imag * right.getImag());
        double imaginaryNumber = (this.real * right.getImag()) + (this.imag * right.getReal());
        this.real = realNumber;
        this.imag = imaginaryNumber;
        return this;
    }

    // z1 = a + bi
    // z2 = c + di
    // z1 / z2 = (z1 * đối z2) / (z2)^2 =  (a * c + b * d) + (b * c - a * d)i / (c^2 + d^2)
    public MyComplexVersionTwo divide(MyComplexVersionTwo right) {
        double temp = (right.getReal() * right.getReal()) + (right.getImag() * right.getImag());
        double realNumber = (real * right.getReal() + imag * right.getImag()) / temp;
        double imaginaryNumber = (imag * right.getReal() - real * right.getImag()) / temp;
        real = realNumber;
        imag = imaginaryNumber;
        return this;
    }

    // Số phức liên hợp
    public MyComplexVersionTwo conjugate() {
        imag = -imag;
        return this;
    }
}
