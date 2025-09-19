package org.example.sandbox.cards;

import java.util.Objects;

public class Card implements Comparable<Card> {

    private Suit suit;
    private FaceValue faceValue;

    private Card () {
        // private constructor to prevent instantiation without parameters
    }

    public Card (Suit suit, FaceValue faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public FaceValue getFaceValue() {
        return faceValue;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit && faceValue == card.faceValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, faceValue);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        sb.append(faceValue);
        sb.append(" of ").append(suit);
        sb.append(']');
        return sb.toString();
    }

    @Override
    public int compareTo(Card other) {

        if (other == null) {
            throw new NullPointerException("Cannot compare to null card");
        }

        // Compare suit first
        int suitComparison = this.suit.compareTo(other.suit);
        if (suitComparison != 0) {
            return suitComparison;
        }

        // If suits are equal, compare face values
        return this.faceValue.compareTo(other.faceValue);
    }

}
