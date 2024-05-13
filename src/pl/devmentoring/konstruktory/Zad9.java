package pl.devmentoring.konstruktory;

import java.util.ArrayList;
import java.util.List;

public class Zad9 {
    // Stwórz program symulujący talię kart (klasa Deck) oraz pojedyncze karty (klasa Card).
    // Karta ma być związana z takimi polami jak: wartość (np. 9) oraz figura (np. Diamond).
    // W klasie Deck znajdować ma się lista reprezentująca stos kart w ramach jednej talii.
    //
    //W Deck stwórz metody które pozwolą:
    //-	Przemieszać karty (istnieje klasa w Javie, która posiada już taką funkcjonalność).
    //-	Wylosować dowolną kartę.
    //-	Zwrócić ostatnią kartę z talii.
    //
    //Podpowiedź:
    //Talia kart ma się składać z 52 różnych obiektów Card o wszystkich możliwych kombinacjach pól,
    // np. (A - Diamond, A - Clubs itd). Aby utworzyć taką kombinację, utwórz dwie niezależne listy -
    // w pierwszej przechowuj możliwe figury, a w drugiej wartości. Następnie przechodząc pętlami, łącz je ze sobą i twórz obiekty.

    public static void main(String[] args) {
        // utworzenie obiektu Deck
        Deck deck = new Deck();
        List<Card> cards = deck.getCards();

        System.out.println("Original Deck " + cards);

        // przetasowanie talii
        deck.shuffle();
        System.out.println("Shuffled Deck " + cards);

        // wylosowanie randomowego obiektu
        Card randomCard = deck.drawRandomCard();
        System.out.println("Random Card " + randomCard);

        // zwrocenie ostatniej karty z talii
        Card returnLastCard = deck.returnLastCard();
        System.out.println("Last Card in the Deck: " + returnLastCard);
    }


}

