package exam.midterm.test2.oopprinciples.inheritance;

public class ClientDriver {
    public static void main(String[] args) {

        // Trong ví dụ này, lớp Shape là lớp cha chứa thuộc tính color và phương thức getter/setter cho color.
        // Nó cũng có một phương thức getArea() trả về diện tích của hình học (trong trường hợp này là 0.0).
        //
        //Lớp con Circle và Rectangle kế thừa từ lớp Shape. Chúng mở rộng (override) phương thức getArea()
        // để tính diện tích của hình tròn và hình chữ nhật, tương ứng với các thuộc tính riêng của chúng.

        // Lớp con Circle và Rectangle kế thừa thuộc tính color và phương thức getColor() từ lớp cha Shape,
        // và mở rộng phương thức getArea() để tính diện tích của hình tròn và hình chữ nhật. Điều này
        // cho phép tái sử dụng mã nguồn và tạo ra các đối tượng hình học khác nhau dựa trên lớp cha chung.
        Circle circle = new Circle("Red", 5.0);
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.getArea());

        Rectangle rectangle = new Rectangle("Blue", 3.0, 4.0);
        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle length: " + rectangle.getLength());
        System.out.println("Rectangle width: " + rectangle.getWidth());
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
}
