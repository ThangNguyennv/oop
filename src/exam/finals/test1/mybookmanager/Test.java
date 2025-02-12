package exam.finals.test1.mybookmanager;

public class Test {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();

        myList.insertAtEnd(4);
        myList.insertAtEnd(2);
        myList.insertAtEnd(5);
        myList.insertAtEnd(1);
        myList.insertAtEnd(7);
        myList.insertAtStart(2);
        myList.printList();
        myList.insertAtPosition(6, 6);
        myList.printList();
    }
}
