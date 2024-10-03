package com.vino;

public class Song {
    private String title;      //title of the song
    private double duration;   //song duration

    public Song(String title, double duration) {
        this.title = title;                    //instance variable
        this.duration = duration;
    }
    public Song(){

    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
