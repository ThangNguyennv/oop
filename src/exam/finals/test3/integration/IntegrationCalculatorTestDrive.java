package exam.finals.test3.integration;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
           (ví dụ, NguyenVanA_123456_Integration.txt)
         - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */

        testArrayPolynomial();
        testListPolynomial();
        testIntegrationCalculator();
    }

    public static void testArrayPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */

        // Create polynomials
        ArrayPolynomial polynomial1 = new ArrayPolynomial();
        polynomial1.append(2); // 2x^0 = 2
        polynomial1.append(3); // 3x^1 = 3x

        ArrayPolynomial polynomial2 = new ArrayPolynomial();
        polynomial2.append(1); // 1x^0 = 1
        polynomial2.append(4); // 4x^1 = 4x

        // Print the initial polynomials
        System.out.println("Polynomial 1: " + polynomial1.toString());
        System.out.println("Polynomial 2: " + polynomial2.toString());

        // Test adding an element to a polynomial
        polynomial1.append(5); // 5x^2 = 5x^2
        System.out.println("Polynomial 1 after appending: " + polynomial1.toString());

        // Test inserting an element at a specific index in a polynomial
        polynomial1.insert(6, 1); // Insert 6x^1 at index 1: 2 + 6x + 3x = 6x^1 + 2 + 3x
        System.out.println("Polynomial 1 after inserting: " + polynomial1.toString());

        // Test setting the coefficient at a specific index in a polynomial
        polynomial1.set(4, 0); // Set coefficient at index 0 to 4: 4x^0 + 6x^1 + 2 + 3x = 4 + 6x + 2 + 3x
        System.out.println("Polynomial 1 after setting: " + polynomial1.toString());

        // Test adding two polynomials
        ArrayPolynomial sum = polynomial1.plus(polynomial2);
        System.out.println("Polynomial sum: " + sum.toString());

        // Test subtracting two polynomials
        ArrayPolynomial difference = polynomial1.minus(polynomial2);
        System.out.println("Polynomial minus: " + difference.toString());

        // Test multiplying two polynomials
        ArrayPolynomial product = polynomial1.multiply(polynomial2);
        System.out.println("Polynomial multi: " + product.toString());

        // Test evaluating the polynomial at a specific value of x
        double x = 2.0;
        double result = polynomial1.evaluate(x);
        System.out.println("Polynomial 1 evaluated at x = " + x + ": " + result);
    }

    public static void testListPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */

        // Create polynomials
        ListPolynomial polynomial1 = new ListPolynomial();
        polynomial1.append(2); // 2x^0 = 2
        polynomial1.append(3); // 3x^1 = 3x

        ListPolynomial polynomial2 = new ListPolynomial();
        polynomial2.append(1); // 1x^0 = 1
        polynomial2.append(4); // 4x^1 = 4x

        // Print the initial polynomials
        System.out.println("Polynomial 1: " + polynomial1.toString());
        System.out.println("Polynomial 2: " + polynomial2.toString());

        // Test adding an element to a polynomial
        polynomial1.append(5); // 5x^2 = 5x^2
        System.out.println("Polynomial 1 after appending: " + polynomial1.toString());

        // Test inserting an element at a specific index in a polynomial
        polynomial1.insert(6, 1); // Insert 6x^1 at index 1: 2 + 6x + 3x = 6x^1 + 2 + 3x
        System.out.println("Polynomial 1 after inserting: " + polynomial1.toString());

        // Test setting the coefficient at a specific index in a polynomial
        polynomial1.set(4, 0); // Set coefficient at index 0 to 4: 4x^0 + 6x^1 + 2 + 3x = 4 + 6x + 2 + 3x
        System.out.println("Polynomial 1 after setting: " + polynomial1.toString());

        // Test adding two polynomials
        ListPolynomial sum = polynomial1.plus(polynomial2);
        System.out.println("Polynomial sum: " + sum.toString());

        // Test subtracting two polynomials
        ListPolynomial difference = polynomial1.minus(polynomial2);
        System.out.println("Polynomial difference: " + difference.toString());

        // Test multiplying two polynomials
        ListPolynomial product = polynomial1.multiply(polynomial2);
        System.out.println("Polynomial product: " + product.toString());

        // Test evaluating the polynomial at a specific value of x
        double x = 2.0;
        double result = polynomial1.evaluate(x);
        System.out.println("Polynomial 1 evaluated at x = " + x + ": " + result);
    }

    public static void testIntegrationCalculator() {
        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */

        // Create a polynomial
        ArrayPolynomial polynomial = new ArrayPolynomial();
        polynomial.append(2); // 2x^0 = 2
        polynomial.append(3); // 3x^1 = 3x
        polynomial.append(4); // 4x^2 = 4x^2
        System.out.println(polynomial);
        // Create an integration calculator
        IntegrationCalculator calculator = new IntegrationCalculator(polynomial);

        // Set the integration method (can be changed at runtime)
        Integrator method;

        // Calculate the definite integral using Midpoint Rule
        method = new MidpointRule(0.0001, 50);
        calculator.setIntegrator(method);
        double lowerBound = 0.0;
        double upperBound = 1.0;
        double result = calculator.integrate(lowerBound, upperBound);
        System.out.println("Integration Method: " + method.getClass().getSimpleName());
        System.out.println("Polynomial: " + polynomial.toString());
        System.out.println("Definite Integral from " + lowerBound + " to " + upperBound + ": " + result);

        // Calculate the definite integral using Trapezoid Rule
        method = new TrapezoidRule(0.0001, 50);
        calculator.setIntegrator(method);
        result = calculator.integrate(lowerBound, upperBound);
        System.out.println("Integration Method: " + method.getClass().getSimpleName());
        System.out.println("Polynomial: " + polynomial.toString());
        System.out.println("Definite Integral from " + lowerBound + " to " + upperBound + ": " + result);

        // Calculate the definite integral using Simpson's Rule
        method = new SimpsonRule(0.0001, 50);
        calculator.setIntegrator(method);
        result = calculator.integrate(lowerBound, upperBound);
        System.out.println("Integration Method: " + method.getClass().getSimpleName());
        System.out.println("Polynomial: " + polynomial.toString());
        System.out.println("Definite Integral from " + lowerBound + " to " + upperBound + ": " + result);
    }
}
