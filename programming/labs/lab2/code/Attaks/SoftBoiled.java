package org.example.Attaks;

import ru.ifmo.se.pokemon.*;

public class SoftBoiled extends StatusMove {
        @Override
        protected String describe() {
        return "Лечит себя с помощью Soft-Boiled";
        }
        @Override
        protected void applySelfEffects(Pokemon pokemon) {
            pokemon.setMod(Stat.HP, -( (int) (pokemon.getStat(Stat.HP) / 2)));
        }

}
