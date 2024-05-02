package pl.devmentoring.tablice;

import java.util.*;

public class Tablice16 {

    //Utwórz mapę, która reprezentować będzie zestaw pięciu unikalnych imion wraz z przypisanym do nich numerem PESEL
    // (przechowywanym w formie Stringa). Następnie:
    //-	Sprawdź, czy w mapie znajduje się imię Anna. Wydrukuj stosowny komunikat, w zależności od tego, czy imię jest obecne w mapie.
    //-	Sprawdź, czy w mapie znajduje się w wartość, która rozpoczyna się znakiem: “9”. Wykorzystaj m.in metodę .startsWith()
    //-	Usuń 2 dowolne pary klucz : wartość z mapy
    //-	Zweryfikuj rozmiar mapy i wyświetl komunikat “The map’s size is correct.”, jeśli rozmiar listy będzie wynosił 3.
    //-	Spróbuj pobrać z mapy wartość spod klucza “Euzebiusz”. Jeśli taki klucz nie znajduje się w Twojej mapie, to niech operacja
    // pobierania klucza zwróci tekst: “No such name!”.
    //-	Sprawdź, czy mapa jest pusta. Jeśli tak - wyświetl komunikat: “Nothing to do here!”, a jeśli zawiera jakiekolwiek
    // elementy - wyświetl informację o jej rozmiarze.

    public static void main(String[] args) {

        Map<String, String> people = new HashMap<>();
        people.put("Euzebiusz", "4567854");
        people.put("Bogdan", "234554");
        people.put("Robert", "4578654");
        people.put("Ewa", "95667994");
        people.put("Anna", "4275454");

        // sprawdzenie czy w mapie znajduje sie osoba o imienu Anna
        if (people.containsKey("Anna")){
            System.out.println("mapa zawiera osobe o imieniu Anna");
        } else {
            System.out.println("mapa nie zawiera osobe o imieniu Anna");
        }

        // sprawdzenie czy wartosc w mapie zaczyna sie od cyfry 9
        boolean containsValueStartsWith9 = false;
        for (Map.Entry<String, String> entry : people.entrySet()) {
            if (entry.getValue().startsWith("9")) {
                containsValueStartsWith9 = true;
            }
        }
        System.out.println("Czy mam zawiera wartosc, ktora zaczyna sie na 9?: " + containsValueStartsWith9);

        // usuwanie 2 elementow z mapy
        people.remove("Anna");
        people.remove("Robert");

        // sprawdzenie czy rozmiar listy jest rowny 3
        if (people.size() == 3) {
            System.out.println("The map’s size is correct.");
        } else {
            System.out.println("The map’s size is not correct.");
        }

        // jesli klucz o wartosci Euzebiusz istnieje, wyswietl jego wartosc
        System.out.println(people.getOrDefault("Euzebiusz", "No such name!"));

        // sprawdzenie czy mapa jest pusta
        if (people.isEmpty()) {
            System.out.println("Nothing to do here!");
        } else {
            System.out.println("Rozmiar mapy: " + people.size());
        }
    }

}