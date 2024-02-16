package com.task2.structural.Memory;

import java.util.ArrayList;

public class Disk extends AbstractMemory {
    public Disk(String name) {
        super(name);
    }

    public void recordPlaylist(Playlist playlist) {
        setAlbums(playlist.getAlbums());
    }

    public void clearAllTracks() {
        setAlbums(new ArrayList<>());
    }

    public String toString() {
        return "Диск " + getName() + " (альбомов: " + getAlbums().size() + ")";
    }
}
