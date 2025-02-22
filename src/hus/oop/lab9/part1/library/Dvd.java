package hus.oop.lab9.part1.library;

public class Dvd extends Item {
    int duration;

    public Dvd(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Dvd[" + "duration=" + duration + ", title=" + "\"" + super.getTitle() + ", year=" + super.getYear() + "]";
    }
}
