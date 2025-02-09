package hus.oop.lab10.designpattern.decorator.exercise3;

public class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        System.out.println(data);
    }

    @Override
    public String readData() {
        String data = "Data from file";
        return data;
    }
}
