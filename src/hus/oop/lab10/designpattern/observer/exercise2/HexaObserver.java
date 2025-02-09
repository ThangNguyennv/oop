package hus.oop.lab10.designpattern.observer.exercise2;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
    }

    public void update() {
        System.out.println("HexaObserver new update: " + subject.getState());
    }
}
