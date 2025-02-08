package hus.oop.lab7.part1.exercise6;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat("meo1");
        cat1.greets();

        System.out.println("--------------------");

        Dog dog1 = new Dog("cho1");
        Dog dog2 = new Dog("cho2");
        dog1.greets();
        dog1.greets(dog2);

        System.out.println("--------------------");

        BigDog bigDog1 = new BigDog("choTo1");
        bigDog1.greets();
        bigDog1.greets(dog2);

        System.out.println("--------------------");

        Animal dog3 = new Dog("cho3"); // Upcast
        dog3.greets();

        System.out.println("--------------------");

        Dog dog4 = (Dog) dog3; // Downcast
        dog4.greets(dog2);

        System.out.println("--------------------");

        Animal cat3 = new Cat("meo3"); // Upcast
        cat3.greets();

    }
}
