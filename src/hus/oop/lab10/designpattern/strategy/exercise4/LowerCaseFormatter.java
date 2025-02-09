package hus.oop.lab10.designpattern.strategy.exercise4;

public class LowerCaseFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}
