package hus.oop.lab11.designpattern.visitor.exercise1;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(BusinessBook a) {
        System.out.println(a.getPublisher());
    }

    @Override
    public void visit(DesignPatternBook w) {
        System.out.println(w.getBestSeller());
    }

    @Override
    public void visit(JavaCoreBook g) {
        System.out.println(g.getFavouriteBook());
    }
}
