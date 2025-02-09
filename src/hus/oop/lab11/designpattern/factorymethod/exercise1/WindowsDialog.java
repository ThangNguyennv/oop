package hus.oop.lab11.designpattern.factorymethod.exercise1;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
