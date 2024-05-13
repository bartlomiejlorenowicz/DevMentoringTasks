package pl.devmentoring.konstruktory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        List<String> values = List.of("Clubs", "Diamonds", "Hearts", "Spades");
        List<String> figures = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");

        for (String value : values) {
            for (String figure : figures) {
                cards.add(new Card(value, figure));
            }
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawRandomCard() {
        Random random = new Random();
        return cards.get(random.nextInt(cards.size()));
    }

    public Card returnLastCard() {
        return cards.get(cards.size() - 1);
    }
}
