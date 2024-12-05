package org.example.cards;

public class Card {

    private String suit;
    private String rank;

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
