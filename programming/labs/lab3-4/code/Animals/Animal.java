package org.example.Animals;

import org.example.Enums.TypesOfAnimals;

import java.lang.reflect.Type;

public abstract class Animal {
    protected final String name;
    protected final String color;
    protected final TypesOfAnimals type;

    protected Animal(String name, String color, TypesOfAnimals type){
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public abstract TypesOfAnimals getType();
    public abstract String getColor();
    public abstract String getName();
}
