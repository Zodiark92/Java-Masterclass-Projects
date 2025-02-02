package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if(findSong(title) != null){
            return false;
        }
        this.songs.add(new Song(title, duration));
        return true;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if(trackNumber > 0 && trackNumber <= songs.size()){
            Song song = this.songs.get(trackNumber - 1);
            return addToPlayList(song.getTitle(), playlist);
        }
       return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = findSong(title);
        if(song != null){
            for(Song playlistSong : playlist){
                if(playlistSong.getTitle().equalsIgnoreCase(song.getTitle())){
                    return false;
                }
            }
            playlist.add(song);
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for(Song song : this.songs){
            if(song.getTitle().equalsIgnoreCase(title)){
                return song;
            }
        }
        return null;
    }



}
