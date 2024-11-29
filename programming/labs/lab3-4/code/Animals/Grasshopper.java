package org.example.Animals;

import org.example.Enums.TypesOfAnimals;

public class Grasshopper extends Animal{
    private boolean alive;

    public Grasshopper(String name, String color){
        super(name, color, TypesOfAnimals.INVERTEBRATE);
        this.alive = true;
    }
    @Override
    public TypesOfAnimals getType(){
     return this.type;
    }
    @Override
    public String getColor(){
        return this.color;
    }
    @Override
    public String getName(){
        return this.name;
    }
    public boolean isAlive(){
        return this.alive;
    }
    public String die(){
        if (this.alive) {
            this.alive = false;
            return "К сожалению кузнечик " + this.name + " умер. ";
        }
        return "";
    }
    public String jump(){
        return "Кузнечик перепрыгнул на другую травинку. ";
    }
}
