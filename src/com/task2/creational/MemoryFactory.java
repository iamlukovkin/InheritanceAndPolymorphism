package com.task2.creational;

import com.task2.structural.Memory.Disk;
import com.task2.structural.Memory.Playlist;

public class MemoryFactory {
    private static MemoryFactory uniqueInstance;

    protected MemoryFactory() {}

    public static MemoryFactory getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MemoryFactory();
        }
        return uniqueInstance;
    }

    public Disk makeDisk(String name) {
        return new Disk(name);
    }

    public Playlist makePlaylist(String name) {return Playlist.getInstance(name);}
}
