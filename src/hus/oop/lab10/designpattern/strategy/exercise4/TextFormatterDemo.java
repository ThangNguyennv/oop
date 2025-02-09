package hus.oop.lab10.designpattern.strategy.exercise4;

import java.util.Scanner;

public class TextFormatterDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read text input from the user.
        System.out.println("Enter a text:");
        String text = scanner.nextLine();

        // Ask the user for the desired formatting.
        System.out.println("Choose a formatting option (upper, lower, title):");
        String option = scanner.nextLine().trim().toLowerCase();

        // Create a context (TextEditor) and set the appropriate strategy.
        TextEditor editor = new TextEditor();
        switch (option) {
            case "upper":
                editor.setFormatter(new UpperCaseFormatter());
                break;
            case "lower":
                editor.setFormatter(new LowerCaseFormatter());
                break;
            case "title":
                editor.setFormatter(new TitleCaseFormatter());
                break;
            default:
                System.out.println("Invalid option.");
                scanner.close();
                return;
        }

        // Publish the text using the selected formatting strategy.
        editor.publishText(text);
        scanner.close();
    }
}
