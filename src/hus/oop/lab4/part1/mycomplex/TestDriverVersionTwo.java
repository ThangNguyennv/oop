package hus.oop.lab4.part1.mycomplex;

import java.util.Scanner;

public class TestDriverVersionTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Test constructor and toString()
        System.out.println("Enter complex number 1 (real and imaginary part): ");
        System.out.print("Enter the real part: ");
        double firstComplexNumberRealPart = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the imaginary part: ");
        double firstComplexNumberImaginaryPart = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter complex number 2 (real and imaginary part): ");
        System.out.print("Enter the real: ");
        double secondComplexNumberRealPart = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the imaginary part: ");
        double secondComplexNumberImaginaryPart = Double.parseDouble(scanner.nextLine());

        MyComplexVersionTwo firstComplexNumber = new MyComplexVersionTwo(firstComplexNumberRealPart,
                firstComplexNumberImaginaryPart);
        MyComplexVersionTwo secondComplexNumber = new MyComplexVersionTwo(secondComplexNumberRealPart,
                secondComplexNumberImaginaryPart);

        // Test isReal() and isImaginary()
        System.out.println("The first complex number is: " + firstComplexNumber);
        if (!firstComplexNumber.isReal()) {
            System.out.println(firstComplexNumber + " is NOT a pure real number");
        } else {
            System.out.println(firstComplexNumber + " is a pure real number");
        }
        if (!firstComplexNumber.isImaginary()) {
            System.out.println(firstComplexNumber + " is NOT a pure imaginary number");
        } else {
            System.out.println(firstComplexNumber + " is a pure imaginary number");
        }

        System.out.println("The second complex number is: " + secondComplexNumber);
        if (!secondComplexNumber.isReal()) {
            System.out.println(secondComplexNumber + " is NOT a pure real number");
        } else {
            System.out.println(secondComplexNumber + " is a pure real number");
        }
        if (!secondComplexNumber.isImaginary()) {
            System.out.println(secondComplexNumber + " is NOT a pure imaginary number");
        } else {
            System.out.println(secondComplexNumber + " is a pure imaginary number");
        }

        // Test equals()
        if (!firstComplexNumber.equals(secondComplexNumber)) {
            System.out.println(firstComplexNumber + " is NOT equal to " + secondComplexNumber);
        } else {
            System.out.println(firstComplexNumber + " is equal to " + secondComplexNumber);
        }

        // Test add()
        System.out.println(firstComplexNumber + " + " + secondComplexNumber +
                " = " + firstComplexNumber.add(secondComplexNumber));

        // Test subtract()
        System.out.println(firstComplexNumber + " - " + secondComplexNumber +
                " = " + firstComplexNumber.subtract(secondComplexNumber));

        // Test multiply()
        System.out.println(firstComplexNumber + " * " + secondComplexNumber +
                " = " + firstComplexNumber.multiply(secondComplexNumber));

        // Test divide()
        System.out.println(firstComplexNumber + " / " + secondComplexNumber +
                " = " + firstComplexNumber.divide(secondComplexNumber));

        System.out.println("Conjugate of " + firstComplexNumber +
                " is: " + firstComplexNumber.conjugate());
    }
}
