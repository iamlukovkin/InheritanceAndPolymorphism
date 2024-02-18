package com.task2;

import com.task2.behavioral.PlaylistMenu;
import com.task2.creational.MemoryFactory;
import com.task2.structural.Memory.Playlist;

public class Main {
    public static void main(String[] args) {
        MemoryFactory memoryFactory = MemoryFactory.getInstance();
        Playlist userPlaylist = memoryFactory.makePlaylist("Все альбомы");
        PlaylistMenu playlistMenu = new PlaylistMenu(userPlaylist);

        playlistMenu.execute();
    }
}
