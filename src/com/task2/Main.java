package com.task2;

import com.task2.structural.Audio.Album;
import com.task2.structural.Audio.Genre;
import com.task2.creational.AudioFactory;
import com.task2.behavioral.MenuView;

public class Main {
    public static void main(String[] args) {
//        AudioFactory trackFactory = AudioFactory.getInstance();
//        Album album = trackFactory.makeAlbumByGenre(Genre.ROCK, 5);
//        System.out.println(album);
        MenuView.displayMenu();
    }
}
