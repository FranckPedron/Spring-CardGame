package com.franckycorp.cardgame;

import com.franckycorp.cardgame.model.Deck;
import com.franckycorp.cardgame.model.NormalDeck;
import com.franckycorp.cardgame.model.SmallDeck;
import com.franckycorp.cardgame.model.TestDeck;

public class DeckFactory {
    public enum DeckType {
        Normal,
        Small,
        Test
    };

    public static Deck makeDeck(DeckType type) {
        switch (type) {
            case Normal:
                return new NormalDeck();
            case Small:
                return new SmallDeck();
            case Test:
                return new TestDeck();
        }

        return new NormalDeck();
    }
}
