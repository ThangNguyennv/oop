package hus.oop.lab10.designpattern.observer.exercise1;

public record EmailMsgListener(String email) implements Listener {
    @Override
    public void update(Event eventType) {
        // Actually send the mail
        System.out.println("Sending mail to " + email + " concerning " + eventType);
    }
}