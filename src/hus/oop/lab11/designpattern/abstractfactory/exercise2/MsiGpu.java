package hus.oop.lab11.designpattern.abstractfactory.exercise2;

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        // Logic relevant to MSI GPUs
        System.out.println("Assembling MSI GPU");
    }

    @Override
    public void renderGraphics() {
        // Specific graphics rendering logic for MSI GPU
        System.out.println("Rendering graphics with MSI GPU");
    }

    @Override
    public void overclock() {
        // Specific overclocking logic for MSI GPU
        System.out.println("Overclocking MSI GPU");
    }
}