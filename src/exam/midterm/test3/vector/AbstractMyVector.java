package exam.midterm.test3.vector;

public abstract class AbstractMyVector implements MyVector {
    /**
     * Mô tả vector theo định dạng [a1 a2 ... an]
     *
     * @return
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append(String.format("[%s]", coordinate(i)));
        }
        return sb.toString();
    }

    /**
     * So sánh hai vector có bằng nhau không.
     * Hai vector bằng nhau nếu có cùng số chiều và có tọa độ bằng nhau.
     *
     * @param another
     * @return
     */
    @Override
    public boolean equals(MyVector another) {
        /* TODO */
        // Nếu đối tượng so sánh là null, trả về false
        if (another == null) {
            return false;
        }
        // Nếu hai đối tượng tham chiếu đến cùng một đối tượng thì trả về true
        if (this == another) {
            return true;
        }
        // Nếu số chiều của hai vector khác nhau thì không bằng nhau
        if (this.size() != another.size()) {
            return false;
        }
        // Kiểm tra từng tọa độ
        for (int i = 0; i < size(); i++) {
            if (this.coordinate(i) != another.coordinate(i)) {
                return false;
            }
        }
        return true;
    }
}
