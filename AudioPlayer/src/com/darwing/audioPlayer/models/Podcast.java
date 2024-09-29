package com.darwing.audioPlayer.models;

public class Podcast extends Audio{
private String  presenter;
    private String description;

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
