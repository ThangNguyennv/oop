package hus.oop.lab4.part2.exercise1;

public class TestAuthor {
    public static void main(String[] args) {

        // Test constructor
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');

        // Test toString();
        System.out.println(ahTeck);

        // Test setter
        ahTeck.setEmail("paulTan@nowhere.com");

        // Test getter
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());
    }
}
