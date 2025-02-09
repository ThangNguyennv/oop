package hus.oop.lab10.designpattern.adapter.exercise2;

public class BusinessAnalyst implements Customer {
    private Developer developer;

    public BusinessAnalyst(Developer dev) {
        this.developer = dev;
    }

    @Override
    public void sendRequest(String request) {
        System.out.println("Reading request...");
        System.out.println(request);
        String information = this.translate(request);
        System.out.println("Sending information...");
        developer.receive(information);
    }

    private String translate(String request) {
        return "Create Google Meet";
    }
}
