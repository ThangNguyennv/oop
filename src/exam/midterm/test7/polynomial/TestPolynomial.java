package exam.midterm.test7.polynomial;

import java.util.Arrays;

public class TestPolynomial {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
           (ví dụ, NguyenVanA_123456_MyList.txt)
         - Nộp kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
//        testRootSolver();
//        testArrayPolynomial();
//        testListPolynomial();
    }

    public static void testArrayPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        // Tạo đa thức poly1: 1 + 2x + 3x^2
        ArrayPolynomial poly1 = new ArrayPolynomial();
        poly1.append(1.0).append(2.0).append(3.0);
        System.out.println("poly1: " + Arrays.toString(poly1.coefficients()));
        // Test chèn: chèn 4.0 vào vị trí 1
        poly1.insert(4.0, 1);
        System.out.println("poly1 sau khi chèn 4.0 tại index 1: " + Arrays.toString(poly1.coefficients()));
        // Kết quả mong đợi: [1.0, 4.0, 2.0, 3.0]

        // Test sửa hệ số: đổi hệ số tại index 2 thành 5.0
        poly1.set(5.0, 2);
        System.out.println("poly1 sau khi set index 2 thành 5.0: " + Arrays.toString(poly1.coefficients()));
        // Kết quả mong đợi: [1.0, 4.0, 5.0, 3.0]

        // Tạo đa thức poly2: 0 + 1x + 1x^2
        ArrayPolynomial poly2 = new ArrayPolynomial();
        poly2.append(0.0).append(1.0).append(1.0);
        System.out.println("poly2: " + Arrays.toString(poly2.coefficients()));
        // Kết quả mong đợi: [0.0, 1.0, 1.0]

        // Test cộng: poly1 + poly2
        ArrayPolynomial sum = poly1.plus(poly2);
        System.out.println("poly1 + poly2: " + Arrays.toString(sum.coefficients()));
        // Test cộng từng hệ số: [1+0, 4+1, 5+1, 3+0] => [1.0, 5.0, 6.0, 3.0]

        // Test trừ: poly1 - poly2
        ArrayPolynomial diff = poly1.minus(poly2);
        System.out.println("poly1 - poly2: " + Arrays.toString(diff.coefficients()));
        // Test trừ từng hệ số: [1-0, 4-1, 5-1, 3-0] => [1.0, 3.0, 4.0, 3.0]

        // Test nhân: poly1 * poly2
        ArrayPolynomial prod = poly1.multiply(poly2);
        System.out.println("poly1 * poly2: " + Arrays.toString(prod.coefficients()));
        // Kết quả tính nhân đa thức (xem chi tiết trong thuật toán nhân)

        // Test tính giá trị của poly1 tại x = 2
        double eval = poly1.evaluate(2.0);
        System.out.println("poly1 evaluated at x = 2: " + eval);

        // Test đạo hàm của poly1
        ArrayPolynomial derivative = (ArrayPolynomial) poly1.derivative();
        System.out.println("Đạo hàm của poly1: " + Arrays.toString(derivative.coefficients()));
    }

    public static void testListPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */

        // Tạo đa thức poly1: 1 + 2x + 3x^2
        ListPolynomial poly1 = new ListPolynomial();
        poly1.append(1.0).append(2.0).append(3.0);
        System.out.println("poly1: " + Arrays.toString(poly1.coefficients()));
        // Test chèn: chèn 4.0 vào vị trí 1
        poly1.insert(4.0, 1);
        System.out.println("poly1 sau khi chèn 4.0 tại index 1: " + Arrays.toString(poly1.coefficients()));
        // Kết quả mong đợi: [1.0, 4.0, 2.0, 3.0]

        // Test sửa hệ số: đổi hệ số tại index 2 thành 5.0
        poly1.set(5.0, 2);
        System.out.println("poly1 sau khi set index 2 thành 5.0: " + Arrays.toString(poly1.coefficients()));
        // Kết quả mong đợi: [1.0, 4.0, 5.0, 3.0]

        // Tạo đa thức poly2: 0 + 1x + 1x^2
        ListPolynomial poly2 = new ListPolynomial();
        poly2.append(0.0).append(1.0).append(1.0);
        System.out.println("poly2: " + Arrays.toString(poly2.coefficients()));
        // Kết quả mong đợi: [0.0, 1.0, 1.0]

        // Test cộng: poly1 + poly2
        ListPolynomial sum = poly1.plus(poly2);
        System.out.println("poly1 + poly2: " + Arrays.toString(sum.coefficients()));
        // Test cộng từng hệ số: [1+0, 4+1, 5+1, 3+0] => [1.0, 5.0, 6.0, 3.0]

        // Test trừ: poly1 - poly2
        ListPolynomial diff = poly1.minus(poly2);
        System.out.println("poly1 - poly2: " + Arrays.toString(diff.coefficients()));
        // Test trừ từng hệ số: [1-0, 4-1, 5-1, 3-0] => [1.0, 3.0, 4.0, 3.0]

        // Test nhân: poly1 * poly2
        ListPolynomial prod = poly1.multiply(poly2);
        System.out.println("poly1 * poly2: " + Arrays.toString(prod.coefficients()));
        // Kết quả tính nhân đa thức (xem chi tiết trong thuật toán nhân)

        // Test tính giá trị của poly1 tại x = 2
        double eval = poly1.evaluate(2.0);
        System.out.println("poly1 evaluated at x = 2: " + eval);

        // Test đạo hàm của poly1
        ListPolynomial derivative = (ListPolynomial) poly1.derivative();
        System.out.println("Đạo hàm của poly1: " + Arrays.toString(derivative.coefficients()));
    }

    public static void testRootSolver() {
        /*
         TODO

         - Tạo đa thức có nghiệm trong khoảng [a, b] nào đó.
         - Viết chương trình tìm nghiệm của đa thức theo các phương pháp đã cho (Bisection, Newton-Raphson, Secant) sử dụng
           PolynomialRootFinding. Các phương pháp tìm nghiệm của thể thay đổi ở thời gian chạy chương trình.
         - In ra phương pháp sử dụng, đa thức, và nghiệm của đa thức.
         */

        ArrayPolynomial polynomial = new ArrayPolynomial();
        polynomial.append(-12).append(2);

        RootSolver bisectionSolver = new BisectionSolver(1e-6, 1000);
        RootSolver secantSolver = new SecantSolver(1e-6, 1000);
        RootSolver newtonRaphsonSolver = new NewtonRaphsonSolver(1e-6, 1000);

        PolynomialRootFinding rootFinding = new PolynomialRootFinding(polynomial, bisectionSolver);
        System.out.println("Bisection Solver: root = " + rootFinding.solve(0, 10));

        rootFinding.setRootSolver(secantSolver);
        System.out.println("Secant Solver: root = " + rootFinding.solve(0, 10));

        rootFinding.setRootSolver(newtonRaphsonSolver);
        System.out.println("Newton-Raphson Solver: root = " + rootFinding.solve(0, 10));

    }
}
