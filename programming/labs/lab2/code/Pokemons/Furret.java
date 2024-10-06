package org.example.Pokemons;

import org.example.Attaks.Blizzard;
import ru.ifmo.se.pokemon.Type;

public class Furret extends Sentret{
    public Furret(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.NORMAL);
        this.setStats(85, 76, 64, 45, 55, 90);
        super.addMove(new Blizzard());
    }
}
