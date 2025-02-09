package hus.oop.lab10.designpattern.decorator.exercise2;

public class NutsToppingDecorator extends ToppingDecorator {

    public NutsToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return "Nut " + this.iceCream.getDescription();
    }

    public String addTopping() {
        return " with Nut";
    }
}
