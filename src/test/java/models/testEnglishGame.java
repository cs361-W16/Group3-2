package models;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Christian on 2/16/2016.
 */
public class testEnglishGame extends testGame {

    @Test
    public void testEnglishGameConstructor() {
        EnglishGame g = new EnglishGame();
        assertNotNull(g);
    }

    @Test
    public void testBuildDeck() {
        EnglishGame g = new EnglishGame();
        g.buildDeck();
        assertEquals(52,g.deck.size());
    }

    @Test
    public void testGameCreation(){
        EnglishGame g = new EnglishGame();
        assertNotNull(g);
    }

    @Test
    public void testGameBuildDeck(){
        EnglishGame g = new EnglishGame();
        g.buildDeck();
        assertEquals(52,g.deck.size());
    }

    @Test
    public void testGameInit(){
        EnglishGame g = new EnglishGame();
        g.buildDeck();
        g.shuffle();
        assertNotEquals(2,g.deck.get(0).getValue());
    }

    @Test
    public void testGameStart(){
        EnglishGame g = new EnglishGame();
        g.buildDeck();
        g.shuffle();
        g.dealFour();
        assertEquals(1,g.cols.get(0).size());
        assertEquals(1,g.cols.get(1).size());
        assertEquals(1,g.cols.get(2).size());
        assertEquals(1,g.cols.get(3).size());
    }

    @Test
    public void testCustomDeal(){
        EnglishGame g = new EnglishGame();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        assertEquals("2Clubs",g.cols.get(0).get(0).toString());
        assertEquals("3Clubs",g.cols.get(1).get(0).toString());
        assertEquals("4Clubs",g.cols.get(2).get(0).toString());
        assertEquals("5Clubs",g.cols.get(3).get(0).toString());
    }

    @Test
    public void testRemoveFunction(){
        EnglishGame g = new EnglishGame();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0,g.cols.get(2).size());
    }

    @Test
    public void testAddandMove() {
        EnglishGame g = new EnglishGame();
        Card c = new Card(2, Suit.Spades, null);
        g.buildDeck();
        g.addCardToCol(0, c);
        Assert.assertEquals("2Spades",g.cols.get(0).get(0).toString());
        g.move(0,1);
        Assert.assertEquals("2Spades",g.cols.get(1).get(0).toString());
    }
}