package com.task2.behavioral;

import com.task2.structural.Audio.Album;
import com.task2.structural.Audio.Genre;
import com.task2.structural.Audio.Track;
import com.task2.structural.Inputer;
import com.task2.structural.Memory.AbstractMemory;
import com.task2.structural.Memory.Disk;
import com.task2.structural.Memory.Playlist;

import java.util.ArrayList;

abstract public class AbstractMenu {
    private static Playlist playlistInstance;
    private Disk diskInstance;

    public AbstractMenu() {
        playlistInstance = Playlist.getInstance();
        diskInstance = getDisk();
    }

    public Disk getDisk() {
        if (diskInstance == null) {
            diskInstance = new Disk();
        }
        return diskInstance;
    }

    public Playlist getPlaylist() {
        return playlistInstance;
    }

    public void displayTracks() {
        ArrayList<Track> tracks = playlistInstance.getAllTracks();
        if (tracks.isEmpty()) {
            System.out.println("Здесь пусто, но вы можете добавить новые треки и альбомы!");
            return;
        }
        AbstractMemory.displayTracks(tracks);
    }

    public void displayAlbums() {
        ArrayList<Album> albums = playlistInstance.getAlbums();
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
                ArrayList<Track> tracks = playlistInstance.getTracksByDurationRange(minDuration, maxDuration);
                AbstractMemory.displayTracks(tracks);
                break;
            }
        }
    }

    public void orderTracksByGenre() {
        AbstractMemory.displayTracks(playlistInstance.getTracksOrderedByGenre());
    }

    public void displayTracksByGenre() {
        Genre genre = Inputer.readGenre();
        AbstractMemory.displayAlbums(playlistInstance.getAlbumsOrderedByGenre(genre));
    }

    abstract public void displayMenu();

    public void exit() {
        System.out.println("До скорых встреч!");
        Inputer.getScanner().close();
    }
}
