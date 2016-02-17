package models;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by harderg on 2/14/16.
 */
public class testSpanishGame {

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
}
