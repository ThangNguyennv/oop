package hus.oop.lab6.part2.exercise1;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub line = new LineSub(1, 2, 3, 4);
        System.out.println(line);
        int startX = line.getBeginX();
        int startY = line.getBeginY();
        int endX = line.getEndX();
        int endY = line.getEndY();

        System.out.println("Start point: " + startX + "," + startY);
        System.out.println("End point: " + endX + "," + endY);

        line.setBeginXY(2, 3);
        startX = line.getBeginX();
        startY = line.getBeginY();
        System.out.println("After changing start point: " + startX + "," + startY);
        System.out.println("Distance between 2 points: " + line.getLength());
        System.out.println("angle of vector: " + line.getGradient());
    }
}
