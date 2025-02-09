package hus.oop.lab10.designpattern.strategy.exercise4;

public class TextEditor {
    private TextFormatter formatter;

    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }

    // Publishes (prints) the formatted text.
    public void publishText(String text) {
        if (formatter == null) {
            throw new IllegalStateException("Text formatter is not set.");
        }
        String formattedText = formatter.format(text);
        System.out.println("Formatted text: " + formattedText);
    }
}
