package hus.oop.lab11.designpattern.visitor.exercise2;

public class Monitor implements ComputerPart {
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }
}
