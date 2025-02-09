package hus.oop.lab11.designpattern.abstractfactory.exercise3;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // Create a regular shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape square = shapeFactory.getShape("Square");
        Shape rectangle = shapeFactory.getShape("Rectangle");

        square.draw();     // Output: Drawing a square
        rectangle.draw();  // Output: Drawing a rectangle

        // Create a rounded shape factory
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);

        Shape roundedSquare = roundedShapeFactory.getShape("Square");
        Shape roundedRectangle = roundedShapeFactory.getShape("Rectangle");

        roundedSquare.draw();     // Output: Drawing a rounded square
        roundedRectangle.draw();  // Output: Drawing a rounded rectangle
    }
}