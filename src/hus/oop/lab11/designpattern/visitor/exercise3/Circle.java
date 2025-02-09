package hus.oop.lab11.designpattern.visitor.exercise3;

import java.util.Arrays;

public class Circle implements Shape {
    private int id;
    private int[] center;
    private int radius;

    public Circle(int id, int[] center, int radius) {
        this.id = id;
        this.center = center;
        this.radius = radius;
    }

    public int getID() {
        return id;
    }

    public int[] getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void move(int x, int y) {
        System.out.println("Move the circle to the specified coordinates" + " (x" + "," + "y)");
    }

    public void draw() {
        System.out.println("Draw the circle");
    }

    public void accept(Visitor v) {
        v.visitCircle(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "id=" + id +
                ", center=" + Arrays.toString(center) +
                ", radius=" + radius +
                '}';
    }
}
