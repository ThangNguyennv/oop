package hus.oop.lab11.designpattern.factorymethod.exercise1;

public class Webdialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
