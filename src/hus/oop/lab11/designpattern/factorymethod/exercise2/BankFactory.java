package hus.oop.lab11.designpattern.factorymethod.exercise2;

public class BankFactory {
    private BankFactory() {

    }

    public static final Bank getBank(BankType bankType) {
        switch (bankType) {

            case TPBANK:
                return new TPBank();

            case VIETCOMBANK:
                return new VietcomBank();

            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}
