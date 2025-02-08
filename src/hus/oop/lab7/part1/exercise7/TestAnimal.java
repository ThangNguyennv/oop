package hus.oop.lab7.part1.exercise7;

public class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting();

        System.out.println("--------------------");

        Dog dog1 = new Dog();
        dog1.greeting();

        System.out.println("--------------------");

        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();

        System.out.println("--------------------");

        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greeting();

        System.out.println("--------------------");

        Animal animal2 = new Dog();
        animal2.greeting();

        System.out.println("--------------------");

        Animal animal3 = new BigDog();
        animal3.greeting();

        System.out.println("--------------------");

        // Downcast
        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;
        Cat cat2 = (Cat) animal1;

        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }
}
