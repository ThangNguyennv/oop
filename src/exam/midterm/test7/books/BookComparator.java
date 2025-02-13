package exam.midterm.test7.books;

import java.util.Comparator;

public interface BookComparator extends Comparator<Book> {
    int compare(Book left, Book right);
}
