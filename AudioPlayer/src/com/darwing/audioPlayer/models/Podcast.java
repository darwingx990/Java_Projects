package com.darwing.audioPlayer.models;

public class Podcast extends Audio{
private String  presenter;
    private String description;

    @Override
    public int getClassification() {
        if (getTotalReproductions()>0 && getTotalReproductions() <= 100) {
            return 1;
        } else if (getTotalReproductions() <= 500) {
            return 2;
        } else if (getTotalReproductions() <= 1000) {
            return 3;
        } else if (getTotalReproductions() <= 5000) {
            return 4;
        } else if (getTotalReproductions() > 5000) {
            return 5;
        } else {
            return 0;
        }
    }

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Podcast: "+
                "presenter is '" + presenter + '\'' +
                ", description: '" + description + '\''
                + " "+super.toString();
    }
}
