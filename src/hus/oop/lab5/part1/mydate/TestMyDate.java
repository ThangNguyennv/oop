package hus.oop.lab5.part1.mydate;

import javax.imageio.IIOException;

public class TestMyDate {
    public static void main(String[] args) throws IIOException {

        MyDate date1 = new MyDate(2003, 8, 31);
        if (date1.isValidDate(2003, 8, 31) == true) {
            System.out.println(date1);
            System.out.println(date1.nextDay());
            System.out.println(date1.nextDay());
            System.out.println(date1.nextMonth());
            System.out.println(date1.nextYear());
        } else {
            throw new IIOException("Invalid year, month or day!");
        }

        MyDate date2 = new MyDate(2012, 1, 2);
        if (date2.isValidDate(2012, 1, 2) == true) {
            System.out.println(date2);
            System.out.println(date2.previousDay());
            System.out.println(date2.previousDay());
            System.out.println(date2.previousMonth());
            System.out.println(date2.previousYear());
        } else {
            throw new IIOException("Invalid year, month or day!");
        }

        MyDate date3 = new MyDate(2012, 2, 29);
        if (date3.isValidDate(2012, 2, 29) == true) {
            System.out.println(date3.previousYear());
        } else {
            throw new IIOException("Invalid year, month or day!");
        }

        //Invalid year, month or day!
        MyDate date4 = new MyDate(2099, 11, 31);
        if (date4.isValidDate(2099, 11, 31) == true) {
            System.out.println(date4);
        } else {
            throw new IIOException("Invalid year, month or day!");
        }

        //Invalid year, month or day!
        MyDate date5 = new MyDate(2011, 2, 29);
        if (date5.isValidDate(2011, 2, 29) == true) {
            System.out.println(date5);
        } else {
            throw new IIOException("Invalid year, month or day!");
        }
    }
}
