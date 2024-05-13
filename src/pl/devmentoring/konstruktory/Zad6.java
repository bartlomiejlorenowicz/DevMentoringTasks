package pl.devmentoring.konstruktory;

public class Zad6 {
    // Co się stanie gdy jawnie nie zdefiniujemy konstruktora w klasie? Kiedy jest to możliwe?

    // Program zadziała prawidłowo, jeśli:
    // - klasa nie dziedziczy z innej klasy, która wymaga argumentów konstruktora,
    // - klasa nie wymaga zarządzania zasobami, takie jak baza danych, pliki.
    // - klasa służy głównie jako kontener danych i nie posiada złożonej logiki ani metod operujących na tych danych.
    // - w przypadku klas, które są generowane automatycznie przez narzędzia lub kompilatory (klasy DTO) generują domyślne konstruktory.
}
