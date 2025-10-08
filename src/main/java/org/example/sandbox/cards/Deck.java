package org.example.sandbox.cards;

public interface Deck {
    void shuffle();
    void cut(int index);
    Card dealCard();
    Card turnOverTopCard();
    int cardsRemaining();
    int search(Card card);
    void newOrder();
    void placeCardOnBottom(Card card);
    void placeCardOnTop(Card card);
    int size();
}
