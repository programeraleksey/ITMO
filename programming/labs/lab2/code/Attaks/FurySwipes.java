package org.example.Attaks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FurySwipes extends PhysicalMove {
    public FurySwipes( ) {
        super(Type.NORMAL, 18, 0.8, 1, ((int) (Math.random() / 0.25) + 1));
    }
    @Override
    protected String describe() {
        return "использует атаку Furry Swipes";
    }
}