package org.example;

import org.example.Animals.Frog;
import org.example.Animals.Grasshopper;
import org.example.Enums.Duration;
import org.example.Enums.Moods;
import org.example.Enums.SongStates;
import org.example.Human.Singer;

public class Main {
    public static void main(String[] args) {
        StringBuilder tale = new StringBuilder();
        Frog frog = new Frog("frog", "зеленый");
        Grasshopper gras = new Grasshopper("grasshopper", "зеленый");
        Singer s1 = new Singer("singer1");
        Singer s2 = new Singer("singer2");
        Choir c1 = new Choir();
        c1.addSinger(s1);
        c1.addSinger(s2);
        Song song = new Song("про кузнечика", Moods.SAD, Duration.SHORT);
        c1.addSong(song);
        c1.changeSongState(SongStates.NEAR_TO_END);
        tale.append(song.be());
        tale.append(c1.cry());
        tale.append(frog.eat(gras));
        Tears x = new Tears();
        tale.append(x.flow());
        System.out.println(tale);
    }
}