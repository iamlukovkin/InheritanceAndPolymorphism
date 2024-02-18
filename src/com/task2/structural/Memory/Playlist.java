package com.task2.structural.Memory;

import com.task2.creational.AudioFactory;
import com.task2.structural.Audio.Genre;
import com.task2.structural.Inputer;

public class Playlist extends AbstractMemory {
    private static Playlist instance;

    private final AudioFactory factory = AudioFactory.getInstance();

    public Playlist(String name) {
        super(name);
    }

    public void addNewAlbum() {
        Genre albumGenre = Inputer.readGenre();
        int albumCount = Inputer.readInt("Сколько треков в альбоме? ");
        addAlbum(factory.makeAlbumByGenre(albumGenre, albumCount));
    }

    public static Playlist getInstance() {
        if (instance == null) {
            instance = new Playlist(Inputer.readString("Название плейлиста: "));
        }
        return instance;
    }

    public String toString() {
        return "Плейлист " + getName() + " (альбомов: " + getAlbums().size() + ")";
    }

    public void recordToDisk(Disk disk) {
        disk.recordPlaylist(this);
    }

    public void addNewTrack() {
        Genre newTrackGenre = Inputer.readGenre();
        addAlbum(factory.makeAlbumByGenre(newTrackGenre, 1));
    }
}
