package com.task2.structural.Memory;

import com.task2.structural.Audio.Album;
import com.task2.structural.Audio.Genre;
import com.task2.structural.Audio.Track;

import java.util.ArrayList;

abstract public class AbstractMemory {
    private String name;
    private ArrayList<Album> albums;

    public AbstractMemory(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public ArrayList<Track> getTracksOrderedByGenre() {
        ArrayList<Track> tracks = new ArrayList<>();
        for (Genre genre : Genre.values()) {
            for (Track track : getAllTracks()) {
                if (track.getGenre() == genre) {
                    tracks.add(track);
                }
            }
        }
        return tracks;
    }

    public ArrayList<Album> getAlbumsOrderedByGenre(Genre genre) {
        ArrayList<Album> returnedAlbums = new ArrayList<>();
        for (Album album : albums) {
            if (album.getGenre() == genre) {
                returnedAlbums.add(album);
            }
        }
        return returnedAlbums;
    }

    public ArrayList<Track> getAllTracks() {
        ArrayList<Track> tracks = new ArrayList<>();
        for (Album album : albums) {
            tracks.addAll(album.getTracks());
        }
        return tracks;
    }

    public ArrayList<Track> getTracksByDurationRange(float minDuration, float maxDuration) {
        ArrayList<Track> tracks = new ArrayList<>();
        for (Track track : getAllTracks()) {
            if (track.getDuration() >= minDuration && track.getDuration() <= maxDuration) {
                tracks.add(track);
            }
        }
        return tracks;
    }

    public float getDuration() {
        float duration = 0;
        for (Track track : getAllTracks()) {
            duration += track.getDuration();
        }
        return duration;
    }

    public static void displayTracks(ArrayList<Track> tracks) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < tracks.size(); i++) {
            result.append(i + 1).append(") ").append(tracks.get(i).toString()).append("\n");
        }
        System.out.println(result);
    }

    public static void displayAlbums(ArrayList<Album> albums) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < albums.size(); i++) {
            result.append(i + 1).append(") ").append(albums.get(i).toString()).append("\n");
        }
        System.out.println(result);
    }

    @Override
    public String toString() {
        return "Название: " + name + "\nПродолжительность: " + getDuration() + " мин." + "\nКоличество альбомов: " + albums.size();
    }

}
