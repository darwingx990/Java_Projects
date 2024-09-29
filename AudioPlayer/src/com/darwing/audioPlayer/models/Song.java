package com.darwing.audioPlayer.models;

public class Song extends Audio{
    private String album;
    private String artist;
    private String genre;

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
