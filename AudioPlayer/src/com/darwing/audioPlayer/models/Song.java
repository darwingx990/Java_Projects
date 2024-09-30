package com.darwing.audioPlayer.models;

public class Song extends Audio{
    private String album;
    private String artist;
    private String genre;

    @Override
    public int getClassification() {
        if (getLikes()>0 && getLikes() <= 100) {
            return 1;
        } else if (getLikes() <= 500) {
            return 2;
        } else if (getLikes() <= 1000) {
            return 3;
        } else if (getLikes() <= 5000) {
            return 4;
        } else if (getLikes() > 5000) {
            return 5;
        } else {
            return 0;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song: " +
                " album: '" + album + '\'' +
                ", artist: '" + artist + '\'' +
                ", genre: '" + genre +'.'
                + " " +super.toString();
    }
}
