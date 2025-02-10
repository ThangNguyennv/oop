package exam.midterm.test3.student;

public class AverageComparison implements StudentComparator {
    @Override
    public int compare(Student left, Student right) {
        return Double.compare(left.average, right.average);
    }
}
