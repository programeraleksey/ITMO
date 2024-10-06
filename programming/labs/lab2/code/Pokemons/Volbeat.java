package org.example.Pokemons;

import org.example.Attaks.Facade;
import org.example.Attaks.Roost;
import org.example.Attaks.ShadowBall;
import org.example.Attaks.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.*;

public class Volbeat extends Pokemon {
    public Volbeat(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.BUG);
        this.setStats(65, 73, 75, 47, 85, 85);
        super.addMove(new Facade());
        super.addMove(new ShadowBall());
        super.addMove(new Thunderbolt());
        super.addMove(new Roost());
    }
}