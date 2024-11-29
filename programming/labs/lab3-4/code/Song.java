package org.example;

import org.example.Enums.*;

import java.util.Objects;

public record Song(String name, Moods mood, Duration duration){
    public String getName(){
        return this.name;
    }
    public String be(){
        String stat = "";
        switch (this.mood){
            case SAD -> stat = "печальная";
            case FUNNY -> stat = "веселая";
        }
        return "Песенка была " + stat + ". ";
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(name, song.name) && Objects.equals(mood, song.mood) && Objects.equals(duration, song.duration);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, mood, duration);
    }
    @Override
    public String toString() {
        return "Song{name='" + name + "'" + ", mood=" + mood + ", duration=" + duration + "}";
    }
}
