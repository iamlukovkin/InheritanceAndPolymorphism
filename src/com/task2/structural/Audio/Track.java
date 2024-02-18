package com.task2.structural.Audio;

public class Track extends AbstractAudio {
    private static int trackId = 0;
    public Track(String name, String author, Genre genre, float duration) {
        super(name, author, genre, duration);
        trackId++;
    }

    public static int getTrackId() {
        return trackId;
    }

    @Override
    public String toString() {
        return "Название: " + getName() + "\nАвтор: " + getAuthor() + "\nЖанр: " + getGenre() + "\nПродолжительность: " + getDuration() + " мин.";
    }

    @Override
    public void setDuration(float duration) {
        super.duration = duration;
    }

    @Override
    public void setDuration() {}
}
