package com.task2.structural.Memory;

import com.task2.structural.Audio.Album;
import com.task2.structural.Audio.Track;
import com.task2.structural.Inputer;
import java.io.FileWriter;
import java.io.IOException;

public class Disk extends AbstractMemory {
    public Disk() {
        super(Inputer.readString("Введите название диска"));
    }

    public void recordPlaylist(Playlist playlist) {
        setAlbums(playlist.getAlbums());
        writeAlbumsToFile();
    }

    private String getAlbumsAsString() {
        StringBuilder sb = new StringBuilder();
        for (Album album : getAlbums()) {
            sb.append("\n\n").append(album.toString()).append("\n");
            for (Track track : album.getTracks()) {
                sb.append(track.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    private void writeAlbumsToFile() {
        try (FileWriter fw = new FileWriter(getName() + ".txt")) {
            fw.write(getAlbumsAsString());
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public String toString() {
        return "Диск " + getName() + " (альбомов: " + getAlbums().size() + ")";
    }
}
