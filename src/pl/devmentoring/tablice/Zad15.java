package pl.devmentoring.tablice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zad15 {
    // Napisz program, który utworzy Array Listę i dodaj do niej 8 dowolnych kolorów w formie Stringów.
    //
    //Dopisz funkcjonalności:
    //-	Przeiteruj przez każdy element list
    //-	Zastąp 5-ty element kolorem: lilac
    //-	Dodaj na sam początek listy nowy kolor: turquoise
    //-	Posortuj listę kolorów
    //-	Utwórz nową listę - reversedColours - która będzie przechowywała te same elementy, co wcześniej utworzona lista,
    // ale będą one przechowywane w odwrotnej kolejności.

    public static void main(String[] args) {
        // utworzenie listy z elementami
        List<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("green");
        colours.add("black");
        colours.add("blue");
        colours.add("rose");
        colours.add("pink");
        colours.add("orange");
        colours.add("grey");

        // iterowanie po elementach tablicy
        for (String colour : colours) {
            System.out.print(colour + " ");
        }

        System.out.println();

        // zastapienie 5-tego elementu nowa wartoscia
        colours.set(4, "lilac");

        // dodanie na poczatek listy elementu "turquoise"
        colours.add(0, "turquoise");

        // sortowanie listy
        Collections.sort(colours);

        // utworzenie nowej listy i odwrocenie kolejnosci elementow
        List<String> reversedColours = new ArrayList<>(colours);
        Collections.reverse(reversedColours);

        // wyswietlenie listy colours
        for (String colour : colours) {
            System.out.print(colour + " ");
        }

        System.out.println();

        // wyswietlenie listy reversedColours
        for (String colour : reversedColours) {
            System.out.print(colour + " ");
        }
    }
}
