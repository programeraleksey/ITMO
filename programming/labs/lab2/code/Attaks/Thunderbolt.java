package org.example.Attaks;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt() {
        super(Type.ELECTRIC, 90, 1);
    }
    public void applyOppEffects(Pokemon p) {
        p.setCondition(new Effect().chance(0.1).condition(Status.PARALYZE));
    }
    @Override
    public String describe() {
        return "использует атаку Thunderbolt";
    }
}
