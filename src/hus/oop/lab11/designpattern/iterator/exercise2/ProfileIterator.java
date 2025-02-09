package hus.oop.lab11.designpattern.iterator.exercise2;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}