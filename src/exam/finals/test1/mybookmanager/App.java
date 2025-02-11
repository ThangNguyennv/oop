package exam.finals.test1.mybookmanager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        init();
        writeListData();
        testOriginalData();
        testFilterBooksOfAuthor();
        testFilterBooksOfGenre();
        testFilterBooksOfPublisher();
        testGetHighestPriceBook();
        testGetLowestPriceBook();
        testGetHighestNumberOfPagesBook();
        testGetLowestNumberOfPagesBook();

        /* Yêu cầu:
        - Hoàn thiện code chương trình theo mẫu đã cho.
        - Viết code để test cho tất cả các hàm test bên dưới.

        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_MyBookManager>.txt (Ví dụ, NguyenVanA_123456_MyBookManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BookMyManager>.zip (Ví dụ, NguyenVanA_123456_BookMyManager.zip),
          nộp lên classroom.
         */
    }

    public static void init() {
        String filePath = "oop/src/exam/finals/test1/data/books.csv";
        readListData(filePath);
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("title")) {
                    continue;
                }

                /*
                TODO
                Đọc được dữ liệu, tạo ra các đối tượng Book ở đây, và cho vào BookManager để quản lý.

                Gợi ý:
                Các đội tượng Book không thể được tạo trực tiếp ở đây do hàm dựng là private,
                các đối tượng này được tạo ra bằng cách sử dụng Builder Pattern, ví dụ theo cách sau:
                Book newBook = new Book.BookBuilder(title).
                    .withAuthor(author)
                    .withGenre(genre)
                    ...
                    .build();
                */

                Book book = new Book.BookBuilder(dataList.get(0))
                        .withAuthor(dataList.get(1))
                        .withGenre(dataList.get(2))
                        .withPages(Integer.parseInt(dataList.get(3)))
                        .withPrice(Double.parseDouble(dataList.get(4)))
                        .withPublisher(dataList.get(5))
                        .build();

                if (book != null) {
                    BookManager.getInstance().insertAtEnd(book);
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static void writeListData() {
        try {
            // Create a PrintStream to write to the file
            PrintStream out = new PrintStream(new FileOutputStream("NguyenVanThang_23001938_MyBookManager.txt"));

            // Redirect System.out to the file
            System.setOut(out);
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            e.printStackTrace();
        }
    }


    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }


    public static void testOriginalData() {
        MyList listBooks = BookManager.getInstance().getBookList();
        ArrayList<Book> bookList = new ArrayList<>();
        for (int i = 0; i < listBooks.size(); i++) {
            bookList.add((Book) listBooks.get(i));
        }
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

    /**
     * Test lọc ra những book theo tác giả.
     */
    public static void testFilterBooksOfAuthor() {
        /* TODO */
        MyList listBooks = BookManager.getInstance().filterBooksOfAuthor("Mlodinow Leonard");
        ArrayList<Book> bookList = new ArrayList<>();
        for (int i = 0; i < listBooks.size(); i++) {
            bookList.add((Book) listBooks.get(i));
        }
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

    /**
     * Test lọc ra những book theo nhà xuất bản.
     */
    public static void testFilterBooksOfPublisher() {
        /* TODO */
        MyList listBooks = BookManager.getInstance().filterBooksOfPublisher("Wiley");
        ArrayList<Book> bookList = new ArrayList<>();
        for (int i = 0; i < listBooks.size(); i++) {
            bookList.add((Book) listBooks.get(i));
        }
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

    /**
     * Test lọc ra những book theo thể loại.
     */
    public static void testFilterBooksOfGenre() {
        /* TODO */
        MyList listBooks = BookManager.getInstance().filterBooksOfGenre("signal_processing");
        ArrayList<Book> bookList = new ArrayList<>();
        for (int i = 0; i < listBooks.size(); i++) {
            bookList.add((Book) listBooks.get(i));
        }
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

    /**
     * Test lấy ra sách có giá cao nhất.
     */
    public static void testGetHighestPriceBook() {
        Book listBooks = (Book) BookManager.getInstance().highestPriceBook();
        System.out.println(listBooks.toString());
    }

    /**
     * Test lấy ra sách có giá thấp nhất.
     */
    public static void testGetLowestPriceBook() {
        Book listBooks = (Book) BookManager.getInstance().lowestPriceBook();
        System.out.println(listBooks.toString());
    }

    /**
     * Test lấy ra sách có số trang cao nhất.
     */
    public static void testGetHighestNumberOfPagesBook() {
        Book listBooks = (Book) BookManager.getInstance().highestNumberOfPagesBook();
        System.out.println(listBooks.toString());
    }

    /**
     * Test lấy ra sách có số trang thấp nhất.
     */
    public static void testGetLowestNumberOfPagesBook() {
        Book listBooks = (Book) BookManager.getInstance().lowestNumberOfPagesBook();
        System.out.println(listBooks.toString());
    }
}
