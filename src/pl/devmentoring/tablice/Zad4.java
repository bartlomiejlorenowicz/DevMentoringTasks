package pl.devmentoring.tablice;

public class Zad4 {
    // Mamy następującą definicję tablicy:

    String[] names = {"Kacper", "John", "Szymon", "Adam"};

    // Wskaż niepoprawne operacje przeprowadzone na takiej tablicy:
    // names[4] = "Joanna";
    //names[-1] = "Jonathan";
    //names[1] = "Johnny";
    //names[2] = 3;

    // names[4] – niepoprawny, indeks o numerze 4 nie istnieje. Spowoduje wyjątek ArrayIndexOutOfBoundsException.
    //names[-1] – niepoprawny, indeksy tablicy java nie mogą być ujemne. Spowoduje wyjątek ArrayIndexOutOfBoundsException.
    //names[1] –poprawny, tablica o indeksie 1 zostanie nadpisana wartością „Johnny”.
    //names[2] – niepoprawny, tablica posiada elementy typu string,a nie typu liczbowego.

}
