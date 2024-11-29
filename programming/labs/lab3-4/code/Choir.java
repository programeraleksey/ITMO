package org.example;

import org.example.Enums.SongStates;
import org.example.Human.Singer;
import org.example.Interfaces.Singing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Choir implements Singing {
    private ArrayList<Singer> singers;
    private Song currentSong;
    private SongStates songState;
    private boolean Crying;

    public Choir(){
        this.songState = SongStates.NOT_STARTED;
        singers = new ArrayList<>();
        Crying = false;
    }

    @Override
    public String sing(Song song){
        if ((this.songState == SongStates.NOT_STARTED | this.songState == SongStates.ENDED)
                && this.isKnowTheSong(song)){
            for (Singer singer : this.singers){
                singer.sing(song);
            }
            this.songState = SongStates.JUST_STARTED;
            this.currentSong = song;
            return "Певцы " + this.getNames() + " запели песню " + this.currentSong.getName();
        }
        return "";

    }
    @Override
    public String stopSinging(){
        if (this.songState != SongStates.NOT_STARTED){
            for (Singer singer : this.singers){
                singer.stopSinging();
            }
            this.songState = SongStates.ENDED;
            this.currentSong = null;
            return "Певцы " + this.getNames() + " перестали петь";
        }
        return "";
    }

    @Override
    public String cry(){
        if (!Crying) {
            Crying = true;
            this.songState = SongStates.ENDED;
            String state = "";
            switch (this.songState){
                case NEAR_TO_END -> state = " под конец песенки";
            }
            return "Певцы " + state + this.getNames() + "заплакали. ";
        }
        return "";
    }
    @Override
    public String stopCrying(){
        if (Crying) {
            Crying = false;
            return "Певцы " + this.getNames() + " перестали плакать";
        }
        return "";
    }
    @Override
    public void changeSongState(SongStates state){
        for (Singer singer: this.singers){
            singer.changeSongState(state);
        }
        this.songState = state;
    }

    public void addSinger(Singer singer){
        if (songState == SongStates.NOT_STARTED && singer.getSongState() == SongStates.NOT_STARTED){
            singers.add(singer);
        }
    }
    @Override
    public void addSong(Song song){
        for (Singer s: this.singers){
            s.addSong(song);
        }
    }
    @Override
    public boolean isKnowTheSong(Song song){
        boolean flag = true;
        for (Singer singer: this.singers){
            if (!singer.isKnowTheSong(song)){
                flag = false;
                break;
            }
        }
        return flag;
    }
    @Override
    public String getCurrentSongName(){
        try{
            return this.currentSong.getName();
        }catch(NullPointerException e){
            return "Никакая песня сейчас не поется.";
        }
    }

    public String getNames(){
        StringBuilder answer = new StringBuilder();
        for (Singer singer: this.singers){
            answer.append(singer.getName()).append(" ");
        }
        return answer.toString();
    }
    @Override
    public SongStates getSongState(){
        return this.songState;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Choir choir = (Choir) o;
        return this.singers.containsAll(choir.singers) && choir.singers.containsAll(this.singers);
    }
    @Override
    public int hashCode(){
        Set<Singer> set = new HashSet<>(singers);
        return Objects.hash(set);
    }
    @Override
    public String toString() {
        return "Choir{singers='" + this.getNames() + "'" + "}";
    }
}