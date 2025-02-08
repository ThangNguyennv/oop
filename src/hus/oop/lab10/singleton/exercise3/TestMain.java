package hus.oop.lab10.singleton.exercise3;

public class TestMain {
    public static void main(String[] args) {
        // Get the singleton instance
        Data data1 = Data.getInstance("Initial data");
        // Access and modify data
        System.out.println("Initial data: " + data1.getData());
        Data data2 = Data.getInstance("New data");
        System.out.println("Updated data: " + data2.getData());
    }
}

