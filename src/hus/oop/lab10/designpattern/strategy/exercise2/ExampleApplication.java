package hus.oop.lab10.designpattern.strategy.exercise2;

import java.util.Scanner;

class ExampleApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result;

        // Read input from the user
        System.out.print("Read first number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Read last number:");
        int lastNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Read the desired action from user input: ");
        String action = scanner.nextLine().trim().toLowerCase();

        Context context = new Context();

        // Set the appropriate strategy based on the user's choice
        switch (action) {
            case "addition":
                context.setStrategy(new ConcreteStrategyAdd());
                break;
            case "subtraction":
                context.setStrategy(new ConcreteStrategySubtract());
                break;
            case "multiplication":
                context.setStrategy(new ConcreteStrategyMultiply());
                break;
            default:
                System.out.println("Invalid action.");
                scanner.close();
                return;
        }

        // Execute the strategy and get the result
        result = context.executeStrategy(firstNumber, lastNumber);

        // Print the result
        System.out.println("Result: " + result);
        scanner.close();

    }
}