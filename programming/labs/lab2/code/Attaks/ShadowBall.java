package org.example.Attaks;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 1);

    }
    @Override
    public void applyOppEffects(Pokemon p) {
        p.setCondition(new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1).turns(1));
    }
    @Override
    public String describe() {
        return "использует атаку \"теневой шар\"";
    }
}
