package hus.oop.lab10.designpattern.decorator.exercise1;

public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        this.shape.draw();
    }
}
