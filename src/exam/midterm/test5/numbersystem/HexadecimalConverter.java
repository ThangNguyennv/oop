package exam.midterm.test5.numbersystem;

import java.math.BigInteger;

public class HexadecimalConverter extends AbstractNumberConverter {
    public HexadecimalConverter(OriginalNumber originalNumber) {
        /* TODO */
        super(originalNumber);
    }

    /**
     * Chuyển đổi một số được biểu diễn trong hệ cơ số 10
     * sang số được biểu diễn trong hệ cơ số 16.
     *
     * @param decimal
     * @return xâu ký tự biểu diễn số trong hệ cơ số 16.
     * <p>
     * Yêu cầu: sử dụng thuật toán Euclid để chuyển đổi,
     * không sử dụng thư viện chuyển đổi số có sẵn của Java.
     */
    @Override
    public String decimalTo(String decimal) {
        /* TODO */
        BigInteger number = new BigInteger(decimal);
        if (number.equals(BigInteger.ZERO)) {
            return "0";
        }
        StringBuilder hexRepresentation = new StringBuilder();
        BigInteger base = BigInteger.valueOf(16);
        while (number.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] divmod = number.divideAndRemainder(base);
            int remainder = divmod[1].intValue();
            char hexChar;
            if (remainder < 10) {
                hexChar = (char) ('0' + remainder);
            } else {
                hexChar = (char) ('A' + (remainder - 10));
            }
            hexRepresentation.insert(0, hexChar);
            number = divmod[0];
        }
        return hexRepresentation.toString();
    }

    /**
     * Cập nhật số được chuyển đổi khi số ban đầu thay đổi
     * hoặc cơ số của số ban đầu thay đổi. Sau đó in ra terminal
     * số được chuyển đổi theo định dạng a1a2...an(16).
     */
    @Override
    public void update() {
        /* TODO */
        convert();
        display();
    }

    /**
     * Hiển thị số ra terminal theo định dạng a1a2...an(16).
     */
    @Override
    public void display() {
        /* TODO */
        System.out.println(convertedNumber + "(16)");
    }
}
