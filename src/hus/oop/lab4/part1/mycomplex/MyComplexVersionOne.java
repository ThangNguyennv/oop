package hus.oop.lab4.part1.mycomplex;

public class MyComplexVersionOne {
    private double real;
    private double imag;

    public MyComplexVersionOne() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplexVersionOne(double real, double imag) {
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

    // Mô đun
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public MyComplexVersionOne addInto(MyComplexVersionOne right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public MyComplexVersionOne addNew(MyComplexVersionOne right) {
        return new MyComplexVersionOne(this.real + right.getReal(), this.imag + right.getImag());
    }
}
