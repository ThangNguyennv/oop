package hus.oop.lab6.part1.exercise2;

public class TestStaffStudent {
    public static void main(String[] args) {

        Student student1 = new Student("Huy", "Ha Long", "CNTT", 2000, 200);
        System.out.println(student1);
        student1.setAddress("Ha Noi");
        student1.setFee(500);
        student1.setProgram("KTMT");
        student1.setYear(1999);
        System.out.println("Name: " + student1.getName());
        System.out.println("Address: " + student1.getAddress());
        System.out.println("Program: " + student1.getProgram());
        System.out.println("Year: " + student1.getYear());
        System.out.println("Fee: " + student1.getFee());

        System.out.println("---------------------------");

        Staff staff1 = new Staff("Long", "Ninh Binh", "HUS", 300);
        System.out.println(staff1);
        staff1.setAddress("Vinh Phuc");
        staff1.setPay(100);
        staff1.setSchool("UET");
        System.out.println("Name: " + staff1.getName());
        System.out.println("Address: " + staff1.getAddress());
        System.out.println("School: " + staff1.getSchool());
        System.out.println("Pay: " + staff1.getPay());
    }
}
