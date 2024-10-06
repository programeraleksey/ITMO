package org.example;

import ru.ifmo.se.pokemon.Battle;
import org.example.Pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Volbeat p1 = new Volbeat("Чужой", 1);
        Furret p2 = new Furret("Хищник", 1);
        Blissey p3 = new Blissey("Котик", 1);
        Chansey p4 = new Chansey("Зайчик", 1);
        Sentret p5 = new Sentret("Терминатор", 1);
        Happiny p6 = new Happiny("Убийца", 1);
        b.addAlly(p1);
        b.addAlly(p5);
        b.addAlly(p3);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);
        b.go();
    }
}
