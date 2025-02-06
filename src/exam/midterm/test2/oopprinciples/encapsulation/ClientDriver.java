package exam.midterm.test2.oopprinciples.encapsulation;

public class ClientDriver {
    public static void main(String[] args) {

        // Trong ví dụ này, các thuộc tính name và age được khai báo là private,
        // điều này có nghĩa là chúng không thể truy cập trực tiếp từ bên ngoài lớp Person.
        // Thay vào đó, chúng ta cung cấp các phương thức getName(), setName(), getAge() và setAge()
        // để truy cập và thay đổi giá trị của các thuộc tính.
        // Thông qua việc sử dụng phương thức getter và setter, chúng ta có thể kiểm soát quyền truy cập
        // và kiểm tra các giá trị trước khi gán vào thuộc tính. Điều này giúp bảo vệ tính toàn vẹn dữ liệu
        // và cung cấp một giao diện ổn định để làm việc với các thuộc tính của đối tượng.
        Person person = new Person();
        person.setName("John");
        person.setAge(25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }

}
