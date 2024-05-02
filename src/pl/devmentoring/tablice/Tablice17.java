package pl.devmentoring.tablice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tablice17 {

    //Wprowadź poniższą mapę do programu. Program ma działać, tak jak poniżej:
    //-	wyświetla wszystkie klucze na konsoli (tzn. nazwy wszystkich albumów),
    //-	pobiera od użytkownika łańcuch i sprawdza czy odpowiada on kluczowi ze słownika.
    //
    //Jeśli tak, to wyświetlany jest odpowiedni komunikat, np.: "Wykonawcą albumu "Achtung baby" jest “U2".
    //
    //W przeciwnym razie wyświetlany jest komunikat: "Brak danych".
    //
    //Dane do umieszczenia w mapie:
    //-	'The Sensual World' : 'Kate Bush',
    //-	'Shaday' : 'Ofra Haza',
    //-	'Achtung Baby' : 'U2',
    //-	'Aion' : 'Dead Can Dance',
    //-	'Invisible Touch' : 'Genesis'}

    public static void main(String[] args) {

        Map<String, String> bands = new HashMap<>();
        bands.put("The Sensual World", "Kate Bush");
        bands.put("Shaday", "Ofra Haza");
        bands.put("Achtung Baby", "U2");
        bands.put("Aion", "Dead Can Dance");
        bands.put("Invisible Touch", "Genesis");

        //wyswietla wszystki albumy
        for (Map.Entry<String, String> entry : bands.entrySet()) {
            System.out.println(entry.getKey());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe albumu:");
        String userInput = scanner.nextLine();
        for (Map.Entry<String, String> entry : bands.entrySet()) {
            if (entry.getKey().equals(userInput)) {
                System.out.println("Wykonawca albumu " + userInput + " jest " + entry.getValue());
            } else {
                System.out.println("brak danych");
            }
        }
    }
}
