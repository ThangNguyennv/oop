package hus.oop.lab10.singleton.exercise2;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        Database bar = Database.getInstance();
        foo.connect();
        foo.query("SELECT * FROM nhanVien");

        bar.connect();
        bar.disConnect();

        System.out.println("Is the database connected? " + foo.IsConnected());
        System.out.println("Is the database connected? " + bar.IsConnected());
    }
}
