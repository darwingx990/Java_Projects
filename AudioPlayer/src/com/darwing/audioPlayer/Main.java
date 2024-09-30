package com.darwing.audioPlayer;

import com.darwing.audioPlayer.models.Playlist;
import com.darwing.audioPlayer.models.Podcast;
import com.darwing.audioPlayer.models.Song;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Song loveYouPiece = new Song();

        loveYouPiece.setTittle("Love You Piece");
        loveYouPiece.setArtist("Emekus");
        loveYouPiece.setGenre("Romance");
        loveYouPiece.setAlbum("I love you. ");
        for (int i = 0; i < 80; i++) {
            loveYouPiece.iLike();
        }
        for (int i = 0; i < 6854; i++) {
            loveYouPiece.play();
        }

        Podcast englishLearn = new Podcast();
        englishLearn.setTittle("Learn English with from zero to Expert.");
        englishLearn.setPresenter("Darwing M. A.");
        englishLearn.setDescription("In this podcast you will find a set of audios with topics for you to learn English from Zero to Expert.");

        for (int i = 0; i < 2500; i++) {
            englishLearn.iLike();
        }
        for (int i = 0; i < 39700; i++) {
            englishLearn.play();
        }

        System.out.println(loveYouPiece.toString() + playlist.myFavourites(loveYouPiece) + "\n" + englishLearn.toString() + playlist.myFavourites(englishLearn));
    }


}