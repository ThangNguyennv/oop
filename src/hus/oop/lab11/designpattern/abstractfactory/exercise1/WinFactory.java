package hus.oop.lab11.designpattern.abstractfactory.exercise1;

public class WinFactory implements GUIFactory {
    public Button createButton() {
        return new WinButton();
    }

    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
