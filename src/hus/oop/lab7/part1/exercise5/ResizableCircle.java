package hus.oop.lab7.part1.exercise5;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }

    public void resize(int percent) {
        radius *= percent / 100.0;
    }
}
