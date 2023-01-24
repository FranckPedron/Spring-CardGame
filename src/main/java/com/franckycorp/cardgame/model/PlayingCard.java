package com.franckycorp.cardgame.model;

import lombok.Getter;

@Getter
public class PlayingCard {

    private Rank rank;
    private Suit suit;
    private boolean faceUp;

    public PlayingCard(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public boolean flip() {
        faceUp = !faceUp;
        return faceUp;
    }
}
