package exam.midterm.test3.student;

import java.util.Arrays;

public class StudentStatistics {
    private MyList students;

    /**
     * Khởi tạo dữ liệu cho StudentManager.
     */
    public StudentStatistics(MyList data) {
        /* TODO */
        students = data;
    }

    /**
     * Lấy ra danh sách các sinh viên được sắp xếp theo thứ tự phụ thuộc vào tên và họ.
     * Chú ý, không thay đổi thứ tự sinh viên trong danh sách gốc.
     *
     * @param order
     * @return danh sách các sinh viên đã được sắp xếp
     */
    public MyList sortByFullname(boolean order) {
        /*
         TODO

         - Sửa lại lớp Student để sử dụng MyComparable để thực hiện việc so sánh các Student theo tên và họ.
           Thứ tự đầu tiên phụ thuộc vào tên, nếu tên bằng nhau thì thứ tự phụ thuộc vào họ.

         - Sử dụng tiêu chí so sánh trong MyComparable, viết code để sắp xếp danh sách các sinh viên theo thứ tự
           phụ thuộc tham số order. Nếu order là true thì sắp xệp theo thứ tự tăng dần. Nếu order là false thì
           sắp xếp theo thứ tự giảm dần.

         - Trả ra danh sách sinh viên mới đã được sắp thứ tự.
         */

        // Tạo mảng chứa các sinh viên từ danh sách gốc.
        int n = students.size();
        Student[] array = new Student[n];
        for (int i = 0; i < n; i++) {
            array[i] = (Student) students.get(i);
        }

        // Sắp xếp mảng theo tiêu chí của compareTo() trong Student
        Arrays.sort(array);

        // Nếu yêu cầu sắp xếp giảm dần thì đảo ngược mảng.
        if (!order) {
            for (int i = 0; i < n / 2; i++) {
                Student temp = array[i];
                array[i] = array[n - 1 - i];
                array[n - 1 - i] = temp;
            }
        }
        // Tạo một danh sách mới và thêm các sinh viên đã được sắp xếp.
        MyList sortedList = new MyArrayList();
        for (int i = 0; i < n; i++) {
            sortedList.append(array[i]);
        }
        return sortedList;
    }

    /**
     * Lấy ra danh sách các sinh viên được sắp xếp theo average.
     * Chú ý, không thay đổi thứ tự sinh viên trong danh sách gốc.
     *
     * @param order
     * @return
     */
    public MyList sortByAverage(boolean order) {
        /*
         TODO

         - Thêm lớp AverageComparison sử dụng StudentComparator để có thể so sánh các sinh viên theo average.

         - Viết code sử dụng AverageComparison để sắp xếp sinh viên theo thứ tự phụ thuộc tham số order.
           Nếu order là true thì sắp xệp theo thứ tự tăng dần. Nếu order là false thì sắp xếp theo thứ tự giảm dần.

         - Trả ra danh sách các sinh viên mới đã được sắp xếp.
         */

        int n = students.size();
        Student[] array = new Student[n];
        for (int i = 0; i < n; i++) {
            array[i] = (Student) students.get(i);
        }

        // Sử dụng AverageComparison để sắp xếp theo average (tăng dần)
        Arrays.sort(array, new AverageComparison());

        // Nếu order là false, đảo ngược mảng để có thứ tự giảm dần.
        if (!order) {
            for (int i = 0; i < n / 2; i++) {
                Student temp = array[i];
                array[i] = array[n - 1 - i];
                array[n - 1 - i] = temp;
            }
        }
        // Tạo một danh sách mới và thêm các sinh viên đã được sắp xếp.
        MyList sortedList = new MyArrayList();
        for (int i = 0; i < n; i++) {
            sortedList.append(array[i]);
        }
        return sortedList;
    }
}
