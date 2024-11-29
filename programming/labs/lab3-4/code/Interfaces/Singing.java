package org.example.Interfaces;

import org.example.Song;
import org.example.Enums.SongStates;

public interface Singing{
  String sing(Song song);
  String stopSinging();
  String cry();
  String stopCrying();
  void addSong(Song song);
  void changeSongState(SongStates state);
  boolean isKnowTheSong(Song song);
  String getCurrentSongName();
  SongStates getSongState();
}
