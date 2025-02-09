package hus.oop.lab11.designpattern.visitor.exercise3;

public interface Shape {
    void move(int x, int y);

    void draw();

    void accept(Visitor v);
}
