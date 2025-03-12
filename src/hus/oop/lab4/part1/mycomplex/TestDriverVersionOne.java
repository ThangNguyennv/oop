package hus.oop.lab4.part1.mycomplex;

import java.util.Scanner;

public class TestDriverVersionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Test constructor and toString()

        System.out.println("Enter complex number 1 (real and imaginary part): ");
        System.out.print("Enter the real: ");
        double firstOfRealOfComplexNumber = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the imag: ");
        double firstOfImagOfComplexNumber = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter complex number 2 (real and imaginary part): ");
        System.out.print("Enter the real: ");
        double secondOfRealOfComplexNumber = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the imag: ");
        double secondOfImagOfComplexNumber = Double.parseDouble(scanner.nextLine());

        MyComplexVersionOne firstOfComplexNumber = new MyComplexVersionOne(firstOfRealOfComplexNumber, firstOfImagOfComplexNumber);
        MyComplexVersionOne secondOfComplexNumber = new MyComplexVersionOne(secondOfRealOfComplexNumber, secondOfImagOfComplexNumber);

        // Test isReal() and isImaginary()
        System.out.println("firstOfComplexNumber is: " + firstOfComplexNumber);
        if (!firstOfComplexNumber.isReal()) {
            System.out.println(firstOfComplexNumber + " is NOT a pure real number");
        } else {
            System.out.println(firstOfComplexNumber + " is a pure real number");
        }
        if (!firstOfComplexNumber.isImaginary()) {
            System.out.println(firstOfComplexNumber + " is NOT a pure imaginary number");
        } else {
            System.out.println(firstOfComplexNumber + " is a pure imaginary number");
        }

        System.out.println("secondOfComplexNumber is: " + secondOfComplexNumber);
        if (!secondOfComplexNumber.isReal()) {
            System.out.println(secondOfComplexNumber + " is NOT a pure real number");
        } else {
            System.out.println(secondOfComplexNumber + " is a pure real number");
        }
        if (!secondOfComplexNumber.isImaginary()) {
            System.out.println(secondOfComplexNumber + " is NOT a pure imaginary number");
        } else {
            System.out.println(secondOfComplexNumber + " is a pure imaginary number");
        }

        // Test equals()
        if (!firstOfComplexNumber.equals(secondOfComplexNumber)) {
            System.out.println(firstOfComplexNumber + " is NOT equal to " + secondOfComplexNumber);
        } else {
            System.out.println(firstOfComplexNumber + " is equal to " + secondOfComplexNumber);
        }

        // Test addInto()
        System.out.println(firstOfComplexNumber + " + " + secondOfComplexNumber + " = "
                + firstOfComplexNumber.addInto(secondOfComplexNumber));
        System.out.println("-----------------");
//        System.out.println(mycomplex1.addNew(mycomplex2));
    }
}
