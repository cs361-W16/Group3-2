package models;

import java.util.ArrayList;

/**
 * Created by harderg on 2/14/16.
 */
public class SpanishGame extends Game {

    /*public void buildDeck() {
        for(int i = 1; i < 14; i++){
            if (i < 8 || i > 10) {
                deck.add(new Card(i, SpanishSuit.Clubs));
                deck.add(new Card(i, SpanishSuit.Coins));
                deck.add(new Card(i, SpanishSuit.Swords));
                deck.add(new Card(i, SpanishSuit.Cups));
            }
        }
    }*/

    public void buildDeck() {
        for(int i = 1; i < 14; i++){
            if (i < 8 || i > 10) {
                deck.add(new Card(i, Suit.Clubs));
                deck.add(new Card(i, Suit.Hearts));
                deck.add(new Card(i, Suit.Diamonds));
                deck.add(new Card(i, Suit.Spades));
            }
        }
    }
}
