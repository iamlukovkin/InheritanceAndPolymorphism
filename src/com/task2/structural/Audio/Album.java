package com.task2.structural.Audio;

import java.util.ArrayList;

public class Album extends AbstractAudio {
    private static int albumId = 0;
    private ArrayList<Track> tracks;

    public Album(String name, String author, Genre genre, ArrayList<Track> tracks) {
        super(name, author, genre, 0);
        setTracks(tracks);
        albumId++;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
        setDuration();
    }

    public static int getAlbumId() {
        return albumId;
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
    }

    @Override
    public String toString() {
        return "Название: " + getName() + "\nАвтор: " + getAuthor() + "\nЖанр: " + getGenre() + "\nЧисло треков: " + getTracks().size() + "\nПродолжительность: " + getDuration();
    }

    public void setDuration(float duration) {
        super.duration = duration;
    }

    public void setDuration() {
        float duration = 0;
        for (Track track : tracks) {
            duration += track.getDuration();
        }
        super.duration = duration;
    }
}
