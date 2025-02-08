package hus.oop.lab8.part4.comparator;

import java.io.*;
import java.util.*;

public class Movie implements Comparable<Movie> {
    private String name;
    private Double rating;
    private int year;
    private String address;

    public Movie() {

    }

    public Movie(String name, Double rating, int year, String address) {
        this.name = name;
        this.rating = rating;
        this.year = year;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int compareTo(Movie movie) {
        return Double.compare(this.rating, movie.rating);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                ", address='" + address + '\'' +
                '}';
    }
}
