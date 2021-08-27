package com.fdananda.gitdatabinding;

public class User {
    public final String firstName;
    public final String lastName;
    public final int age;
    public final Boolean loggedIn;

    public User(String firstName, String lastName, int age, Boolean loggedIn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.loggedIn = loggedIn;
    }
}
