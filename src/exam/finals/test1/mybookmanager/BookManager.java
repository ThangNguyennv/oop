package exam.finals.test1.mybookmanager;

public class BookManager {
    private static BookManager instance;
    private MyList bookList;

    private BookManager() {
        /* TODO */
        bookList = new MyLinkedList();
    }

    public static BookManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new BookManager();
        }
        return instance;

    }

    public MyList getBookList() {
        /* TODO */
        return this.bookList;
    }

    /**
     * Thêm book vào đầu danh sách.
     * @param book
     */
    public void insertAtStart(Book book) {
        /* TODO */
        bookList.insertAtStart(book);
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void insertAtEnd(Book book) {
        /* TODO */
        bookList.insertAtEnd(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void insertAPosition(Book book, int index) {
        /* TODO */
        bookList.insertAtPosition(book, index);
    }

    /**
     * Xóa book ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        bookList.remove(index);
    }

    /**
     * Lấy ra book ở vị trí index
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        /* TODO */
        if (index >= 0 && index < bookList.size()) {
            return (Book) bookList.get(index);
        }
        return null;
    }

    /**
     * Lấy ra sách có giá cao nhất.
     * @return
     */
    public Book highestPriceBook() {
        if (!bookList.iterator().hasNext()) {
            return null; // or throw an exception, based on your requirement
        }

        Book highestPriceBook = (Book)bookList.get(0);
        for (int i = 1; i < bookList.size(); i++) {
            Book book = ((Book)bookList.get(i));
            if (book.getPrice() > highestPriceBook.getPrice()) {
                highestPriceBook = book;
            }
        }
        return highestPriceBook;
    } 

    /**
     * Lấy ra sách có giá thấp nhất.
     * @return
     */
    public Book lowestPriceBook() {
        if (!bookList.iterator().hasNext()) {
            return null; // or throw an exception, based on your requirement
        }

        Book lowestPriceBook = (Book)bookList.get(0);
        for (int i = 1; i < bookList.size(); i++) {
            Book book = ((Book)bookList.get(i));
            if (book.getPrice() < lowestPriceBook.getPrice()) {
                lowestPriceBook = book;
            }
        }
        return lowestPriceBook;
    }

    /**
     * Lấy ra sách có số trang cao nhất.
     * @return
     */
    public Book highestNumberOfPagesBook() {
        if (!bookList.iterator().hasNext()) {
            return null; // or throw an exception, based on your requirement
        }

        Book highestNumberOfPagesBook = (Book)bookList.get(0);
        for (int i = 1; i < bookList.size(); i++) {
            Book book = ((Book)bookList.get(i));
            if (book.getPages() > highestNumberOfPagesBook.getPages()) {
                highestNumberOfPagesBook = book;
            }
        }
        return highestNumberOfPagesBook;
    }

    /**
     * Lấy ra sách có số trang thấp nhất.
     * @return
     */
    public Book lowestNumberOfPagesBook() {
        if (!bookList.iterator().hasNext()) {
            return null; // or throw an exception, based on your requirement
        }

        Book lowestNumberOfPagesBook = (Book)bookList.get(0);
        for (int i = 1; i < bookList.size(); i++) {
            Book book = ((Book)bookList.get(i));
            if (book.getPages() < lowestNumberOfPagesBook.getPages()) {
                lowestNumberOfPagesBook = book;
            }
        }
        return lowestNumberOfPagesBook;
    }

    /**
     * Lọc ra những book theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public MyList filterBooksOfPublisher(String publisher) {
        /* TODO */
        MyList listBooksOfPublisher = new MyLinkedList();
        for(int i = 0; i < bookList.size(); i++) {
            if((((Book)bookList.get(i)).getPublisher()).equals(publisher)) {
                listBooksOfPublisher.insertAtEnd(bookList.get(i));
            }
    }
        return listBooksOfPublisher;
    }
    

    /**
     * Lọc ra những book theo thể loại.
     * @param genre
     * @return
     */
    public MyList filterBooksOfGenre(String genre) {
        /* TODO */
        MyList listBooksOfGenre = new MyLinkedList();
        for(int i = 0; i < bookList.size(); i++) {
                if((((Book)bookList.get(i)).getGenre()).equals(genre)) {
                    listBooksOfGenre.insertAtEnd(bookList.get(i));
                }
        }
        return listBooksOfGenre;
    }

    /**
     * Lọc ra những book theo tác giả.
     * @param author
     * @return
     */
    public MyList filterBooksOfAuthor(String author) {
        /* TODO */
        MyList listBooksOfAuthor = new MyLinkedList();
        for(int i = 0; i < bookList.size(); i++) {
            if((((Book)bookList.get(i)).getAuthor()).equals(author)) {
                listBooksOfAuthor.insertAtEnd(bookList.get(i));
            }
        }
        return listBooksOfAuthor;
    }
}
