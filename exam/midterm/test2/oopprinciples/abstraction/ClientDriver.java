package exam.midterm.test2.oopprinciples.abstraction;

public class ClientDriver {
    public static void main(String[] args) {

        // Trong ví dụ này, lớp trừu tượng Shape định nghĩa một phương thức
        // trừu tượng calculateArea(), nhưng không cung cấp triển khai cụ thể
        // cho nó. Các lớp con Circle và Rectangle kế thừa từ lớp Shape và phải triển
        // khai phương thức calculateArea() theo cách riêng của chúng.

        // Trong ví dụ này, chúng ta có thể tạo ra các đối tượng Circle và Rectangle
        // thông qua tham chiếu của lớp trừu tượng Shape. Mặc dù lớp trừu tượng
        // không cung cấp một triển khai cụ thể cho phương thức calculateArea(),
        // nhưng khi gọi phương thức này trên các đối tượng circle và rectangle,
        // nó sẽ thực hiện triển khai tương ứng của lớp con. Điều này cho phép
        // chúng ta trừu tượng hóa khái niệm chung của một hình học và tính diện tích
        // của các hình học cụ thể mà không cần biết triển khai chi tiết của từng hình học đó.
        Shape circle = new Circle(5.0);
        double circleArea = circle.calculateArea();

        Shape rectangle = new Rectangle(3.0, 4.0);
        double rectangleArea = rectangle.calculateArea();

        System.out.println("Circle area: " + circleArea);
        System.out.println("Rectangle area: " + rectangleArea);
    }
}
