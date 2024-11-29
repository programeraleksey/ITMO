package org.example.Human;

import org.example.Enums.SongStates;
import org.example.Interfaces.Singing;
import org.example.Song;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

public class Singer extends Human implements Singing{
    private Song currentSong ;
    private final ArrayList<Song> songs;
    private SongStates songState;
    private boolean Crying;

    public Singer(String name) {
        super(name);
        Crying = false;
        songState = SongStates.NOT_STARTED;
        songs = new ArrayList<>();
    }
    @Override
    public String sing(Song song){
        if (this.isKnowTheSong(song) && (this.songState == SongStates.NOT_STARTED | this.songState ==
                SongStates.ENDED)){
            songState = SongStates.JUST_STARTED;
            currentSong = song;
            return "Певец" + this.getName() + " запел песню " + this.currentSong.getName();
        }
        return "";
    }
    @Override
    public String stopSinging(){
        if (this.songState != SongStates.NOT_STARTED){
            this.songState = SongStates.ENDED;
            this.currentSong = null;
            return "Певец " + this.name + " прекратил петь песню";
        }
        return "";
    }
    @Override
    public String cry(){
        if (!Crying) {
            Crying = true;
            this.songState = SongStates.ENDED;
            return "Певец " + this.getName() + " зарыдал";
        }
        return "";
    }
    @Override
    public String stopCrying(){
        if (Crying) {
            Crying = false;
            return "Певец " + this.getName() + " перестал плакать";
        }
        return "";
    }
    @Override
    public boolean isKnowTheSong(Song song){
        return this.songs.contains(song);
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public String getCurrentSongName(){
        return currentSong.getName();
    }

    @Override
    public SongStates getSongState(){
        return songState;
    }

    @Override
    public void addSong(Song song){
        if (!this.songs.contains(song)){
            this.songs.add(song);
        }
    }

    @Override
    public void changeSongState(SongStates state){
        this.songState = state;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Singer singer = (Singer) o;
        return Objects.equals(name, singer.name) && this.songs.containsAll(singer.songs) && singer.songs.containsAll(this.songs);
    }
    @Override
    public int hashCode(){
        Set<Song> set = new HashSet<>(songs);
        return Objects.hash(name, set);
    }
    @Override
    public String toString() {
        return "Singer{name='" + name + "'" + "}";
    }
}
