package com.darwing.audioPlayer.models;

public class Audio {
    private String tittle;
    private int duration;
    private int totalReproductions;
    private int likes;
    private int classification;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public void setTotalReproductions(int totalReproductions) {
        this.totalReproductions = totalReproductions;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public void iLike(){
        this.likes+=1;
    }

    public void play(){
        this.totalReproductions +=1;
    }

    @Override
    public String toString() {
        return  "Total of Reproductions: " + totalReproductions +
                ", Likes: " + likes+'.';
    }
}
