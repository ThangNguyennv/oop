package exam.midterm.test7.books;

public class PageComparison implements BookComparator {
    @Override
    public int compare(Book left, Book right) {
        return Integer.compare(left.getPages(), right.getPages());
    }
}
