package exam.midterm.test1.bookmanager;

import java.util.*;

public class BookManager {
    private List<Book> bookList;

    public BookManager() {
        bookList = new LinkedList<>();
    }

    public List<Book> getBookList() {
        /* TODO */
        return bookList;
    }

    /**
     * Phương thức kiểm tra xem chỉ số index có nằm trong đoạn [0 - limit] hay
     * không.
     * 
     * @param index
     * @param limit
     * @return
     */
    private boolean checkBoundaries(int index, int limit) {
        /* TODO */
        return index >= 0 && index <= limit;
    }

    /**
     * Thêm book vào cuối danh sách.
     * 
     * @param book
     */
    public void append(Book book) {
        /* TODO */
        bookList.add(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * 
     * @param book
     * @param index
     */
    public void add(Book book, int index) {
        /* TODO */
        bookList.add(index, book);
    }

    /**
     * Xóa book ở vị trí index.
     * 
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        bookList.remove(index);
    }

    /**
     * Bỏ book như tham số truyền vào.
     * 
     * @param book
     */
    public void remove(Book book) {
        /* TODO */
        bookList.remove(book);
    }

    /**
     * Lấy ra book ở vị trí index
     * 
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        /* TODO */
        if (checkBoundaries(index, bookList.size() - 1)) {
            return bookList.get(index);
        }
        return null;
    }

    /**
     * Sắp xếp danh sách book theo thứ tự tăng dần theo genre và sau đó đến title.
     * 
     * @return
     */
    public List<Book> sortIncreasingByGenreAndTitle() {
        /* TODO */
        List<Book> sortedList = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            sortedList.add(bookList.get(i));
        }
        Collections.sort(sortedList);
        return sortedList;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo genre tăng dần, nếu genre như nhau
     * thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * 
     * @return
     */
    public List<Book> sortIncreasingGenreAndPrice() {
        /* TODO */
        List<Book> sortedList = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            sortedList.add(bookList.get(i));
        }

        Collections.sort(sortedList, new MyBookComparator() {
            @Override
            public int compare(Book book1, Book book2) {
                int comparativeResult = book1.getGenre().compareTo(book2.getGenre());
                if (comparativeResult != 0) {
                    return comparativeResult;
                }
                return Double.compare(book2.getPrice(), book1.getPrice());
            }
        });
        return sortedList;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo genre giảm dần, nếu genre như nhau
     * thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * 
     * @return
     */
    public List<Book> sortDecreasingGenreAndPrice() {
        /* TODO */
        List<Book> sortedList = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            sortedList.add(bookList.get(i));
        }

        Collections.sort(sortedList, new MyBookComparator() {
            @Override
            public int compare(Book book1, Book book2) {
                int comparativeResult = book2.getGenre().compareTo(book1.getGenre());
                if (comparativeResult != 0) {
                    return comparativeResult;
                }
                return Double.compare(book2.getPrice(), book1.getPrice());
            }
        });
        return sortedList;
    }

