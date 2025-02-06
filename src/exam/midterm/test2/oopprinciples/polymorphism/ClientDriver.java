package exam.midterm.test2.oopprinciples.polymorphism;

public class ClientDriver {
    public static void main(String[] args) {

        // Trong ví dụ này, lớp Animal là lớp cha chứa phương thức makeSound(),
        // mô phỏng âm thanh của một con vật. Lớp con Dog và Cat kế thừa từ
        // lớp Animal và mở rộng phương thức makeSound() để phát ra âm thanh riêng của chúng.

        // Khi gọi phương thức makeSound() trên đối tượng animal, nó thực hiện hành vi
        // mặc định của lớp cha. Tuy nhiên, khi gọi phương thức makeSound() trên
        // đối tượng dog hoặc cat, nó thực hiện hành vi đã được mở rộng của lớp con tương ứng.
        // Điều này cho phép chúng ta sử dụng một tham chiếu của lớp cha để thực hiện
        // hành vi đa hình trên các đối tượng con khác nhau.
        Animal animal = new Animal();
        animal.makeSound();  // "The animal makes a sound"

        Animal dog = new Dog();
        dog.makeSound();  // "The dog barks"

        Animal cat = new Cat();
        cat.makeSound();  // "The cat meows"
    }
}
