package pl.devmentoring.tablice;

public class Zad21 {
    // Czym różni się LinkedLista od ArrayListy? Kiedy wykorzystywać dany z rodzaj listy?

    // LinkedList i ArrayList to dwie różne implementacje interfejsu List w Javie.
    //Wewnętrzna struktura danych:
    //ArrayList jest oparta na tablicy dynamicznej, oznacza to, że elementy są przechowywane w ciągłym bloku pamięci,
    // co umożliwia szybki dostęp do dowolnego elementu.
    //LinkedList jest dwukierunkowa i powiązana. Każdy element (węzeł) listy przechowuje referencje do poprzedniego i następnego elementu.
    // Nie ma szybkiego dostępu do elementów przez indeks, ponieważ wymaga to przejścia przez listę od początku (lub od końca, jeśli jest to bliżej).
    //Wydajność operacji:
    //ArrayList- dodwanie i usuwanie elementów (szczególnie w środku listy) może być kosztowne, ponieważ wymaga przesunięcia elementów w tablicy,
    // co jest operacją o złożoności O(n). Jednak dodawanie na końcu listy ma złożoność O(1).
    //LinkedList – dodawanie  i usuwanie elementów jest generalnie szybsze niż w ArrayList, zwłaszcza gdy odbywa się to na początku lub w środku listy,
    // ponieważ operacja nie wymaga przesunięcia innych elementów, tylko zmianę referencji, co jest operacją O(1).
    //Dostęp do elementów:
    //ArrayList – dostęp do elementu poprzez indeks jest bardzo szybki, O(1), ponieważ elementy są przechowywane w tablicy.
    //LinkedList – dostęp do elementów jest wolniejszy O(n), ponieważ wymaga przejścia przez listę od początku do żądanego indeksu.
    //Zarządzanie pamięcią:
    //ArrayList – może zużywać mniej pamięci niż LinkedList, ponieważ LinkedList dla każdego elementu przechowuje dodatkowe referencje do
    // następnych i poprzednich elementów,
    //LinkedList – każdy element listy wymaga dodatkowej pamięci na przechowywanie referencji do następnych i poprzednich węzłów.
    //Idealne zastosowania:
    //ArrayList – jest preferowana gdy, często potrzebujemy dostępu do elementów listy przy użyciu indeksu oraz kiedy rzadko wykonujemy
    // operacje dodawania i usuwania w środku listy.
    //LinkedList – jest preferowana gdy, często dodajemy lub usuwamy elementy z listy szczególnie na początku i środku oraz rzadko
    // potrzebujemy dostępu do elementów listy poprzez indeksowanie.
}
