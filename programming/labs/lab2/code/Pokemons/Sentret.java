package org.example.Pokemons;

import org.example.Attaks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sentret extends Pokemon {
    public Sentret(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.NORMAL);
        this.setStats(35, 46, 34, 35, 45, 20);
        super.addMove(new Facade());
        super.addMove(new HyperVoice());
        super.addMove(new FurySwipes());
    }
}
