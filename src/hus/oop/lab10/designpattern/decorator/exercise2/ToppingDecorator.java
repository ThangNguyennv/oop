package hus.oop.lab10.designpattern.decorator.exercise2;

public abstract class ToppingDecorator extends IceCream {
    protected IceCream iceCream;

    public abstract String getDescription();

    public abstract String addTopping();
}
