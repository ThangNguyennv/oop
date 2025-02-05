package exam.midterm.test2.oopprinciples.polymorphism;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}