package com.hadlak.playlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Album {

    private String name;
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

    public boolean addSong(Song newSong){

        if (songs.contains(newSong)){
            return false;
        } else {
            songs.add(newSong);
            return true;
        }
    }

}
