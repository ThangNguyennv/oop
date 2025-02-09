package hus.oop.lab10.designpattern.strategy.exercise4;

public class TitleCaseFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        String[] words = text.split("\\s+");
        StringBuilder formatted = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                formatted.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    formatted.append(word.substring(1).toLowerCase());
                }
                formatted.append(" ");
            }
        }
        return formatted.toString().trim();
    }
}
