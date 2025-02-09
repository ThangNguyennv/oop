package hus.oop.lab10.designpattern.observer.exercise2;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("OctalObserver new update: " + subject.getState());
    }
}
