package hus.oop.lab11.designpattern.abstractfactory.exercise2;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Company msi = new MsiManufacturer();
        Company asus = new AsusManufacturer();
        List.of(msi.createGpu(), msi.createMonitor(), asus.createGpu(), asus.createMonitor())
                .forEach(Product::assemble);
    }
}