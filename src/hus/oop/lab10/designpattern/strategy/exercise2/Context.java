package hus.oop.lab10.designpattern.strategy.exercise2;

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context() {

    }

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    int executeStrategy(int a, int b) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy chưa được khởi tạo");
        }
        return strategy.execute(a, b);
    }
}