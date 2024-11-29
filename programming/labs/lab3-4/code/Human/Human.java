package org.example.Human;

public abstract class Human{
    protected final String name;

    protected Human(String name) {
        this.name = name;
    }

    public abstract String getName();
}