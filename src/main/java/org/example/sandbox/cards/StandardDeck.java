package org.example.sandbox.cards;

import java.util.ArrayList;
import java.util.List;

public class StandardDeck implements Deck {

    private List<Card> cards;

    public StandardDeck() {
        this.cards = newDeck();

    }

    private List<Card> newDeck() {

        List<Card> newDeck = new ArrayList<>();
        // TODO: Implement card creation logic

        return newDeck;
    }

    @Override
    public void shuffle() {

    }

    @Override
    public void cut(int index) {

    }

    @Override
    public Card dealCard() {
        return null;
    }

    @Override
    public Card turnOverTopCard() {
        return null;
    }

    @Override
    public int cardsRemaining() {
        return 0;
    }

    @Override
    public int search(Card card) {
        return 0;
    }

    @Override
    public void newOrder() {

    }

    @Override
    public void placeCardOnBottom(Card card) {

    }

    @Override
    public void placeCardOnTop(Card card) {

    }

    @Override
    public int size() {
        return 0;
    }
}
