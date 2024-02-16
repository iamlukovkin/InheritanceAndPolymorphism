package com.task2.structural.Memory;

public class Playlist extends AbstractMemory {
    public Playlist(String name) {
        super(name);
    }

    public void readFromDisk(Disk disk) {
        setAlbums(disk.getAlbums());
    }

    public String toString() {
        return "Плейлист " + getName() + " (альбомов: " + getAlbums().size() + ")";
    }

    public boolean contentEquals(Playlist other) {
        if (getAlbums().size() != other.getAlbums().size()) {
            return false;
        }
        for (int i = 0; i < getAlbums().size(); i++) {
            if (!getAlbums().get(i).getName().equals(other.getAlbums().get(i).getName())) {
                return false;
            }
        }
        return true;
    }

    public boolean contentEquals(Disk disk) {
        if (getAlbums().size() != disk.getAlbums().size()) {
            return false;
        }
        for (int i = 0; i < getAlbums().size(); i++) {
            if (!getAlbums().get(i).getName().equals(disk.getAlbums().get(i).getName())) {
                return false;
            }
        }
        return true;

    }
}
