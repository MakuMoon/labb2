package org.example.cards;

public class Card {

    private String suit;
    private String rank;


    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }


    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
