package org.example.Pokemons;

import org.example.Attaks.MudBomb;
import ru.ifmo.se.pokemon.Type;

public class Chansey extends Happiny{
    public Chansey(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.NORMAL);
        this.setStats(250, 5, 5, 35, 105, 50);
        super.addMove(new MudBomb());
    }
}
