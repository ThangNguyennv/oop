package hus.oop.lab11.designpattern.factorymethod.exercise1;

public class Test {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new Webdialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}