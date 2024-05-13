package pl.devmentoring.tablice;

public class Zad3 {
    // Czy można utworzyć tablicę 20 obiektów, z których pierwsze 10 będzie typu int, a następne 10 typu short?

    // Silne typowanie: W języku Java nie można utworzyć pojedynczej tablicy, która przechowuje elementy różnych typów, ponieważ
    // Java jest silnie typowana oznacza, że każda zmienna musi być zadeklarowana z określonym typem danych, a typ nie może być zmieniony po deklaracji.
    // Zapewnia to bezpieczeństwo typów w czasie kompilacji.
    //Optymalizacja: gdy w tablicy wszystkie elementy mają ten sam typ, pozwala to na optymalizację, takie jak jednolite
    // zarządzanie pamięcią i szybki dostęp do elementów tablicy.
    //Ograniczenie typów prymitywnych: typy prymitywne nie są obiektami, natomiast jeśli utworzymy tablicę typu Object[] i dokonamy
    // autoboxingu do danego typu obiektowego, to taką tablicę możemy utworzyć.

    Object[] differentObjects = {2, 33333333333l, 4, 3, 444, 444444, 444f};
}
