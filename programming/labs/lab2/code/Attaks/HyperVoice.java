package org.example.Attaks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class HyperVoice extends SpecialMove {
    public HyperVoice() {
        super(Type.NORMAL, 90, 1);
    }
    @Override
    protected String describe() {
        return "использует атаку Hyper Voice";
    }
}
