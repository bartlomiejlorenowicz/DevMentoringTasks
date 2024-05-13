package pl.devmentoring.tablice;

public class Zad14 {
    // Wyszukaj w zewnętrznych źródłach i przedyskutuj z mentorem, jaka jest różnica między ArrayList a LinkedList.

    // Wewnętrzna struktura:
    //ArrayList jest to realizacja listy za pomocą dynamicznie zmieniającej się tablicy. Gdy tablica wypełni się ArrayList tworzy nową,
    // większą tablicę i kopiuje do niej wszystkie elementy z starej tablicy, co może być kosztowne czasowo. Dostęp do elementów odbywa się
    // poprzez bezpośrednie  indeksowanie, co jest bardzo szybkie.
    //LinkedList jest to implementacja dwukierunkowej listy wiązanej. Każdy element listy zawiera odniesienia (wskaźnik) do poprzedniego i następnego
    // elementu w liście. Lista ta nie ma stałych czasów dostępów do elementów, ponieważ należy przejść przez listę, aby dostać się do konkretnego elementu.
    //Wydajność operacji:
    //- dodawanie usuwanie elementów: LinkedList jest zazwyczaj szybsza przy dodawaniu i usuwaniu elementów, szczególnie w środku listy,
    // ponieważ nie wymaga przesuwania elementów, jak to ma miejsce w ArrayList.
    //W LinkedList wystarczy zmienić wskaźniki odpowiednich węzłów, co jest operacją stałoczasową, i ile mamy już referencję do węzła przy który operujemy.
    //- dostęp do elementów: ArrayList oferuje znacznie szybszy dostęp do poszczególnych elementów poprzez indeksowanie. W przypadku LinkedList,
    // aby uzyskać dostęp do elementu, konieczne jest przejście przez listę (od początku lub od końca w zależności od tego, który jest bliżej),
    // aż do żądanego elementu, co jest operacją liniową względem liczby elementów.
    //Zużycie pamięci:
    //ArrayList zużywa mniej pamięci na węzeł, ponieważ przechowuje tylko dane. Dodatkowy narzut pamięciowy pojawia się tylko w przypadku,
    // gdy trzeba zwiększyć rozmiar wewnętrznej tablicy.
    //LinkedList każdy element listy wiązanej zawiera dodatkowo informacje o połaczeniach (wskaźniki) co oznacza większe zużycie pamięci na
    // każdy element.
    //Optymalne przypadki użycia:
    //ArrayList jest lepsza, gdy planujemy dużo operacji odczytu (dostęp do elementów), a struktura danych nie jest często modyfikowana
    // (dodawanie, usuwanie elementów nie na końcu listy).
    //LinkedList jest preferowana, gdy planowane są częste operacje dodawania i usuwania, szczególnie w różnych miejscach listy.
}
