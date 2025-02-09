package hus.oop.lab11.designpattern.visitor.exercise2;

public class Keyboard implements ComputerPart {
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }
}
