package hus.oop.lab2homework.part5;

import java.util.*;

public class MathLibraryHomework {
    static Scanner sc = new Scanner(System.in);

    //bai5.1
    public static double sin(double x, int numTerms) {
        double Sk = x;
        double sin = Sk;
        for (int k = 2; k <= numTerms; k++) {
            Sk = (Sk * (-1) * x * x) / ((2 * k - 1) * (2 * k - 2));
            sin = sin + Sk;
        }
        return sin;
    }

    public static double cos(double x, int numTerms) {
        double Sk = 1;
        double cos = Sk;
        for (int k = 1; k < numTerms; k++) {
            Sk = (Sk * (-1) * x * x) / ((2 * k) * (2 * k - 1));
            cos = cos + Sk;
        }
        return cos;
    }

    public static void testTrigonometric() {
        System.out.print("Enter the number of terms for the series approximation: ");
        int numTerms = sc.nextInt();

        // Array of test angles: 0, π/6, π/4, π/3, π/2
        double[] angles = {0, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2};

        System.out.println("Comparing series approximation with Math.sin() and Math.cos():");
        for (double x : angles) {
            double sinSeries = sin(x, numTerms);
            double cosSeries = cos(x, numTerms);
            double sinMath = Math.sin(x);
            double cosMath = Math.cos(x);

            System.out.printf("x = %.5f (%.2f degrees)%n", x, Math.toDegrees(x));
            System.out.printf("Series approximation: sin(x) = %.8f, cos(x) = %.8f%n", sinSeries, cosSeries);
            System.out.printf("Math methods:       sin(x) = %.8f, cos(x) = %.8f%n", sinMath, cosMath);
            System.out.println("------------------------------------------------------");
        }
    }

    //bai5.2
    public static double specialSeries(double x, int numTerms) {
        double sum = x;
        double numerator = 1.0;
        double denominator = 1.0;
        double power = x;

        for (int n = 1; n < numTerms; n++) {
            power *= x * x;  // x^(2n+1)
            numerator *= (2 * n - 1); // 1 * 3 * 5 * ...
            denominator *= (2 * n);   // 2 * 4 * 6 * ...
            sum += (numerator / denominator) * (power / (2 * n + 1));
        }

        return sum;
    }

    public static void testSpecialSeries() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x (-1 ≤ x ≤ 1): ");
        double x = scanner.nextDouble();
        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();

        if (x < -1 || x > 1) {
            System.out.println("x must be in the range -1 to 1 for convergence.");
            return;
        }

        double seriesSum = specialSeries(x, numTerms);
        System.out.println("The sum of the series is: " + seriesSum);
    }

    //bai5.3
    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void factorialInt() {
        int number = 1;
        while (true) {
            System.out.println("The factorial of " + number + " is " + factorial(number));
            if ((Integer.MAX_VALUE / factorial(number)) < (number + 1)) {
                break;
            }
            number++;
        }
        System.out.println("The factorial of " + (number + 1) + " is out of range");
    }

    public static void factorialLong() {
        int number = 1;
        while (true) {
            System.out.println("The factorial of " + number + " is " + factorial(number));
            if ((Long.MAX_VALUE / factorial(number)) < (number + 1)) {
                break;
            }
            number++;
        }
        System.out.println("The factorial of " + (number + 1) + " is out of range");
    }

    //bai5.4
    public static void fibonacciInt() {
        int f0 = 1;
        int f1 = 1;
        int index = 0;

        // Print the first two Fibonacci numbers
        System.out.println("F(" + index + ") = " + f0);
        index++;
        System.out.println("F(" + index + ") = " + f1);
        index++;

        // Compute subsequent Fibonacci numbers until the next would overflow
        while (true) {
            // Before computing f2 = f0 + f1, check for overflow.
            // Overflow occurs if Integer.MAX_VALUE - f1 < f0
            if (Integer.MAX_VALUE - f1 < f0) {
                System.out.println("F(" + index + ") is out of the range of int");
                break;
            }

            int f2 = f0 + f1;
            System.out.println("F(" + index + ") = " + f2);

            // Update for next iteration
            f0 = f1;
            f1 = f2;
            index++;
        }
    }

    public static void tribonacciInt() {
        // Define the initial Tribonacci values
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        int index = 0;

        // Print the initial values
        System.out.println("T(" + index + ") = " + t0);  // T(0)
        index++;
        System.out.println("T(" + index + ") = " + t1);  // T(1)
        index++;
        System.out.println("T(" + index + ") = " + t2);  // T(2)
        index++;

        // Loop to compute subsequent Tribonacci numbers
        while (true) {
            // Before computing t3 = t0 + t1 + t2, check if it would overflow an int.
            // Use long arithmetic for the check.
            if ((long) t0 + t1 + t2 > Integer.MAX_VALUE) {
                System.out.println("T(" + index + ") is out of the range of int");
                break;
            }

            int t3 = t0 + t1 + t2;
            System.out.println("T(" + index + ") = " + t3);
            index++;

            // Shift the window for the next term
            t0 = t1;
            t1 = t2;
            t2 = t3;
        }
    }

    //bai5.5
    public static String toRadix(String in, int inRadix, int outRadix) {
        // Convert the input string from the given radix to a decimal integer
        int decimalValue = Integer.parseInt(in, inRadix);

        // Convert the decimal integer to the output radix and return as a string
        return Integer.toString(decimalValue, outRadix).toUpperCase(); // Convert to uppercase for consistency
    }

    public static void testNumberConversion() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number and radix: ");
        String inputNumber = scanner.next();

        System.out.print("Enter the input radix: ");
        int inputRadix = scanner.nextInt();

        System.out.print("Enter the output radix: ");
        int outputRadix = scanner.nextInt();

        try {
            String convertedNumber = toRadix(inputNumber, inputRadix, outputRadix);
            System.out.println("\"" + inputNumber + "\"" + " in radix " +
                    "\"" + inputRadix + "\"" + " is " + "\"" +
                    convertedNumber + "\"" + " in radix " + "\"" + outputRadix + "\"");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input number or radix.");
        }
    }

    public static void main(String[] args) {
        testTrigonometric();
        factorialInt();
        factorialLong();
        fibonacciInt();
        tribonacciInt();
        testSpecialSeries();
        testNumberConversion();
    }
}
