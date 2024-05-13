package pl.devmentoring.tablice;

public class Zad22 {
    // Jakie wyróżniamy inne rodzaje Mapy, Setów (oprócz HashSet, HashMap) ?

    // Rodzaje map:
    //HashTable:
    //- jest synchronizowana, co oznacza, że jest bezpieczna dla wątków, ale ma to wpływ na wydajność.
    //- nie zezwala na null jako klucz ani wartość.
    //LinkedHashMap:
    //- dziedziczy po HashMap i dodatkowo utrzymuje listę podwójnie powiązanych elementów, co pozwala na zachowanie kolejności wstawiania elementów.
    //- może być używana, gdy istotna jest kolejność iteracji.
    //TreeMap:
    //- implementuje Map i przechowuje swoje elementy w czerwowno-czarnej strukturze drzewa, co pozwala na zachowanie porządku sortowania kluczy.
    //- dostęp, wstawianie i usuwanie elementów odbywa się w czasie logarytmicznym O(log n).
    //ConcurrentHashMap:
    //- przeznaczona do używania w aplikacjach wielowątkowych bez konieczności blokowania całej mapy.
    //- zapewnia lepszą skalowalność niż Hashtable lub synchronizowane wersje HashMap.
    //
    //Rodzaje Set:
    //TreeSet:
    //- implementuje Set na bazie TreeMap
    //- elementy przechowywane są w posortowanej kolejności zgodnie z ich naturalnym porządkiem lub porządkiem określonym przez kompilator.
    //- operacje dostępu i modyfikacji mają złożoność O(log n).
    //LinkedListSet:
    //- podobnie jak LinkedHashMap jest opearte na HashMap z dodatkową strukturą listy dwukierunkowej, która utrzymuje kolejność wstawiania elementów.
    //- jest szczególnie użyteczne, gdy wymagana jest zarówno unikalność elementów, jak i zachowanie kolejności ich wstawienia.
    //EnumSet:
    //- implementacja interfejsu Set dla elementów typu wyliczeniowego enum.
    //- jest bardzo wydajna i reprezentowana wewnętrznie jako bitowe pola wartości wyliczeniowych.
}
