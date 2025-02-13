package exam.midterm.test6.iterator;

import java.util.*;

public class App {

    public static void main(String args[]) {
        MyArray myArray = new MyArray();
        MyList myList = new MyList();

        myArray.addItem("1");
        myArray.addItem("2");
        myArray.addItem("3");
        myArray.addItem("4");
        myArray.addItem("5");

        myList.addItem("1");
        myList.addItem("2");
        myList.addItem("3");
        myList.addItem("4");
        myList.addItem("5");

        // with no iterators
        System.out.println("Print myArray:");
        myArray.printMyArray();

        System.out.println("Print myList:");
        myList.printMyList();

        System.out.println("-------------------------------");

        // with iterators
        MyArrayIterator myArrayIterator = new MyArrayIterator(myArray.getMenuItems());
        MyListIterator myListIterator = new MyListIterator(myList.getMenuItems());

        printItems(myArrayIterator);
        printItems(myListIterator);
    }

    private static void printItems(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
