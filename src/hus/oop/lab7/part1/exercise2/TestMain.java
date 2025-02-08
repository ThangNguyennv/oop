package hus.oop.lab7.part1.exercise2;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(3.0);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        System.out.println("---------------------------");

        GeometricObject rectangle1 = new Rectangle(2, 3);
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());

    }
}
