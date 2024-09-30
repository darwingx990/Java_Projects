package com.darwing.audioPlayer.models;

public class Playlist {
    public String myFavourites (Audio audio){
        if (audio.getClassification()>3){
            return ("Included in the playlist");
        } else {
            return("Not included in the playlist");
        }
    }
}
