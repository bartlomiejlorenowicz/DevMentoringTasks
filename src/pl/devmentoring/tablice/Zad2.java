package pl.devmentoring.tablice;

public class Zad2 {
    // Czym się różni tablica 10 elementów typu int, od 10 zmiennych typu int?

    // Tablica 10 elementów typu int jest strukturą danych, która przechowuje elementy w sposób ciągły w pamięci,
    // dzięki temu mamy szybki dostęp do elementów za pomocą indeksów.
    //10 zmiennych typu int to oddzielne obiekty, które mogą być rozmieszczone w różnych miejscach pamięci.
    //Dostęp do elementów tablicy odbywa się za pomocą indeksów co jest bardzo wydajne, ponieważ czas dostępu do dowolnego
    // elementu wynosi O(1).
    //Każda zmienna jest odwoływana indywidualnie przez jej nazwę, co może być mniej wygodne, jeśli operacje muszą być
    // wykonane na wielu zmiennych jednocześnie.
    //Użycie tablicy pozwala na łatwe zarządzanie dużą liczbą zmiennych tego samego typu, co upraszcza kod.
    // Zarządzanie 10 zmiennymi może prowadzić do powtórzenia kodu i zwiększyć ryzyko błędów.
}
