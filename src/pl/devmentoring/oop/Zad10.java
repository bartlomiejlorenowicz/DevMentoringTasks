package pl.devmentoring.oop;

public class Zad10 {
    // Czym jest varargs w Javie?

    // Varargs (variable numer of arguments) to mechanism pozwalający metodzie przyjmować dowolną liczbę argumentów tego samego typu,
    // co ułatwia tworzenie bardziej elastycznych interfejsów API. Dzięki varargs możemy przekazywać do metody zmienną liczbę argumentów,
    // eliminując potrzebę tworzenia wielu przeciążeń metody lub użycia tablic jako argumentów.

    // Czym różnią się poniższe zapisy?
    //
    //void calc(int... values){
    //}
    //
    //vs
    //
    //void calc(int[] values){
    //}

    // Różnią się w sposobie e jaki można je wywołać oraz ich definicją w kontekście przyjmowania argumentów.
    //Int… values to mechanizm varargs, który pozwala przekazać dowolną liczbę argumentów int lub żadneg,
    // które są automatycznie traktowane jako tablica int[] wewnątrz metody.
    //
    //Int[] values, oczekuje, że otrzyma tablicę jako argument, więc nie można przekazywać pojedynczych argumentów int brzpośrednino.
    //
    //Główna różnica polega na wygodzie i elastyczności metoda int… values jest bardziej elastyczna, ponieważ pozwala na
    // przekaznanie dowolnej liczby int bez konieczności tworzenia tablicy. Z kolei int[] values wymaga przekazania tablicy, co może być mniej wygodne.
}
