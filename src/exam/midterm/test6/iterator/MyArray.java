package exam.midterm.test6.iterator;

import java.util.Arrays;

public class MyArray implements MyIterable {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems;
    private String[] menuItems;

    public MyArray() {
        menuItems = new String[MAX_ITEMS];
        numberOfItems = 0;
    }

    public void addItem(String name) {
        /* TODO */
        menuItems[numberOfItems++] = name;
    }

    public String[] getMenuItems() {
        /* TODO */
        String[] arrayString = new String[numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            if (menuItems[i] != null) {
                arrayString[i] = menuItems[i];
            }
        }
        return arrayString;
    }

    public Iterator createIterator() {
        /* TODO */
        return new MyArrayIterator(menuItems);
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "numberOfItems=" + numberOfItems +
                ", menuItems=" + Arrays.toString(menuItems) +
                '}';
    }

    public void printMyArray() {
        for (int i = 0; i < numberOfItems; i++) {
            System.out.print(menuItems[i] + " ");
        }
        System.out.println();
    }
}
