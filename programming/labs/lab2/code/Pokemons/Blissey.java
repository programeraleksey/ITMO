package org.example.Pokemons;

import org.example.Attaks.SoftBoiled;
import ru.ifmo.se.pokemon.Type;

public class Blissey extends Chansey{
    public Blissey(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.NORMAL);
        this.setStats(255, 10, 10, 75, 135, 55);
        super.addMove(new SoftBoiled());
    }
}
