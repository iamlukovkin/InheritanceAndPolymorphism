package com.task2.structural.Memory;

import com.task2.structural.Inputer;

public class Disk extends AbstractMemory {
    public Disk() {
        super(Inputer.readString("Введите название диска"));
    }

    public void recordPlaylist(Playlist playlist) {
        setAlbums(playlist.getAlbums());
    }

    public String toString() {
        return "Диск " + getName() + " (альбомов: " + getAlbums().size() + ")";
    }
}
