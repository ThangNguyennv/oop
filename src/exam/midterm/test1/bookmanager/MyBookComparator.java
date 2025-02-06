package exam.midterm.test1.bookmanager;

import java.util.Comparator;

public interface MyBookComparator extends Comparator<Book> {
    int compare(Book left, Book right);
}
