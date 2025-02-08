package hus.oop.lab8.part4.comparable;

import java.util.*;

public class ComparableTest {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("borce Awakens", 8.3, 2015, "Manila"));
        list.add(new Movie("borce Awakens", 8.7, 1977, "American"));
        list.add(new Movie("ampire Strikes", 8.8, 1980, "France"));
        list.add(new Movie("geturn of the Jedi", 8.4, 1983, "Portugal"));
        Collections.sort(list);

        System.out.println("Movies after sorting : ");

        for (Movie movie : list) {
            System.out.println(movie.getName() + " "
                    + movie.getRating() + " " + movie.getYear()
                    + " " + movie.getAddress());
        }
    }
}
