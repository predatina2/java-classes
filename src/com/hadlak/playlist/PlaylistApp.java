package com.hadlak.playlist;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;

public class PlaylistApp {

    private LinkedList<Song> playlist;

    public static void main(String[] args) {
        Song song1 = new Song("Highway to Hell", 34.56);
        Song song2 = new Song("Old Mac Donald has a farm", 34.56);
        Song song3 = new Song("Peacetrain", 34.56);
        Song song4 = new Song("Forgotten", 34.56);
        Song song5 = new Song("Forever Love", 34.56);
        Song song6 = new Song("Michelle Mabelle", 34.56);
        Song song7 = new Song("Kindergartenparty", 34.56);
        Song song8 = new Song("Morgen kommt der Weihnachtsmann", 34.56);


        Album albumA = new Album("my Album A");
        albumA.addSong(song1);
        albumA.addSong(song1);
        albumA.addSong(song2);
        albumA.addSong(song3);
        albumA.addSong(song4);

        Album albumB = new Album("my Album B");
        albumA.addSong(song6);
        albumA.addSong(song7);
        albumA.addSong(song8);

        ArrayList<Album> albums = new ArrayList<Album>();

    }

    public void startApp(){
        playlist = new LinkedList<Song>();

        playlist.addSong(Song newSong)
    }

    public void printMainOptions(){
        System.out.println("Your options: \n");
        System.out.println("Press 0: To quit.");
        System.out.println("Press 1: To travel forward.");
        System.out.println("Press 2: To travel backwards.");
        System.out.println("Press 3: To print the options.");
    }

    public void addSongToPlayList(Song newSong){

    }

    public void deleteSongFromPlayList(Song newSong) {

    }

    public void showPlayListMenu(){

    }

    public void quitSong(){

    }

    public void forwardToNextSong(){

    }

    public void backwardsToPreviousSong(){

    }

    public void ReplacCurrentSong(){

    }

    public void printPlayList(){

    }

    public void addSongToPlaylist(){

    }

    public void removeCurrentSongFromPlaylist(){

    }
}
