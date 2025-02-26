package exam.finals.test3.matrix;

import java.util.Arrays;
import java.util.Random;

public class SquareMatrix {
    private int[][] data;

    /**
     * Hàm dựng, khởi tạo một ma trận có các phần tử được sinh ngẫu nhiên trong khoảng [1, 100]
     *
     * @param size
     */
    public SquareMatrix(int size) {
        data = new int[size][size];
        initRandom(size);
    }

    /**
     * Phương thức khởi tạo ma trận, các phần tử của ma trận được sinh ngẫu nhiên trong khoảng [1, 100]
     *
     * @param size
     */
    private void initRandom(int size) {
        /* TODO */
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                data[i][j] = random.nextInt(6) + 5;
            }
        }
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo chính của ma trận.
     *
     * @return đường chéo chính của ma trận.
     */
    public int[] principalDiagonal() {
        /* TODO */
        int[] newArr = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            newArr[i] = data[i][i];
        }
        return newArr;
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo phụ của ma trận.
     *
     * @return đường chéo phụ của ma trận.
     */
    public int[] secondaryDiagonal() {
        /* TODO */
        int[] resultArr = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            resultArr[i] = data[i][data.length - i - 1];
        }
        return resultArr;
    }

    public boolean prime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Phương thức lấy ra các số là số nguyên tố trong ma trận.
     *
     * @return các số nguyên tố trong ma trận.
     */
    public int[] primes() {
        /* TODO */
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (prime(data[i][j])) {
                    count++;
                }
            }
        }
        int[] resultArr = new int[count];
        int idx = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (prime(data[i][j])) {
                    resultArr[idx++] = data[i][j]
                    ;
                }
            }
        }
        return resultArr;
    }

    /**
     * Phương thức sắp xếp các phần tử của ma trận theo thứ tự tăng dần.
     *
     * @return ma trận có các phần tử là phần tử của ma trận ban đầu được sắp xếp theo thứ tự tăng dần.
     * Các phần tử được sắp xếp theo thứ tự từ trái sang phải ở mỗi hàng, và từ trên xuống dưới.
     */
    public SquareMatrix getSortedMatrix() {
        /* TODO */
        int[][] sortedData = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            sortedData[i] = Arrays.copyOf(data[i], data.length);
            Arrays.sort(sortedData[i]);
        }

        for (int col = 0; col < sortedData.length; col++) {
            int[] column = new int[sortedData.length];
            for (int row = 0; row < sortedData.length; row++) {
                column[row] = sortedData[row][col];
            }
            Arrays.sort(column); // Sort the column in ascending order
            for (int row = 0; row < sortedData.length; row++) {
                sortedData[row][col] = column[row];
            }
        }
        SquareMatrix sortedMatrix = new SquareMatrix(data.length);
        sortedMatrix.data = sortedData;
        return sortedMatrix;
    }

    /**
     * Lấy giá trị phần tử ở vị trí (row, col).
     *
     * @param row
     * @param col
     * @return
     */
    public int get(int row, int col) {
        /* TODO */
        return data[row][col];
    }

    /**
     * Sửa giá trị phần tử ở vị trí (row, col) thành value.
     *
     * @param row
     * @param col
     * @param value
     */
    public void set(int row, int col, int value) {
        /* TODO */
        data[row][col] = value;
    }

    /**
     * Phương thức cộng ma trận hiện tại với một ma trận khác.
     *
     * @param that
     * @return ma trận mới là ma trận tổng của 2 ma trận.
     */
    public SquareMatrix add(SquareMatrix that) {
        /* TODO */
        int[][] resultArr = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                resultArr[i][j] = data[i][j] + that.get(i, j);
            }
        }
        SquareMatrix newMatrix = new SquareMatrix(data.length);
        newMatrix.data = resultArr;
        return newMatrix;
    }

    /**
     * Phương thức trừ ma trận hiện tại cho một ma trận khác.
     *
     * @param that
     * @return ma trận mới là ma trận hiệu của ma trận hiện tại và ma trận truyền vào.
     */
    public SquareMatrix minus(SquareMatrix that) {
        /* TODO */
        int[][] resultArr = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                resultArr[i][j] = that.get(i, j) - data[i][j];
            }
        }
        SquareMatrix newMatrix = new SquareMatrix(data.length);
        newMatrix.data = resultArr;
        return newMatrix;
    }

    /**
     * Phương thức nhân ma trận hiện tại với một ma trận khác.
     *
     * @param that
     * @return ma trận mới là ma trận nhân của ma trận hiện tại với ma trận truyền vào.
     */
    public SquareMatrix multiply(SquareMatrix that) {
        /* TODO */
        int[][] resultArr = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                resultArr[i][j] = 0;
                for (int k = 0; k < data.length; k++) {
                    resultArr[i][j] += data[i][k] * that.get(k, j);
                }
            }
        }
        SquareMatrix newMatrix = new SquareMatrix(data.length);
        newMatrix.data = resultArr;
        return newMatrix;
    }

    /**
     * Phương thức nhân ma trận với một số vô hướng.
     *
     * @param value
     * @return ma trận mới là ma trận hiện tại được nhân với một số vô hướng.
     */
    public SquareMatrix scaled(int value) {
        /* TODO */
        int[][] resultArr = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                resultArr[i][j] = data[i][j] * value;
            }
        }
        SquareMatrix newMatrix = new SquareMatrix(data.length);
        newMatrix.data = resultArr;
        return newMatrix;
    }

    /**
     * Phương thức lấy ma trận chuyển vị.
     *
     * @return ma trận mới là ma trận chuyển vị của ma trận hiện tại.
     */
    public SquareMatrix transpose() {
        /* TODO */
        int[][] resultArr = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                resultArr[i][j] = data[j][i];
            }
        }
        SquareMatrix newMatrix = new SquareMatrix(data.length);
        newMatrix.data = resultArr;
        return newMatrix;
    }

    /**
     * Mô tả ma trận theo định dạng biểu diễn ma trận, ví dụ
     * 1 2 3
     * 4 5 6
     * 7 8 9
     *
     * @return một chuỗi mô tả ma trận.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                sb.append(data[i][j]);
                if (j < data.length - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
