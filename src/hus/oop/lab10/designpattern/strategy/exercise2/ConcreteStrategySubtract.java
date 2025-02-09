package hus.oop.lab10.designpattern.strategy.exercise2;

public class ConcreteStrategySubtract implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
