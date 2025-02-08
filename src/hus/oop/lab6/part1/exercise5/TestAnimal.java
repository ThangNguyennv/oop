package hus.oop.lab6.part1.exercise5;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        System.out.println(cat);
        cat.greets();

        System.out.println("------------------------");

        Dog dog1 = new Dog("Dog1");
        System.out.println(dog1);
        dog1.greets();

        System.out.println("------------------------");

        Dog dog2 = new Dog("Dog2");
        System.out.println(dog2);
        dog1.greets(dog2);
    }
}
