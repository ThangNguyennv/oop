package hus.oop.lab8.part4.comparable;

public class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;
    private String address;

    public Movie() {

    }

    public Movie(String name, double rating, int year, String address) {
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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
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
        if (name.compareTo(movie.name) != 0) {
            return name.compareTo(movie.name);
        }
        return address.compareTo(movie.address);
    }
}
