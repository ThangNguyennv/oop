package exam.finals.test3.studentmanager;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
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

                Đọc được dữ liệu, tạo ra các đối tượng sinh viên ở đây, và cho vào StudentManager để quản lý.
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
            PrintStream out = new PrintStream(new FileOutputStream("NguyenVanThang_23001938_StudentManager1.txt"));

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
        writeListData();
        testOriginalData();
        testSortMathsGradeIncreasing();
        testSortMathsGradeDecreasing();
        testSortPhysicsGradeIncreasing();
        testSortPhysicsGradeDecreasing();
        testSortChemistryGradeIncreasing();
        testSortChemistryGradeDecreasing();
        testFilterStudentsHighestMathsGrade();
        testFilterStudentsLowestMathsGrade();
        testFilterStudentsHighestPhysicsGrade();
        testFilterStudentsLowestPhysicsGrade();
        testFilterStudentsHighestChemistryGrade();
        testFilterStudentsLowestChemistryGrade();
        testFilterStudentsHighestAverageGrade();
        testFilterStudentsLowestAverageGrade();
        testSortYearOfBirthIncreasing();
        testSortYearOfBirthDecreasing();

    }

    public static void init() {
        String filePath = "oop/src/exam/finals/test3/data/students.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        init();
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().getStudentList());
        System.out.print(studentIds);
    }

    public static void testSortYearOfBirthIncreasing() {
        init();
        List<Student> students = StudentManager.getInstance().sortYearOfBirthIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortYearOfBirthDecreasing() {
        init();
        List<Student> students = StudentManager.getInstance().sortYearOfBirthDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortMathsGradeIncreasing() {
        /* TODO */
        init();
        List<Student> list = StudentManager.getInstance().sortMathsGradeIncreasing();
        for (Student item : list) {
            System.out.println(item.toString());
        }
    }

    public static void testSortMathsGradeDecreasing() {
        /* TODO */
        init();
        List<Student> list = StudentManager.getInstance().sortMathsGradeDecreasing();
        for (Student item : list) {
            System.out.println(item.toString());
        }
    }

    public static void testSortPhysicsGradeIncreasing() {
        /* TODO */
        init();
        List<Student> list = StudentManager.getInstance().sortPhysicsGradeIncreasing();
        for (Student item : list) {
            System.out.println(item.toString());
        }
    }

    public static void testSortPhysicsGradeDecreasing() {
        /* TODO */
        init();
        List<Student> list = StudentManager.getInstance().sortPhysicsGradeDecreasing();
        for (Student item : list) {
            System.out.println(item.toString());
        }
    }

    public static void testSortChemistryGradeIncreasing() {
        /* TODO */
        init();
        List<Student> list = StudentManager.getInstance().sortChemistryGradeIncreasing();
        for (Student item : list) {
            System.out.println(item.toString());
        }
    }

    public static void testSortChemistryGradeDecreasing() {
        /* TODO */
        init();
        List<Student> list = StudentManager.getInstance().sortChemistryGradeDecreasing();
        for (Student item : list) {
            System.out.println(item.toString());
        }
    }

    public static void testFilterStudentsHighestMathsGrade() {
        init();
        List<Student> students = StudentManager.getInstance().sortMathsGradeDecreasing();
        List<Student> nHighestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestMathsGradeStudents.add(students.get(i));
        }
        for (Student item : nHighestMathsGradeStudents) {
            System.out.println(item.toString());
        }
    }

    public static void testFilterStudentsLowestMathsGrade() {
        init();
        List<Student> students = StudentManager.getInstance().sortMathsGradeIncreasing();
        List<Student> nLowestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestMathsGradeStudents.add(students.get(i));
        }

        for (Student item : nLowestMathsGradeStudents) {
            System.out.println(item.toString());
        }
    }

    public static void testFilterStudentsHighestPhysicsGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortPhysicsGradeDecreasing();
        List<Student> nHighestPhysicsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestPhysicsGradeStudents.add(students.get(i));
        }
        for (Student item : nHighestPhysicsGradeStudents) {
            System.out.println(item.toString());
        }
    }

    public static void testFilterStudentsLowestPhysicsGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortPhysicsGradeIncreasing();
        List<Student> nLowestPhysicsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestPhysicsGradeStudents.add(students.get(i));
        }
        for (Student item : nLowestPhysicsGradeStudents) {
            System.out.println(item.toString());
        }
    }

    public static void testFilterStudentsHighestChemistryGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortChemistryGradeDecreasing();
        List<Student> nHighestChemistryGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestChemistryGradeStudents.add(students.get(i));
        }
        for (Student item : nHighestChemistryGradeStudents) {
            System.out.println(item.toString());
        }
    }

    public static void testFilterStudentsLowestChemistryGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortChemistryGradeIncreasing();
        List<Student> nLowestChemistryGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestChemistryGradeStudents.add(students.get(i));
        }
        for (Student item : nLowestChemistryGradeStudents) {
            System.out.println(item.toString());
        }
    }

    public static void testFilterStudentsHighestAverageGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortAverageGradeDecreasing();
        List<Student> nHighestAverageGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestAverageGradeStudents.add(students.get(i));
        }
        for (Student item : nHighestAverageGradeStudents) {
            System.out.println(item.toString());
        }
    }

    public static void testFilterStudentsLowestAverageGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortAverageGradeIncreasing();
        List<Student> nLowestAverageGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestAverageGradeStudents.add(students.get(i));
        }
        for (Student item : nLowestAverageGradeStudents) {
            System.out.println(item.toString());
        }
    }
}
