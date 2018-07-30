package com.hadlak.playlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Playlist{

    private List<Song> playlist;
    private ListIterator<Song> playlistIterator;
    private boolean playedForwardLastTime; // man könnte auch den current song speichern ;-)

    public Playlist() {
        this.playlist = new LinkedList<Song>();
        this.playlistIterator = playlist.listIterator();
    }

    public boolean addSong(Song song, Album album){
        if (album.containsSong(song)){
            this.playlist.add(song);
            return true;
        } else {
            return false;
        }
    }

    public void printPlaylist(){
        int count = 0;
        System.out.println("#########################################");
        for (Song s : this.playlist){
            count ++;
            System.out.println(count + ". Title: " + s.getTitle() + " duration: "
                    + s.getDuration());
        }
        System.out.println("#########################################");
    }

    public Song playNextSong(){
        if (this.playlistIterator.hasNext()){
            playedForwardLastTime = true;
            return playlistIterator.next();
        }
        return null;
    }

    public Song playPreviousSong() {
        if (this.playlistIterator.hasPrevious()){
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
        return this.playlist.remove(replayCurrentSong());
    }

}
