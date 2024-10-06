package org.example.Attaks;

import ru.ifmo.se.pokemon.*;

public class MudBomb extends SpecialMove {
    public MudBomb() {
        super(Type.GROUND, 65, 0.85);
    }
    @Override
    public void applyOppEffects(Pokemon p) {
        p.setCondition(new Effect().chance(0.3).stat(Stat.ACCURACY, -1).turns(1));
    }
    @Override
    protected String describe() {
        return "использует атаку Mud Bomb";
    }
}