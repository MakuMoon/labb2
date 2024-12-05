package org.example.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();


    public Deck() {

        for (String suit : new String[]{"Hearts", "Diamonds", "Clubs", "Spades"}) {
            for (String rank : new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}) {
                cards.add(new Card(suit, rank));
            }
        }

        shuffle();
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card drawCard(){
        Card card = cards.get(0);
        cards.remove(0);
        return card;
    }
}
