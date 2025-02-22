package hus.oop.lab8.part4.comparator;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie left, Movie right) {
        return Double.compare(left.getRating(), right.getRating()); // Tăng dần
    }
}
