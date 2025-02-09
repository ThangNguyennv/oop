package hus.oop.lab11.designpattern.iterator.exercise1;


public class ProductCatalog {
    private final String[] productCatalog = {"mayTinh", "dienThoai", "tuLanh", "tiVi"};

    public Iterator getIterator() {
        return new ProductIterator();
    }

    private class ProductIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < productCatalog.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return productCatalog[index++];
            }
            return null;
        }
    }
}