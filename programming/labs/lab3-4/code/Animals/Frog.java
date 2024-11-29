package org.example.Animals;

import org.example.Enums.TypesOfAnimals;

public class Frog extends Animal {
    private boolean hungry;

    public Frog(String name, String color) {
        super(name, color, TypesOfAnimals.INVERTEBRATE);
        this.hungry = true;
    }

    @Override
    public TypesOfAnimals getType() {
        return this.type;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String eat(Grasshopper animal) {
        try {
            if (this.hungry && animal.isAlive()) {
                animal.die();
                this.hungry = false;
                return "Прожорливая лягушка " + this.name + " съела кузнечика " + animal.getName() + ". ";
            }
        } catch (NullPointerException e) {
            return ("Лягушка " + this.name + " попыталась съесть кузнечика " + animal + ", но оказалось что его не существует. ");
        }
        return "";
    }
}