package com.hadlak.playlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist extends LinkedList<Song>{

    private ListIterator<Song> playlistIterator;
    private boolean playedForwardLastTime; // man könnte auch den current song speichern ;-)

    public Playlist() {
        super();
        playlistIterator = super.listIterator();
    }

    public boolean addSong(Song song, Album album){
        if (album.containsSong(song)){
            add(song);
            return true;
        } else {
            return false;
        }
    }

    public void printPlaylist(){
        int count = 0;
        System.out.println("#########################################");
        for (Song s : this){
            count ++;
            System.out.println(count + ". Title: " + s.getTitle() + " duration: "
                    + s.getDuration());
        }
        System.out.println("#########################################");
    }

    public Song playNextSong(){
        if (playlistIterator.hasNext()){
            playedForwardLastTime = true;
            return playlistIterator.next();
        }
        return null;
    }

    public Song playPreviousSong() {
        if (playlistIterator.hasPrevious()){
            playedForwardLastTime = false;
            return playlistIterator.previous();
        }
        return null;
    }

    public Song replayCurrentSong() {
        if (playedForwardLastTime && playlistIterator.hasPrevious()){
            playedForwardLastTime = false;
            return playlistIterator.previous();
        } else if (!playedForwardLastTime && playlistIterator.hasNext()){
            playedForwardLastTime = true;
            return playlistIterator.next();
        } else {
            return null;
        }
    }

    public boolean removeCurrentSongFromPlaylist(){
        return remove(replayCurrentSong());
    }

}
