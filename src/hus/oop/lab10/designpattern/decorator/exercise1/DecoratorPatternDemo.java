package hus.oop.lab10.designpattern.decorator.exercise1;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();

        System.out.println("-------------------------");

        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        redShapeDecorator.draw();
        redShapeDecorator.setRedBorder();
    }
}
