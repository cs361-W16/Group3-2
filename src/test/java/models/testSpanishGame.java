package models;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by harderg on 2/14/16.
 */
public class testSpanishGame extends testGame {

    @Test
    public void testBuildDeck () {
        SpanishGame testGame = new SpanishGame();
        boolean notInRange = false;
        int i;

        testGame.buildDeck();

        for(i = 0; i < testGame.deck.size(); i++) {
            if (testGame.deck.get(i).getValue() > 7 && testGame.deck.get(i).getValue() < 11) {
                notInRange = true;
            }
            Assert.assertEquals(false, notInRange);
        }

        Assert.assertEquals(40, i);
    }

    @Test
    public void testGameCreation(){
        SpanishGame g = new SpanishGame();
        assertNotNull(g);
    }

    @Test
    public void testGameBuildDeck(){
        SpanishGame g = new SpanishGame();
        g.buildDeck();
        assertEquals(40,g.deck.size());
    }

    @Test
    public void testGameInit(){
        SpanishGame g = new SpanishGame();
        g.buildDeck();
        g.shuffle();
        assertNotEquals(1,g.deck.get(0).getValue());
    }

    @Test
    public void testGameStart(){
        SpanishGame g = new SpanishGame();
        g.buildDeck();
        g.shuffle();
        g.dealFour();
        assertEquals(1,g.cols.get(0).size());
        assertEquals(1,g.cols.get(1).size());
        assertEquals(1,g.cols.get(2).size());
        assertEquals(1,g.cols.get(3).size());
    }

    /*@Test
    public void testCustomDeal(){
        SpanishGame g = new SpanishGame();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        assertEquals("2Clubs",g.cols.get(0).get(0).toString());
        assertEquals("3Clubs",g.cols.get(1).get(0).toString());
        assertEquals("4Clubs",g.cols.get(2).get(0).toString());
        assertEquals("5Clubs",g.cols.get(3).get(0).toString());
    }*/

    @Test
    public void testRemoveFunction(){
        SpanishGame g = new SpanishGame();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0,g.cols.get(2).size());
    }
}
