package hus.oop.lab11.designpattern.iterator.exercise2;

interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileId);

    ProfileIterator createCoworkersIterator(String profileId);
}