package org.example.Attaks;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public Psychic() {
        super(Type.PSYCHIC, 90, 1);
    }
    @Override
    public void applyOppEffects(Pokemon p) {
        p.setCondition(new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, 1).turns(1));
    }
    @Override
    protected String describe() {
        return "использует атаку Psychic";
    }
}