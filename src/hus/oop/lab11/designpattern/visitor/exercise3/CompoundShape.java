package hus.oop.lab11.designpattern.visitor.exercise3;

import java.util.Arrays;

public class CompoundShape implements Shape {
    private int id;
    private final Shape[] children;

    public CompoundShape(int id, Shape[] children) {
        this.id = id;
        this.children = children;
    }

    public int getID() {
        return id;
    }

    public Shape[] getChildren() {
        return children;
    }

    public void move(int x, int y) {
        System.out.println("Move the compoundShape to the specified coordinates" + " (x" + "," + "y)");
    }

    public void draw() {
        System.out.println("Draw the compoundShape");
    }

    public void accept(Visitor v) {
        v.visitCompoundShape(this);
    }

    @Override
    public String toString() {
        return "CompoundShape{" +
                "id=" + id +
                ", children=" + Arrays.toString(children) +
                '}';
    }
}
