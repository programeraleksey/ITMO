package org.example.Attaks;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
    public FireBlast() {
        super(Type.FIRE, 110, 0.85);
    }
    @Override
    public void applyOppEffects(Pokemon p) {
        p.setCondition(new Effect().chance(0.1).condition(Status.BURN));
    }
    @Override
    protected String describe() {
        return "использует специальную Fire Blast";
    }
}
