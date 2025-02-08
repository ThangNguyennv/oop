package hus.oop.lab6.part1.exercise4;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle("blue", false, 2);
        System.out.println(circle);
        System.out.println("The area of circle: " + circle.getArea());
        System.out.println("The perimeter of circle: " + circle.getPerimeter());
        System.out.println("radius: " + circle.getRadius() + " color: " + circle.getColor());

        System.out.println("-----------------------");

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println(rectangle);
        System.out.println("The area of rectangle: " + rectangle.getArea());
        System.out.println("The perimeter of rectangle: " + rectangle.getPerimeter());
        System.out.println("length: " + rectangle.getLength() + " width: " + rectangle.getWidth());

        System.out.println("-----------------------");

        Square square = new Square(2, "yellow", true);
        System.out.println(square);
        System.out.println("side: " + square.getSide());
        square.setLength(5);
        square.setColor("pink");
        square.setFilled(false);
        System.out.println("After changing: " + square);
    }
}
