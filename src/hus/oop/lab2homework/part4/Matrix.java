package hus.oop.lab2homework.part4;

public class Matrix {

    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == matrix2.length) {
            return true;
        }
        return false;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length == matrix2.length) {
            return true;
        }
        return false;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] newArray = new int[matrix1.length][matrix2[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix2[0].length; col++) {
                newArray[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return newArray;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] newArray = new double[matrix1.length][matrix2[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix2[0].length; col++) {
                newArray[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return newArray;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] newArray = new int[matrix1.length][matrix2[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix2[0].length; col++) {
                newArray[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return newArray;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] newArray = new double[matrix1.length][matrix2[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix2[0].length; col++) {
                newArray[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return newArray;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] newArray = new int[matrix1.length][matrix2[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix2[0].length; col++) {
                newArray[row][col] = 0;
                for (int idx = 0; idx < matrix1[0].length; idx++) {
                    newArray[row][col] += matrix1[row][idx] * matrix2[idx][col];
                }
            }
        }
        return newArray;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] newArray = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix2[0].length; col++) {
                newArray[row][col] = 0;
                for (int idx = 0; idx < matrix1[0].length; idx++) {
                    newArray[row][col] += matrix1[row][idx] * matrix2[idx][col];
                }
            }
        }
        return newArray;
    }

    public static void testArray(int[][] matrix1, int[][] matrix2) {
        int[][] sum = add(matrix1, matrix2);
        System.out.println("Kết quả của phép cộng hai ma trận 1 và ma trận 2 là:");
        for (int row = 0; row < sum.length; row++) {
            for (int col = 0; col < sum[0].length; col++) {
                System.out.print(sum[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Kết quả của phép trừ hai ma trận 1 và ma trận 2 là:");
        int[][] subtract = subtract(matrix1, matrix2);
        for (int row = 0; row < sum.length; row++) {
            for (int col = 0; col < sum[0].length; col++) {
                System.out.print(subtract[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void testMultiply(int[][] matrix1, int[][] matrix3) {
        System.out.println("Kết quả của phép nhân hai ma trận 1 và ma trận 3 là:");
        int[][] multi = multiply(matrix1, matrix3);
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix3[0].length; col++) {
                System.out.print(multi[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] matrix3 = {
                {1, 2},
                {2, 3},
                {3, 4}
        };

        testArray(matrix1, matrix2);
        System.out.println();
        testMultiply(matrix1, matrix3);
    }
}
