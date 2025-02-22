package exam.midterm.test6.iterator;

import java.util.ArrayList;

public class MyList implements MyIterable {
    private ArrayList<String> menuItems;

    public MyList() {
        menuItems = new ArrayList<String>();
    }

    public void addItem(String name) {
        /* TODO */
        menuItems.add(name);
    }

    public ArrayList<String> getMenuItems() {
        /* TODO */
        return menuItems;
    }

    public Iterator createIterator() {
        /* TODO */
        return new MyListIterator(menuItems);
    }

    @Override
    public String toString() {
        return "MyList{" +
                "menuItems=" + menuItems +
                '}';
    }

    public void printMyList() {
        for (String element : menuItems) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
