package com.task2.creational;

import com.task2.structural.Audio.Album;
import com.task2.structural.Audio.Genre;
import com.task2.structural.Audio.Track;

import java.util.ArrayList;
import java.util.random.RandomGenerator;

public class AudioFactory {
    private static AudioFactory uniqueInstance;
    protected AudioFactory() {}

    public static AudioFactory getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new AudioFactory();
        }
        return uniqueInstance;
    }

    public Track makeTrackByGenre(Genre genre) {
        String genreName = genre.toString();
        int trackId = Track.getTrackId();
        return new Track(genreName + "Track" + trackId, genreName + "Author" + trackId, genre, RandomGenerator.getDefault().nextFloat(1, 5));
    }

    public Album makeAlbumByGenre(Genre genre, int countTracks) {
        String genreName = genre.toString();
        int albumId = Album.getAlbumId();
        ArrayList<Track> tracks = new ArrayList<>();
        for (int i = 0; i < countTracks; i++) {
            tracks.add(makeTrackByGenre(genre));
        }
        return new Album((genreName + "Album" + albumId), genreName + "Author" + albumId, genre, tracks);
    }
}
