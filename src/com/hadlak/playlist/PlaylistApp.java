package com.hadlak.playlist;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PlaylistApp {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        startApp();
    }

    public static void startApp(){

        Song toHell = new Song("Highway to Hell", 34.56);
        Song oldMac = new Song("Old Mac Donald has a farm", 34.56);
        Song peaceTrain = new Song("Peacetrain", 34.56);
        Song forgotten = new Song("Forgotten", 34.56);
        Song foreverLove = new Song("Forever Love", 34.56);
        Song michelleMabelle = new Song("Michelle Mabelle", 34.56);
        Song kindergartenparty = new Song("Kindergartenparty", 34.56);
        Song weihnachtsmann = new Song("Morgen kommt der Weihnachtsmann", 34.56);


        Album albumA = new Album("my Album A");
        albumA.addSong(toHell);
        albumA.addSong(toHell);
        albumA.addSong(oldMac);
        albumA.addSong(peaceTrain);
        albumA.addSong(forgotten);

        Album albumB = new Album("my Album B");
        albumB.addSong(michelleMabelle);
        albumB.addSong(kindergartenparty);
        albumB.addSong(weihnachtsmann);

        List<Album> albums = new ArrayList<Album>();
        albums.add(albumA);
        albums.add(albumB);

        Playlist playlist = new Playlist();
        playlist.addSong(michelleMabelle, albumB);
        playlist.addSong(peaceTrain, albumA);
        playlist.addSong(oldMac, albumA);
        playlist.addSong(kindergartenparty, albumB);
        playlist.addSong(toHell, albumA);

        printPlaylistOptions();

        boolean quit = false;
        while (!quit){

            System.out.println("What do you want to do?");
            int option = scanner.nextInt();

            switch(option){
                case 0 :
                    quit = true;
                    break;
                case 1:
                    playlist.printPlaylist();
                    break;
                case 2:
                    System.out.println("play: " + playlist.playNextSong().getTitle());
                    break;
                case 3:
                    System.out.println("play: " + playlist.playPreviousSong().getTitle());
                    break;
                case 4:
                    System.out.println("play: " + playlist.replayCurrentSong().getTitle());
                    break;
                case 5:
                    playlist.removeCurrentSongFromPlaylist();
                    break;
                default:
                    printPlaylistOptions();
                    break;
            }
        }
    }

    public static void printPlaylistOptions(){
        System.out.println("Your options: \n");
        System.out.println("Press 0: To quit.");
        System.out.println("Press 1: To list all songs in the playlist.");
        System.out.println("Press 2: To play next song.");
        System.out.println("Press 3: To play previous song.");
        System.out.println("Press 4: To replay current song.");
        System.out.println("Press 5: To remove current song from playlist.");
    }
}
