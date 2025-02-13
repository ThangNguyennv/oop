package exam.midterm.test5.numbersystem;

import java.math.BigInteger;

public abstract class AbstractNumberConverter implements NumberConverter {
    protected OriginalNumber originalNumber;  // Số gốc
    protected String convertedNumber;         // Số được chuyển đổi theo cơ số nào đó từ số gốc

    public AbstractNumberConverter(OriginalNumber originalNumber) {
        /* TODO */
        this.originalNumber = originalNumber;
    }

    /**
     * Chuyển đổi số decimal từ hệ cơ số 10 thành số có hệ cơ số nào đó.
     *
     * @param decimal
     * @return xâu ký tự biểu diễn một số trong hệ cơ số nào đó.
     * <p>
     * Yêu cầu: sử dụng thuật toán Euclid để chuyển đổi,
     * không sử dụng thư viện chuyển đổi số có sẵn của Java.
     * <p>
     * Gợi ý: có thể sử dụng lớp trung gian BigInteger để thuận lợi hơn cho việc tính toán.
     */
    public abstract String decimalTo(String decimal);

    /**
     * Chuyển đổi số được biểu diễn trong originalNumber sang biểu diễn số trong hệ cơ số 10.
     *
     * @return xâu ký tự biểu diễn một số trong hệ cơ số 10.
     * <p>
     * Yêu cầu: sử dụng thuật toán Horner để chuyển đổi,
     * không sử dụng thư viện chuyển đổi số có sẵn của Java.
     */
    public String toDecimal() {
        /* TODO */
        String num = originalNumber.getNumberPresentation();
        int sourceRadix = originalNumber.getRadix();
        BigInteger result = BigInteger.ZERO;
        BigInteger base = BigInteger.valueOf(sourceRadix);

        // Sử dụng thuật toán Horner để chuyển đổi số từ hệ cơ số ban đầu sang hệ 10.
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int digit;
            // Xác định giá trị số của ký tự (hỗ trợ 0-9, A-Z và a-z)
            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'Z') {
                digit = c - 'A' + 10;
            } else if (c >= 'a' && c <= 'z') {
                digit = c - 'a' + 10;
            } else {
                throw new IllegalArgumentException("Ký tự không hợp lệ trong số: " + c);
            }
            if (digit >= sourceRadix) {
                throw new IllegalArgumentException("Số " + c + " không hợp lệ với hệ cơ số " + sourceRadix);
            }
            result = result.multiply(base).add(BigInteger.valueOf(digit));
        }
        return result.toString();
    }

    /**
     * Thực hiện chuyển đổi số từ biểu diễn số và hệ cơ số ban đầu trong originalNumber
     * sang số có hệ cơ số nào đó. Kết quả số được chuyển đổi được lưu trong biến
     * thành viên convertedNumber.
     */
    public void convert() {
        /* TODO */
        String decimalRepresentation = toDecimal();
        this.convertedNumber = decimalTo(decimalRepresentation);
    }
}
