package exam.midterm.test3.student;

import java.util.Comparator;

public interface StudentComparator extends Comparator<Student> {
    int compare(Student left, Student right);
}
