package models;

import java.util.ArrayList;

/**
 * Created by harderg on 2/14/16.
 */
public class SpanishGame extends Game {

    public void buildDeck() {
        for(int i = 1; i < 14; i++){
            if (i < 8 || i > 10) {
                deck.add(new Card(i,null, SpanishSuit.Clubs));
                deck.add(new Card(i,null, SpanishSuit.Coins));
                deck.add(new Card(i,null, SpanishSuit.Swords));
                deck.add(new Card(i,null, SpanishSuit.Cups));
            }
        }
    }

    public void remove(int columnNumber) {
        if(colHasCards(columnNumber)) {
            Card c = getTopCard(columnNumber);
            boolean removeCard = false;
            for (int i = 0; i < 4; i++) {
                if (i != columnNumber) {
                    if (colHasCards(i)) {
                        Card compare = getTopCard(i);
                        if (compare.getSpanishSuit() == c.getSpanishSuit()) {
                            if (compare.getValue() > c.getValue()) {
                                removeCard = true;
                            }
                        }
                    }
                }
            }
            if (removeCard) {
                this.cols.get(columnNumber).remove(this.cols.get(columnNumber).size() - 1);
                error = false;
            }
            else{
                error = true;
            }
        }
    }
}
