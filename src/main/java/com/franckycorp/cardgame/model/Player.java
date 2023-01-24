package com.franckycorp.cardgame.model;

import lombok.Getter;

public class Player implements IPlayer{
    @Getter
    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        hand = new Hand();
    }

    @Override
    public void addCardToHand(PlayingCard pc) {
        hand.addCard(pc);
    }

    @Override
    public PlayingCard getCard(int index) {
        return hand.getCard(index);
    }

    @Override
    public PlayingCard removeCard() {
        return  hand.removeCard();
    }
}
