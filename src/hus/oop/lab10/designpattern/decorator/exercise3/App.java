package hus.oop.lab10.designpattern.decorator.exercise3;

public class App {
    public static void main(String[] args) {
        DataSource source = new FileDataSource("someFile.dat");
        source.writeData("salary records!");

        source = new CompressionDecorator(source);
        source.writeData("salary records!");

        source = new EncryptionDecorator(source);
        source.writeData("salary records!");
    }
}
