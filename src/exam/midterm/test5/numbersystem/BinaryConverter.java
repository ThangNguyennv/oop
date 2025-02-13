package exam.midterm.test5.numbersystem;

import java.math.BigInteger;

public class BinaryConverter extends AbstractNumberConverter {
    public BinaryConverter(OriginalNumber originalNumber) {
        /* TODO */
        super(originalNumber);
    }

    /**
     * Chuyển đổi một số được biểu diễn trong hệ cơ số 10
     * sang số được biểu diễn trong hệ cơ số 2.
     *
     * @param decimal
     * @return xâu ký tự biểu diễn số trong hệ cơ số 2.
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
        StringBuilder binaryRepresentation = new StringBuilder();
        BigInteger two = BigInteger.valueOf(2);
        while (number.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] divmod = number.divideAndRemainder(two);
            // Chèn số dư vào đầu chuỗi
            binaryRepresentation.insert(0, divmod[1].toString());
            number = divmod[0];
        }
        return binaryRepresentation.toString();
    }

    /**
     * Cập nhật số được chuyển đổi khi số ban đầu thay đổi
     * hoặc cơ số của số ban đầu thay đổi. Sau đó in ra terminal
     * số được chuyển đổi theo định dạng a1a2...an(2).
     */
    @Override
    public void update() {
        /* TODO */
        convert();
        display();
    }

    /**
     * Hiển thị số ra terminal theo định dạng a1a2...an(2).
     */
    @Override
    public void display() {
        /* TODO */
        System.out.println(convertedNumber + "(2)");
    }
}
