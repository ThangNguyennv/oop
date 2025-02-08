package hus.oop.lab9.part1.library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class TestApp {
    public static void main(String[] args) throws ParseException {

        Item item1 = new Book("Soffocare", 2002, 170);
        Item item2 = new Dvd("Moon", 2011, 130);
        Student student1 = new Student("0001", "Darrell", "Abbott");
        Student student2 = new Student("0002", "Nick", "Drake");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Rent[] rents = new Rent[5];
        rents[0] = new Rent(item1, student1, simpleDateFormat.parse("15/06/2020"), simpleDateFormat.parse("15/07/2020"));
        rents[1] = new Rent(item1, student2, simpleDateFormat.parse("10/07/2020"), simpleDateFormat.parse("20/07/2020"));
        rents[2] = new Rent(item1, student1, simpleDateFormat.parse("25/08/2020"), simpleDateFormat.parse("14/11/2020"));
        rents[3] = new Rent(item1, student2, simpleDateFormat.parse("10/07/2020"), simpleDateFormat.parse("20/07/2020"));
        rents[4] = new Rent(item1, student1, simpleDateFormat.parse("25/08/2020"), simpleDateFormat.parse("28/08/2020"));

        Library library = new Library(rents);
        System.out.println(library.getLongestRent());
    }
}
