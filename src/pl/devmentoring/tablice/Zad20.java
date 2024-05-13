package pl.devmentoring.tablice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zad20 {
    // Utwórz listę składającą się z następujących elementów:
    //
    //'zielony', 'czerwony', 'niebieski', 'czarny', 'fioletowy', 'granatowy', 'niebieski', 'czarny', 'czarny', 'zielony', 'cytrynowy', 'granatowy', 'niebieski', 'indygo', 'zielony', 'czerwony'
    //
    //Przekształć tę listę w zbiór i zachowaj pod nową nazwą, a następnie:
    //-	policz, ile elementów zawiera oryginalna lista kolorów
    //-	policz, ile różnych kolorów zostało użytych
    //-	wyświetl każdy z elementów zbioru w oddzielnej linii
    //-	dodaj do zbioru nazwę jakiegoś innego koloru (sprawdź efekt przez wyświetlenie zawartości)
    //-	usuń ze zbioru jakiś kolor (ponownie sprawdź efekt)

    public static void main(String[] args) {

        List<String> colours = List.of("green", "red", "blue", "black", "purple", "navy", "blue", "black", "green", "lemon", "purple", "blue", "indigo", "green", "red");

        Set<String> setColours = new HashSet<>(colours);

        System.out.println("Oryginalna lista: " + colours.size());
        System.out.println("Użyte kolory: " + setColours.size());

        for (String colour : setColours) {
            System.out.println(colour);
        }

        setColours.add("orange");
        System.out.println();

        for (String colour : setColours) {
            System.out.println(colour);
        }

        setColours.remove("indigo");
        System.out.println();

        for (String colour : setColours) {
            System.out.println(colour);
        }
    }
}
