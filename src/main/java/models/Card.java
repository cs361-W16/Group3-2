package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by michaelhilton on 1/25/16.
 */

public class Card implements Serializable {
    public final int value;
    public final Suit suit;
    public final SpanishSuit spanSuit;

    @JsonCreator
    public Card(@JsonProperty("value") int value, @JsonProperty("suit") Suit suit, @JsonProperty("spanSuit") SpanishSuit spanSuit) {
        this.value = value;
        this.suit = suit;
        this.spanSuit = spanSuit;
    }

    public Suit getSuit() {
        return suit;
    }

    public SpanishSuit getSpanishSuit() {
        return spanSuit;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return this.value + this.suit.toString();
    }
}
