package exam.midterm.test5.studentmanager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 7) {
                    continue;
                }

                if (dataList.get(0).equals("id")) {
                    continue;
                }

                /*
                TODO

                - Đọc được dữ liệu, tạo ra các đối tượng sinh viên ở đây, và cho vào đối tượng được tạo ra từ
                lớp StudentManager để quản lý.
                - Đối tượng tạo ra từ lớp StudentManager là duy nhất trong chương trình, do dùng Singleton Pattern,
                và được tạo ra bằng cách gọi hàm StudentManager.getInstance().
                */

                Student student = new Student.StudentBuilder(dataList.get(0))
                        .withLastname(dataList.get(1))
                        .withFirstname(dataList.get(2))
                        .withYearOfBirth(Integer.parseInt(dataList.get(3)))
                        .withMathsGrade(Double.parseDouble(dataList.get(4)))
                        .withPhysicsGrade(Double.parseDouble(dataList.get(5)))
                        .withChemistryGrade(Double.parseDouble(dataList.get(6)))
                        .build();
                if (student != null) {
                    StudentManager.getInstance().append(student);
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
            PrintStream out = new PrintStream(new FileOutputStream("NguyenVanThang_23001938_StudentManager.txt"));

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

    public static void main(String[] args) {
        init();
        writeListData();

        /* Yêu cầu:
        - Hoàn thiện code chương trình theo mẫu và theo yêu cầu đã cho.
        - Viết code để test cho tất cả các hàm test.

        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_StudentManager>.txt (Ví dụ, NguyenVanA_123456_StudentManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_StudentManager>.zip (Ví dụ, NguyenVanA_123456_StudentManager.zip),
          nộp lên classroom.
         */

        testOriginalData();
        testSortMathsGradeIncreasing();
        testSortMathsGradeDecreasing();
        testSortPhysicsGradeIncreasing();
        testSortChemistryGradeIncreasing();
        testSortChemistryGradeDecreasing();
        testSortAverageGradeIncreasing();
        testSortAverageGradeDecreasing();
        testFilterStudentsHighestAverageGrade();
        testFilterStudentsLowestAverageGrade();
    }

    public static void init() {
        String filePath = "oop/src/exam/midterm/test5/data/students.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().getStudentList());
        System.out.print(studentIds);
    }

    public static void testSortMathsGradeIncreasing() {
        /* TODO */
        List<Student> list = StudentManager.getInstance().sortMathsGradeIncreasing();
        for (Student item : list) {
            System.out.println(item.toString());
        }
    }

    public static void testSortMathsGradeDecreasing() {
        /* TODO */
        List<Student> list = StudentManager.getInstance().sortMathsGradeDecreasing();
        for (Student item : list) {
            System.out.println(item.toString());
        }
    }

    public static void testSortPhysicsGradeIncreasing() {
        /* TODO */
        List<Student> list = StudentManager.getInstance().sortPhysicsGradeIncreasing();
        for (Student item : list) {
            System.out.println(item.toString());
        }
    }

    public static void testSortPhysicsGradeDecreasing() {
        /* TODO */
          List<Student> list = StudentManager.getInstance().sortPhysicsGradeDecreasing();
        for (Student item : list) {
            System.out.println(item.toString());
        }
    }

    public static void testSortChemistryGradeIncreasing() {
        /* TODO */
        List<Student> list = StudentManager.getInstance().sortChemistryGradeIncreasing();
        for (Student item : list) {
            System.out.println(item.toString());
        }
    }

    public static void testSortChemistryGradeDecreasing() {
        /* TODO */
        List<Student> list = StudentManager.getInstance().sortChemistryGradeDecreasing();
        for (Student item : list) {
            System.out.println(item.toString());
        }
    }

    public static void testSortAverageGradeIncreasing() {
        /* TODO */
        List<Student> list = StudentManager.getInstance().sortAverageGradeIncreasing();
        for (Student item : list) {
            System.out.println(item.toString());
        }
    }

    public static void testSortAverageGradeDecreasing() {
        /* TODO */
        List<Student> list = StudentManager.getInstance().sortAverageGradeDecreasing();
        for (Student item : list) {
            System.out.println(item.toString());
        }
    }

    public static void testFilterStudentsHighestAverageGrade() {
        /* TODO */
        List<Student> list = StudentManager.getInstance().filterStudentsHighestAverageGrade(5);
        for (Student item : list) {
            System.out.println(item.toString());
        }
    }

    public static void testFilterStudentsLowestAverageGrade() {
        /* TODO */
        List<Student> list = StudentManager.getInstance().filterStudentsLowestAverageGrade(5);
        for (Student item : list) {
            System.out.println(item.toString());
        }
    }
}
