package exam.finals.test3.matrix;

import java.util.Arrays;

public class SquareMatrixTestDrive {
    public static void main(String[] args) {
        /* TODO
        Tạo ra 2 ma trận có cùng kích thước là một số ngẫu nhiên nằm trong đoạn [5, 10].
        Viết code thực hiện test các chức năng sau của các ma trận:
          - In ra 2 ma trận và 2 ma trận chuyển vị tương ứng.
          - In ra các đường chéo chính và đường chéo phụ của 2 ma trận.
          - In ra ma trận là ma trận tổng của 2 ma trận.
          - In ra ma trận là ma trận là hiệu của ma trận thứ nhất cho ma trận thứ 2.
          - In ra ma trận là ma trận tích của 2 ma trận.
          - In ra các số nguyên tố có trong 2 ma trận.

         Lưu kết quả chạy chương trình trên terminal vào file text và nộp cùng source code chương trình.
         File text kết quả được đặt tên như sau: <TenSinhVien_MaSinhVien_Matrix.txt> (Ví dụ, NguyenVanA_123456_Matrix.txt).
         */

        int size = 3; // Kích thước ma trận trong đoạn [5, 10]

        SquareMatrix matrix1 = new SquareMatrix(size);
        SquareMatrix matrix2 = new SquareMatrix(size);

        System.out.println("Ma trận thứ nhất:");
        System.out.println(matrix1);

        System.out.println("Ma trận thứ hai:");
        System.out.println(matrix2);

        System.out.println("Ma trận chuyển vị của ma trận 1 là: ");
        System.out.println(matrix1.transpose());

        System.out.println("Ma trận chuyển vị của ma trận 2 là: ");
        System.out.println(matrix2.transpose());

        System.out.println("Các phần tử trên đường chéo chính của ma trận 1: ");
        System.out.println(Arrays.toString(matrix1.principalDiagonal()));

        System.out.println("Các phần tử trên đường chéo phụ của ma trận 1: ");
        System.out.println(Arrays.toString(matrix1.secondaryDiagonal()));

        System.out.println("Các phần tử trên đường chéo chính của ma trận 2: ");
        System.out.println(Arrays.toString(matrix2.principalDiagonal()));

        System.out.println("Các phần tử trên đường chéo phụ của ma trận 2: ");
        System.out.println(Arrays.toString(matrix2.secondaryDiagonal()));

        System.out.println("Phép cộng ma trận 1 và 2 ta được ma trận: ");
        System.out.println(matrix1.add(matrix2));

        System.out.println("Phép trừ ma trận 1 cho 2 ta được ma trận: ");
        System.out.println(matrix1.minus(matrix2));

        System.out.println("Phép nhân ma trận 1 cho 2 ta được ma trận: ");
        System.out.println(matrix1.multiply(matrix2));

        System.out.println("Các số nguyên tố trong ma trận 1 là: ");
        System.out.println(Arrays.toString(matrix1.primes()));

        System.out.println("Các số nguyên tố trong ma trận 2 là: ");
        System.out.println(Arrays.toString(matrix2.primes()));
    }
}
