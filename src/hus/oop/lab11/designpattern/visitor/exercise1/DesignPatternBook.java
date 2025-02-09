package hus.oop.lab11.designpattern.visitor.exercise1;

public class DesignPatternBook implements ProgramingBook {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "https://thangnguyen1020";
    }

    public String getBestSeller() {
        return "The best Seller of design pattern book";
    }
}