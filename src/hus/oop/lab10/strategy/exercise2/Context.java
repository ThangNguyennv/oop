package hus.oop.lab10.strategy.exercise2;

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
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