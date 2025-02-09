package hus.oop.lab11.designpattern.visitor.exercise3;

import java.util.Arrays;

public class Dot implements Shape {
    private int id;
    private int[] center;

    public Dot(int id, int[] center) {
        this.id = id;
        this.center = center;
    }

    public int getID() {
        return id;
    }

    public int[] getCenter() {
        return center;
    }

    public void move(int x, int y) {
        System.out.println("Move the dot to the specified coordinates" + " (x" + "," + "y)");
    }

    public void draw() {
        System.out.println("Draw the dot");
    }

    public void accept(Visitor v) {
        v.visitDot(this);
    }

    @Override
    public String toString() {
        return "Dot{" +
                "id=" + id +
                ", center=" + Arrays.toString(center) +
                '}';
    }
}
