package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Christian on 2/16/2016.
 */
public class testEnglishGame {

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
}