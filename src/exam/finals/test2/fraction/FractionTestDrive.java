package exam.finals.test2.fraction;

import java.util.Random;

public class FractionTestDrive {
    public static void main(String[] args) {
        /*
        TODO:
        1. Sinh ngẫu nhiên một số tự nhiên nằm trong đoạn [30, 50], lưu giá trị vào biến numbers.
        2. Tạo ra numbers phân số, trong đó tử số và mẫu số được sinh ngẫu nhiên là các số tự nhiên nằm trong đoạn [1, 100].
           Lưu các phân số vào trong một tập dữ liệu DataSet, được gọi là dataSet.

        3. Sắp xếp và in ra tập dữ liệu đã tạo ra theo các tiêu chí sau:
             - In ra các phân số theo thứ tự có giá trị tăng dần, nếu phân số bằng nhau thì được sắp xếp theo thứ tự
               có giá trị tăng dần của mẫu số.
             - In ra các phân số theo thứ tự có giá trị giảm dần, nếu phân số bằng nhau thì được sắp xếp theo thứ tự
               có giá trị giảm dần của mẫu số.

         4. In ra các dữ liệu sau:
             - In ra các phân số tối giản của các phân số đã tạo ra theo thứ tự trong dữ liệu gốc.
             - In ra các phân số tối giản theo thứ tự tăng dần.
             - In ra các phân số tối giản theo thứ tự giảm dần.

         5. - Chạy chương trình và lưu kết quả chạy chương trình và file text được đặt tên
              là <TenSinhVien_MaSinhVien_Fraction>.txt (Ví dụ, NguyenVanA_123456_Fraction.txt).
            - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
              <TenSinhVien_MaSinhVien_Fraction>.zip (Ví dụ, NguyenVanA_123456_Fraction.zip),
              nộp lên classroom.
         */
        Random random = new Random();
        Random numeratorRandom = new Random();
        Random denominatorRandom = new Random();
        DataSet dataSet1 = new DataSet();
        DataSet dataSet2 = dataSet1;
        int numbers = 30 + random.nextInt(21);
        for (int i = 0; i < numbers; i++) {
            int numeratorNumber = 1 + numeratorRandom.nextInt(100);
            int denominatorNumber = 1 + denominatorRandom.nextInt(100);
            dataSet1.append(new Fraction(numeratorNumber, denominatorNumber));
        }

        // Ý 3:
        Fraction[] array = dataSet1.sortIncreasing();
        System.out.println("Phân số sau khi sắp xếp tăng dần là: ");
        for (Fraction item : array) {
            System.out.println(item + " ");
        }

        System.out.println("-------------------");

        System.out.println("Phân số sau khi sắp xếp giảm dần là: ");
        array = dataSet1.sortDecreasing();
        for (Fraction item : array) {
            System.out.println(item + " ");
        }

        System.out.println("-------------------");

        // Ý 4:
        System.out.println("Phân số sau khi tối giản theo dữ liệu gốc là: ");
        DataSet testSimplify = dataSet2.toSimplify();
        System.out.println(testSimplify.toString());

        System.out.println("-------------------");

        System.out.println("Phân số sau khi tối giản được sắp xếp tăng dần là: ");
        array = testSimplify.sortIncreasing();
        for (Fraction item : array) {
            System.out.println(item + " ");
        }

        System.out.println("-------------------");

        System.out.println("Phân số sau khi tối giản được sắp xếp giảm dần là: ");
        array = testSimplify.sortDecreasing();
        for (Fraction item : array) {
            System.out.println(item + " ");
        }

    }
}
