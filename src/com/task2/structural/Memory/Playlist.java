package com.task2.structural.Memory;

public class Playlist extends AbstractMemory {
    private static Playlist instance;

    public Playlist(String name) {
        super(name);
    }

    public static Playlist getInstance(String name) {
        if (instance == null) {
            instance = new Playlist(name);
        }
        return instance;
    }

    public void readFromDisk(Disk disk) {
        setAlbums(disk.getAlbums());
    }

    public String toString() {
        return "Плейлист " + getName() + " (альбомов: " + getAlbums().size() + ")";
    }

    public void recordToDisk(Disk disk) {
        disk.recordPlaylist(this);
    }
}
