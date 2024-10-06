package org.example.Attaks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;

public class Roost extends StatusMove {
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, -( (int) (pokemon.getStat(Stat.HP) / 2)));
    }
    @Override
    protected String describe() {
        return "Лечит себя с помощью Roost";
    }
}
