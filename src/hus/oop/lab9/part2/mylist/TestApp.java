package hus.oop.lab9.part2.mylist;

public class TestApp {
    public static void main(String[] args) {
        // Test ArrayList
        MyList myArrayList = new MyArrayList();
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");
        myArrayList.add("d");
        myArrayList.add("e");
        myArrayList.add("ddd", 5);
        myArrayList.add("eee", 6);
        myArrayList.remove(3);
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());

        System.out.println("-----------------------");

        // Test LinkedList
        MyList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(4);
        myLinkedList.add(3);
        myLinkedList.add(6);
        myLinkedList.add(11);
        ((MyLinkedList) myLinkedList).printLinkedList();
        myLinkedList.remove(2);
        System.out.println();
        ((MyLinkedList) myLinkedList).printLinkedList();
    }
}
