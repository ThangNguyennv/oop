package hus.oop.lab1.part3;

public class ComputePI {
    public static double computePI1() {
        double sum = 0.0;
        int MAXDENOMINATOR = 1000;
        for (int denominator = 1; denominator <= MAXDENOMINATOR; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += 4 * (1.0 / denominator);
            } else if (denominator % 4 == 3) {
                sum -= 4 * (1.0 / denominator);
            } else {
                System.out.println("Impossible!!!");
            }
        }
        return sum;
    }

    public static double computePI2() {
        int MAXTERM = 10000;
        double sum = 0.0;
        for (int term = 1; term <= MAXTERM; term++) {
            if (term % 2 == 1) {
                sum += 1.0 / (term * 2 - 1);
            } else {
                sum -= 1.0 / (term * 2 - 1);
            }
        }
        return 4 * sum;
    }

    public static void main(String[] args) {
        System.out.println(computePI1());
        System.out.println(computePI2());
        System.out.println("---------");
        System.out.println((computePI1() / Math.PI)  * 100);
        System.out.println((computePI2() / Math.PI)  * 100);
    }
}
