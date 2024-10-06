package org.example.Attaks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 1);
    }
    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        if (def.getCondition() == Status.BURN || def.getCondition() == Status.PARALYZE || def.getCondition() == Status.POISON) {
            return (0.4 * (double)att.getLevel() + 2.0) * (this.power * 2) / 150.0;
        }
        return (0.4 * (double)att.getLevel() + 2.0) * this.power / 150.0;
    }
    @Override
    protected String describe() {
        return "использует атаку Facade";
    }
}