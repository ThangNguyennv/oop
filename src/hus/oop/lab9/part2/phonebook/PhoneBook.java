package hus.oop.lab9.part2.phonebook;

public interface PhoneBook {
    void addPerson(Student p);

    Student searchByName(String name);

    Student searchByLastName(String lastname);

    Student searchByNumber(String phone);

    void deleteByNumber(String phone);
}
