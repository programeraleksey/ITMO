package org.example.Pokemons;

import org.example.Attaks.FireBlast;
import org.example.Attaks.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Happiny extends Pokemon {
    public Happiny(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.NORMAL);
        this.setStats(100, 5, 5, 15, 65, 30);
        super.addMove(new FireBlast());
        super.addMove(new Psychic());
    }
}
