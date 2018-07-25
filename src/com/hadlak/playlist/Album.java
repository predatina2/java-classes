package com.hadlak.playlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Album {

    private String name;
    private String artist;
    private LinkedList<Song> songs;

    public Album(String name) {
        this(name, new LinkedList<Song>());
    }

    public Album(String name, LinkedList<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(Song newSong) {

        if (containsSong(newSong)) {
            return false;
        }
        songs.add(newSong);
        return true;

    }

    public boolean addSong(String title, double duration) {
        return addSong(new Song(title, duration));
    }

    public boolean addSongToPlaylist(Song song, LinkedList<Song> playlist){
        if (containsSong(song)){
            playlist.add(song);
            return true;
        }
        return false;
    }

    public boolean containsSong(Song song) {
        // short: return songs.contains(song);

        for (Song s : this.songs) {
            if (s.equals(song)) {
                return true;
            }
        }

        return false;

    }

}
