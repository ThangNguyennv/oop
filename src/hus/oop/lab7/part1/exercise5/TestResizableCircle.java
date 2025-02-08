package hus.oop.lab7.part1.exercise5;

public class TestResizableCircle {
    public static void main(String[] args) {
        Resizable resizeAbleCircle1 = new ResizableCircle(3.0); // Upcast
        System.out.println(resizeAbleCircle1);
        resizeAbleCircle1.resize(30);
        System.out.println(resizeAbleCircle1);

        System.out.println("------------------------------");

        GeometricObject resizeAbleCircle2 = (GeometricObject) resizeAbleCircle1;
        System.out.println(resizeAbleCircle2);
        System.out.println(resizeAbleCircle2.getArea());
        System.out.println(resizeAbleCircle2.getPerimeter());

    }
}
