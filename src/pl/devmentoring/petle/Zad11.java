package pl.devmentoring.petle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad11 {
    // Twoim zadaniem jest złamać metodą brute-force (https://pl.wikipedia.org/wiki/Atak_brute_force) słabe hasło
    // składające się z 4 znaków będących literami alfabetu łacińskiego (litery zarówno małe jak i wielkie).
    // Wygeneruj wszystkie możliwe kombinacje takiego hasła i wyświetl każdą z osobna.
    //
    //Podpowiedź:
    //Wykorzystaj pętle zagnieżdżone

    public static void main(String[] args) {
        List<Character> alphabet = new ArrayList<>();

        // generowanie liter alfabetu
        for (char i = 'a'; i <= 'z'; i++) {
            alphabet.add(i);
        }

        // generowanie wszytskich mozliwych kombinacji
        for (int i = 0; i < alphabet.size(); i++) {
            char first = alphabet.get(i);
            for (int j = 0; j < alphabet.size(); j++) {
                char second = alphabet.get(j);
                for (int k = 0; k < alphabet.size(); k++) {
                    char third = alphabet.get(k);
                    for (int l = 0; l < alphabet.size(); l++) {
                        char fourth = alphabet.get(l);
                        System.out.println(first + "" + second + "" + third + "" + fourth);
                    }
                }
            }
        }
    }
}
