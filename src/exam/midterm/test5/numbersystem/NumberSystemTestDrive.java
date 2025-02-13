package exam.midterm.test5.numbersystem;

import java.util.Random;

public class NumberSystemTestDrive {
    public static void main(String[] args) {
        /* Yêu cầu:

        - Sinh ngẫu nhiên 3 số bằng cách:
            - Cơ số radix là một số tự nhiên nằm trong đoạn [2, 16] được sinh ngẫu nhiên.
            - Xâu ký tự biểu diễn số được sinh ra bằng cách:
                + Độ dài số là một số tự nhiên nằm trong đoạn [10, 30] được sinh ra ngẫu nhiên.
                + Mỗi chữ số được sinh ra bằng cách: sinh ra một chỉ số ngẫu nhiên nằm trong đoạn [0, radix - 1],
                  sau đó lấy tương ứng với chỉ số đó một chữ số nằm trong xâu "0123456789ABCDEF".

        - Mỗi lần sinh ra một số và một cơ số mới, thực hiện việc cập nhật và in ra các số được chuyển đổi
          tự động sang các số được biểu diễn trong hệ cơ số 2, 8, 16.

        - Thực hiện chạy chương trình để in ra terminal thông tin về các số ban đầu và các số chuyển đổi, ví dụ:
          Original number: 123456
          radix 12
          Binary: 1111111
          Octal: 7777777
          Hexadecimal: FFFFFF

          Original number: 456789
          radix 7
          Binary: 1111111
          Octal: 7777777
          Hexadecimal: FFFFFF

          Lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_NumberSystemConverter>.txt (Ví dụ, NguyenVanA_123456_NumberSystemConverter.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_NumberSystemConverter>.zip (Ví dụ, NguyenVanA_123456_NumberSystemConverter.zip),
          nộp lên classroom.
         */

        Random random = new Random();
        // Xâu chứa các ký tự được sử dụng để biểu diễn số
        String digits = "0123456789ABCDEF";
        // Số lượng số cần sinh
        int numberOfNumbers = 3;

        for (int i = 0; i < numberOfNumbers; i++) {
            // Sinh ngẫu nhiên cơ số trong đoạn [2, 16]
            int radix = 2 + random.nextInt(15);

            // Sinh ngẫu nhiên độ dài số trong đoạn [10, 30]
            int length = 10 + random.nextInt(21);

            // Sinh ngẫu nhiên xâu ký tự biểu diễn số
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < length; j++) {
                // Sinh ra chỉ số ngẫu nhiên trong đoạn [0, radix - 1]
                int index = random.nextInt(radix);
                sb.append(digits.charAt(index));
            }
            String numberRepresentation = sb.toString();

            // In ra thông tin số ban đầu
            System.out.println("Original number: " + numberRepresentation);
            System.out.println("radix " + radix);

            System.out.println("--------------------------------------------");

            // Tạo đối tượng số ban đầu
            OriginalNumber originalNumber = new OriginalNumber(numberRepresentation, radix);

            // Tạo các converter (observer) cho hệ cơ số 2, 8, 16
            BinaryConverter binaryConverter = new BinaryConverter(originalNumber);
            OctalConverter octalConverter = new OctalConverter(originalNumber);
            HexadecimalConverter hexadecimalConverter = new HexadecimalConverter(originalNumber);

            // Đăng ký các converter với số ban đầu
            originalNumber.addConverter(binaryConverter);
            originalNumber.addConverter(octalConverter);
            originalNumber.addConverter(hexadecimalConverter);

            // Thông báo cho các converter cập nhật và in ra kết quả chuyển đổi
            originalNumber.notifyConverters();

            System.out.println();
        }
    }
}
