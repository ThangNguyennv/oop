package hus.oop.lab8.part4.comparator;

import java.util.*;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Dorce Awakens", 8.3, 2015, "Manila"));
        list.add(new Movie("Btar Wars", 8.8, 1977, "American"));
        list.add(new Movie("Ampire Strikes", 8.5, 1980, "France"));
        list.add(new Movie("Ceturn of the Jedi", 8.4, 1983, "Portugal"));
        Collections.sort(list, new NameCompare());
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
        }
    }
}
