package pl.devmentoring.dziedziczenie;

public class Zad5 {
//    -	Czym są klasy finalne i jakie ograniczenie kładą one na programiście?
//    -	Czym są pola finalne i jakie ograniczenie kładą one na programiście?
//    -	Czym są metody finalne i jakie ograniczenie kładą one na programiście?

    // Klasy finalne - oznaczone są słowem kluczowym final, klasa taka nie może być dziedziczona.
    // Główne ograniczenie to brak możliwości utworzenia klasy, która rozszerza klasę final. Pomoga to w zabezpieczeniu kodu
    // przed niezamierzonymilub niebezpiecznymi modyfikacjami.

    // Pola finalne - pole oznaczone jako final, może być przypisane tylko raz, po przypisaniu wartości nie można zmienić.
    // Zapewnienie stałości zmiennej, co moży być użyteczne gdy zależy nam na niezmienności wartości pola.

    // Metody finalne - metoda nie może być nadpisana w podklasie.
    // Główne ograniczenie to brak możliwości zmiany implementacji metody final w klasie pochodnej. Metoda zachowuje oryginalną implementację.
}
