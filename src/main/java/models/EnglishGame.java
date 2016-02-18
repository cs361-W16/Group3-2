package models;

import java.util.ArrayList;

/**
 * Created by Christian on 2/16/2016.
 */
public class EnglishGame extends Game {

    // Constructor for EnglishGame
    /*public EnglishGame() {
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        error = false;
    }*/

    public void buildDeck() {
        for(int i = 2; i < 15; i++){
            deck.add(new Card(i,Suit.Clubs, null));
            deck.add(new Card(i,Suit.Hearts, null));
            deck.add(new Card(i,Suit.Diamonds, null));
            deck.add(new Card(i,Suit.Spades, null));
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
                        if (compare.getSuit() == c.getSuit()) {
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
