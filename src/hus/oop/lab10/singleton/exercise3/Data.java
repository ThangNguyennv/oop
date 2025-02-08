package hus.oop.lab10.singleton.exercise3;

public class Data {
    private static Data instance;
    private String data;

    private Data(String data) {
        this.data = data;
    }

    public static Data getInstance(String data) {
        if (instance == null) {
            instance = new Data(data);
        }
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
