package hus.oop.lab10.strategy.exercise2;

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
        String action = scanner.nextLine();

        Context context = new Context(new ConcreteStrategyAdd());
        result = context.executeStrategy(firstNumber, lastNumber);

        // Set the appropriate strategy based on the user's choice
        if (action.equals("addition")) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (action.equals("subtraction")) {
            context.setStrategy(new ConcreteStrategySubtract());
        } else if (action.equals("multiplication")) {
            context.setStrategy(new ConcreteStrategyMultiply());
        } else {
            System.out.println("Invalid action.");
            return;
        }

        // Execute the strategy and get the result

        // Print the result
        System.out.println("Result: " + result);

    }
}