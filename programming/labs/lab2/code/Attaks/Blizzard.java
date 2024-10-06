package org.example.Attaks;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public Blizzard() {
        super(Type.ICE, 110, 0.7);
    }
    @Override
    public void applyOppEffects(Pokemon p) {
        p.setCondition(new Effect().chance(0.1).condition(Status.FREEZE));
    }
    @Override
    protected String describe() {
        return "использует атаку Blizzard";
    }
}
