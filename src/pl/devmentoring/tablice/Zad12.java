package pl.devmentoring.tablice;

public class Zad12 {
    // Jakie są korzyści wynikające z wykorzystania obiektu typu List od zwykłej tablicy elementów?

    // Dynamiczna zmiana rozmiaru:
    //Tablica posiada stały rozmiar, który musimy zadeklarować na początku tworzenia tablicy,
    // po przekroczeniu rozmiaru trzeba utworzyć nową i skopiować elementy do nowej tablicy.
    // Lista jest elastyczna sama się powiększa i zmniejsza, co wpływa na bezpieczeństwo i błędów z wyjątkiem ArrayIndexOutOfBoundException.
    //Obsługa wielu operacji:
    //Listy oferują szeroki zakres metod do dodawania, usuwania, sortowania itp., w przypadku tablic trzeba te metody implementować ręcznie.
    //Typowość:
    //Listy mogą być typowane co zapewnia bezpieczeństwo typów przy kompilacji i eliminuje ryzyko błędów związanych z
    // nieprawidłowym rzutowaniem typów.
    //Integracja z Interfejsami:
    //Listy są integralną częścią frameworków kolekcji, co pozwala na łatwe ich używanie z innymi strukturami danych.
    //Lepsze wsparcie z typami generycznymi:
    //Używanie generyków z listami jest bardziej naturalne i bezpieczne, dzięki czemu można tworzyć bardziej modularny i łatwiejszy kod.
    //Obsługa strumieni:
    //Listy można łatwo przetwarzać przy użyciu strumieni i lambda, co pozwala na bardziej zwięzły i funkcjonalny styl programowania.
}
