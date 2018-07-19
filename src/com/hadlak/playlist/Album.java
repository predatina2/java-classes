package com.hadlak.playlist;

import java.util.LinkedList;

public class Album {

    private LinkedList<Song> album;

    public Album(LinkedList<Song> album) {
        this.album = album;
    }

    public LinkedList<Song> getAlbum() {
        return album;
    }

    public void setAlbum(LinkedList<Song> album) {
        this.album = album;
    }
}
