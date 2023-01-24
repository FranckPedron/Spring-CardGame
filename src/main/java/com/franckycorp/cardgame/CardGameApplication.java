package com.franckycorp.cardgame;

import com.franckycorp.cardgame.controller.GameController;
import com.franckycorp.cardgame.view.GameSwingPassiveView;
import com.franckycorp.cardgame.view.GameSwingView;
import com.franckycorp.cardgame.games.HighCardGameEvaluator;
import com.franckycorp.cardgame.view.GameViewables;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import com.franckycorp.cardgame.DeckFactory.DeckType;

@SpringBootApplication
public class CardGameApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CardGameApplication.class).headless(false).run(args);
        GameSwingView appFrame = context.getBean(GameSwingView.class);

        GameViewables views = new GameViewables();

        GameSwingView gsv = new GameSwingView();
        gsv.createAndShowGUI();
        views.addViewable(gsv);

        for(int i = 0; i< 3; i++) {
            GameSwingPassiveView passiveView = new GameSwingPassiveView();
            passiveView.createAndShowGUI();

            views.addViewable(passiveView);

            // sleep to move new Swing frame on window
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        GameController gc = new GameController(DeckFactory.makeDeck(DeckType.Normal), views, new HighCardGameEvaluator());
        gc.run();
    }

}
