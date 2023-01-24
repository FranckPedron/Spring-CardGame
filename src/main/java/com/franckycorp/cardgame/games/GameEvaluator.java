package com.franckycorp.cardgame.games;

import com.franckycorp.cardgame.model.IPlayer;

import java.util.List;

public interface GameEvaluator {

    public IPlayer evaluateWinner(List<IPlayer> players);
}
