package hus.oop.lab11.designpattern.iterator.exercise1;

public class IteratorPatternExample {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();

        for (Iterator iterator = productCatalog.getIterator(); iterator.hasNext(); ) {
            String productCatalogs = (String) iterator.next();
            System.out.println("productCatalog : " + productCatalogs);
        }
    }
}
