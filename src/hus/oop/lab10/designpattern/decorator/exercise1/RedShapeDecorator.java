package hus.oop.lab10.designpattern.decorator.exercise1;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        setRedBorder();
    }

    public void setRedBorder() {
        System.out.println("Border Color: Red");
    }
}
