package com.task2.behavioral;

import com.task2.structural.Audio.Album;
import com.task2.structural.Audio.Genre;
import com.task2.structural.Audio.Track;
import com.task2.structural.Inputer;
import com.task2.structural.Memory.AbstractMemory;

import java.util.ArrayList;

abstract public class AbstractMenu {
    private final AbstractMemory userMemory;

    public AbstractMenu(AbstractMemory userPlaylist) {
        this.userMemory = userPlaylist;
    }

    public AbstractMemory getUserMemory() {
        return userMemory;
    }

    public void displayTracks() {
        ArrayList<Track> tracks = userMemory.getAllTracks();
        if (tracks.isEmpty()) {
            System.out.println("Здесь пусто, но вы можете добавить новые треки и альбомы!");
            return;
        }
        AbstractMemory.displayTracks(tracks);
    }

    public void displayAlbums() {
        ArrayList<Album> albums = userMemory.getAlbums();
        if (albums.isEmpty()) {
            System.out.println("Здесь пусто, но вы можете добавить новые альбомы!");
            return;
        }
        AbstractMemory.displayAlbums(albums);
    }

    public void orderTracksByDurationRange() {
        while (true) {
            float minDuration = Inputer.readFloat("Введите минимальное значение длительности трека: ");
            float maxDuration = Inputer.readFloat("Введите максимальное значение длительности трека: ");
            if (minDuration > maxDuration) {
                System.out.println("Минимальное значение длительности трека не может быть больше максимального!");
            } else {
                ArrayList<Track> tracks = userMemory.getTracksByDurationRange(minDuration, maxDuration);
                AbstractMemory.displayTracks(tracks);
                break;
            }
        }
    }

    public void orderTracksByGenre() {
        AbstractMemory.displayTracks(userMemory.getTracksOrderedByGenre());
    }

    public void displayTracksByGenre() {
        Genre genre = Inputer.readGenre();
        AbstractMemory.displayAlbums(userMemory.getAlbumsOrderedByGenre(genre));
    }

    abstract public void displayMenu();

    public void exit() {
        System.out.println("До скорых встреч!");
        Inputer.getScanner().close();
    }
}
