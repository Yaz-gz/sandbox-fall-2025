package org.example.sandbox.cards;

public class DeckDriver {

    public static void main(String[] args) {
        Deck deck = new StandardDeck();
        System.out.println("Deck created: " + deck);

        //shuffle the deck
        deck.shuffle();
        System.out.println("Deck shuffled: " + deck);

        //cut the deck
        deck.cut(26);
        System.out.println("Deck cut: " + deck);

        //deal a card
        Card dealtCard = deck.dealCard();
        System.out.println("Dealt card: " + dealtCard);
        System.out.println("Deck after dealing a card: " + deck);
    }
}