    /**
     * Sắp xếp sách theo giá tăng dần.
     * 
     * @return
     */
    public List<Book> sortIncreasingPrice() {
        /* TODO */
        List<Book> sortedList = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            sortedList.add(bookList.get(i));
        }
        Collections.sort(sortedList, new MyBookComparator() {

            @Override
            public int compare(Book left, Book right) {
                return Double.compare(left.getPrice(), right.getPrice());
            }
            
        });
        return sortedList;
    }

    /**
     * Sắp xếp sách theo giá giảm dần.
     * 
     * @return
     */
    public List<Book> sortDecreasingPrice() {
        /* TODO */
        List<Book> sortedList = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            sortedList.add(bookList.get(i));
        }
        Collections.sort(sortedList, new MyBookComparator() {

            @Override
            public int compare(Book left, Book right) {
                return Double.compare(right.getPrice(), left.getPrice());
            }
            
        });
        return sortedList;
    }

    /**
     * Sắp xếp sách theo số trang tăng dần.
     * 
     * @return
     */
    public List<Book> sortIncreasingPages() {
        /* TODO */
        List<Book> sortedList = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            sortedList.add(bookList.get(i));
        }
        Collections.sort(sortedList, new MyBookComparator() {

            @Override
            public int compare(Book left, Book right) {
                return Double.compare(left.getPages(), right.getPages());
            }
            
        });
        return sortedList;
    }

    /**
     * Sắp xếp sách theo số trang giảm dần.
     * 
     * @return
     */
    public List<Book> sortDecreasingPages() {
        /* TODO */
        List<Book> sortedList = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            sortedList.add(bookList.get(i));
        }
        Collections.sort(sortedList, new MyBookComparator() {

            @Override
            public int compare(Book left, Book right) {
                return Double.compare(right.getPages(), left.getPages());
            }
            
        });
        return sortedList;

    }

    /**
     * Lọc ra howMany sách có số trang lớn nhất.
     * 
     * @param howMany
     * @return
     */
    public List<Book> filterHighestPages(int howMany) {
        /* TODO */
        List<Book> listDecreasingPages = sortDecreasingPages();
        List<Book> listHighestPages = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            listHighestPages.add(listDecreasingPages.get(i));
        }
        return listHighestPages;
    }

    /**
     * Lọc ra những sách có số trang cao hơn lowerBound.
     * 
     * @param lowerBound
     * @return
     */
    public List<Book> filterBooksPagesHigherThan(double lowerBound) {
        /* TODO */
        List<Book> listPagesHigherThan = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getPages() > lowerBound) {
                listPagesHigherThan.add(bookList.get(i));
            }
        }
        return listPagesHigherThan;
    }

    /**
     * Lọc ra howMany sách có số trang nhỏ nhất.
     * 
     * @param howMany
     * @return
     */
    public List<Book> filterBookLowestPages(int howMany) {
        /* TODO */
        List<Book> listIncreasingPages = sortIncreasingPages();
        List<Book> listLowestPages = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            listLowestPages.add(listIncreasingPages.get(i));
        }
        return listLowestPages;

    }

    /**
     * Lọc ra howMany sách có số trang nhỏ hơn upperBound.
     * 
     * @param upperBound
     * @return
     */
    public List<Book> filterBooksPagesLowerThan(double upperBound) {
        /* TODO */
        List<Book> listPagesLowerThan = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getPages() < upperBound) {
                listPagesLowerThan.add(bookList.get(i));
            }
        }
        return listPagesLowerThan;
    }

    /**
     * Lọc ra những sách theo nhà xuất bản.
     * 
     * @param publisher
     * @return
     */
    public List<Book> filterBooksOfPublisher(String publisher) {
        /* TODO */
        List<Book> listOfPublisher = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getPublisher().equals(publisher)) {
                listOfPublisher.add(bookList.get(i));
            }
        }
        return listOfPublisher;
    }

    /**
     * Lọc ra những sách theo thể loại.
     * 
     * @param genre
     * @return
     */
    public List<Book> filterBooksOfGenre(String genre) {
        /* TODO */
        List<Book> listOfGenre = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getGenre().equals(genre)) {
                listOfGenre.add(bookList.get(i));
            }
        }
        return listOfGenre;
    }

    /**
     * Lọc ra những sách theo tác giả.
     * 
     * @param author
     * @return
     */
    public List<Book> filterBooksOfAuthor(String author) {
        /* TODO */
        List<Book> listOfAuthor = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getAuthor().equals(author)) {
                listOfAuthor.add(bookList.get(i));
            }
        }
        return listOfAuthor;
    }

    public static String titleOfBooksToString(List<Book> bookList) {
        StringBuilder titleOfBooks = new StringBuilder();
        titleOfBooks.append("[\n");
        for (Book book : bookList) {
            titleOfBooks.append(book.getTitle()).append("\n");
        }
        return titleOfBooks.toString().trim() + "\n]";
    }

    public static void print(List<Book> bookList) {
        StringBuilder booksString = new StringBuilder();
        booksString.append("[\n");
        for (Book book : bookList) {
            booksString.append(book.toString()).append("\n");
        }
        System.out.print(booksString.toString().trim() + "\n]");
    }
}
