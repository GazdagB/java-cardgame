package com.gazdagstudio.cardgame.cards;

public class Card {

    private String id;
    private String title;
    private String challenge;
    private GroupSize groupSize;

    public Card(String id, String title, String challenge, GroupSize groupSize) {
        this.id = id;
        this.title = title;
        this.challenge = challenge;
        this.groupSize = groupSize;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChallange() {
        return challenge;
    }

    public void setChallange(String challange) {
        this.challenge = challange;
    }

    public GroupSize getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(GroupSize groupSize) {
        this.groupSize = groupSize;
    }
}
