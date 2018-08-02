package com.hadlak.playlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Album {

    private String name;
    private String artist;
    private SongList songs;

    public Album(String name) {
        this(name, new LinkedList<Song>());
    }

    public Album(String name, LinkedList<Song> songs) {
        this.name = name;
        this.songs = new SongList(songs);
    }

    public List<Song> getSongs() {
        return songs.getSongs();
    }

    public boolean addSong(Song newSong) {

        return songs.addSong(newSong);

    }

    public boolean addSong(String title, double duration) {
        return songs.addSong(new Song(title, duration));
    }

    public List<Song> addSongToPlaylist(Song song, List<Song> playlist) {
        if (songs.containsSong(song) && !playlist.contains(song)) {
            playlist.add(song);
        }
        return playlist;
    }

    public List<Song> addSongToPlaylist(String title, List<Song> playlist) {
        Song song = songs.findSong(title);
        if (song != null && !playlist.contains(song)) {
            playlist.add(song);
        }
        return playlist;
    }

    public List<Song> addSongToPlaylist(int trackNumber, List<Song> playlist) {
        Song song = songs.findSong(trackNumber);
        if (song != null && !playlist.contains(song)) {
            playlist.add(song);
        }
        return playlist;
    }

    private boolean doesSongExistInPlaylist(Song song, List<Song> playlist){
        return playlist.contains(song);
    }

    public boolean containsSong(Song song) {
        return songs.containsSong(song);
    }


    private class SongList {
        private List<Song> songs;

        public SongList(List<Song> songs) {
            this.songs = songs;
        }

        public List<Song> getSongs() {
            return songs;
        }

        public boolean addSong(Song newSong) {

            if (containsSong(newSong)) {
                return false;
            }
            songs.add(newSong);
            return true;

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

        public Song findSong(String title) {

            for (Song s : this.songs
                    ) {
                if (s.getTitle().equals(title)) {
                    return s;
                }

            }
            return null;
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if (index >= 0 && index < this.songs.size()) {
                return this.songs.get(index);
            } else {
                return null;
            }
        }
    }

}
