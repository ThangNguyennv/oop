package exam.midterm.test5.studentmanager;

import java.util.Comparator;

public interface StudentComparator extends Comparator<Student> {
    int compare(Student left, Student right);
}
