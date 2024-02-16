package com.task2.structural.Audio;

abstract public class AbstractAudio {
    private final String name;
    private final String author;
    private final Genre genre;
    protected float duration;

    public AbstractAudio(String name, String author, Genre genre, float duration) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        setDuration(duration);
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    abstract public void setDuration(float duration);
    abstract public void setDuration();

    abstract public String toString();

    public float getDuration() {
        return duration;
    }
}
