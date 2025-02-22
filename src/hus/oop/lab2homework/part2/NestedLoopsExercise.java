package hus.oop.lab2homework.part2;

import java.util.*;

public class NestedLoopsExercise {

    static Scanner sc = new Scanner(System.in);

    //bai2.1
    public static void squarePatternUseFor(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void squarePatternUseWhile(int n) {
        int row = 0;
        while (row < n) {
            int col = 0;
            while (col < n) {
                System.out.print("# ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void testSquarePattern() {
        System.out.print("Enter the size: ");
        int number = sc.nextInt();
        squarePatternUseFor(number);
        System.out.println();
        squarePatternUseWhile(number);
        sc.close();
    }

    //bai2.2
    public static void checkerPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row % 2 == 0) {
                    System.out.print(" #");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void testCheckerPattern() {
        System.out.print("Enter the size: ");
        int number = sc.nextInt();
        checkerPattern(number);
    }

    //bai2.3
    public static void timeTable(int n) {
        System.out.print("*  |");
        for (int row = 1; row <= n; row++) {
            System.out.printf("%4d", row);
        }
        System.out.println();
        for (int idx = 0; idx <= n * 2 + 1; idx++) {
            System.out.print("--");
        }
        System.out.println();
        for (int row = 1; row <= n; row++) {
            System.out.printf("%2d |", row);
            for (int col = 1; col <= n; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }
    }

    public static void testTimeTable() {
        System.out.print("Enter the size: ");
        int key = sc.nextInt();
        timeTable(key);
    }

    //bai2.4
    public static void triangularPatternA(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangularPatternB(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangularPatternC(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col < row) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void triangularPatternD(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col <= n - row) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void testTriangularPattern() {
        System.out.print("Enter the size: ");
        int number = sc.nextInt();

        System.out.println("(a)");
        triangularPatternA(number);
        System.out.println();

        System.out.println("(b)");
        triangularPatternB(number);
        System.out.println();

        System.out.println("(c)");
        triangularPatternC(number);
        System.out.println();

        System.out.println("(d)");
        triangularPatternD(number);
    }

    //bai2.5
    public static void boxPatternA(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternB(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void boxPatternC(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == n - row + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void boxPatternD(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || row == n - col + 1 || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void testBoxPattern() {
        System.out.print("Enter the size: ");
        int key = sc.nextInt();

        System.out.println("(a)");
        boxPatternA(key);
        System.out.println();

        System.out.println("(b)");
        boxPatternB(key);
        System.out.println();

        System.out.println("(c)");
        boxPatternC(key);
        System.out.println();

        System.out.println("(d)");
        boxPatternD(key);
    }

    //bai2.6
    public static void hillPatternA(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void hillPatternB(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * (n - row + 1) - 1; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void hillPatternC(int n) {
        for (int row = 1; row < n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            for (int col = 0; col < 2 * row - 1; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * (n - row + 1) - 1; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void hillPatternD(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 2 * n; col++) {
                if (col <= n - row + 1 || col >= n + row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int row = n - 1; row >= 1; row--) {
            for (int col = 1; col <= 2 * n; col++) {
                if (col <= n - row + 1 || col >= n + row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void testHillPattern() {
        System.out.print("Enter the rows: ");
        int key = sc.nextInt();

        System.out.println("(a)");
        hillPatternA(key);
        System.out.println();

        System.out.println("(b)");
        hillPatternB(key);
        System.out.println();

        System.out.println("(c)");
        hillPatternC(key);
        System.out.println();

        System.out.println("(d)");
        hillPatternD(key);
    }

    public static void main(String[] args) {
        testSquarePattern();
        testCheckerPattern();
        testTimeTable();
        testTriangularPattern();
        testBoxPattern();
        testHillPattern();
    }
}
