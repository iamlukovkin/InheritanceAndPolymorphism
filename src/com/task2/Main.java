package com.task2;

import com.task2.behavioral.PlaylistMenu;

public class Main {
    public static void main(String[] args) {
        PlaylistMenu playlistMenu = PlaylistMenu.getPlaylistMenu();
        playlistMenu.execute();
    }
}
