package pl.devmentoring.zaawansowaneOOP;

public class Zad1 {
    // Omów, czym jest:
    //-	Polimorfizm
    //-	Klasa abstrakcyjna
    //-	Interfejs (oraz jego różnica względem klasy abstrakcyjnej)

    // Polimorfizm – jedno z fundamentalnych zasad programowania obiektowego, które pozwala obiektom różnych klas być
    // traktowanymi jako obiekty klasy bazowej. Dzięki polimorfizmowi można pisać bardziej elastyczny i łatwiejszy
    // do rozbudowy kod.
    //Rodzaje polimorfizmu:
    //- Polimorfizm statyczny: to forma polimorfizmu, która jest rozwiązywana w czasie kompilacji.
    // Np. przeciążanie metod (method overloading), który polega na zdefiniowaniu wielu metod o tej
    // samej nazwie w jednej klasie, ale różniących się typem lub liczbą parametrów.
    //- Polimorfizm dynamiczny: który jest rozwiązywany w czasie wykonywania programu.
    // Np: nadpisywanie metod (method overriding), który polega na nadpisaniu metody w
    // klasie pochodnej, która ma taką samą sygnaturę jak metoda w klasie bazowej.

    //Klasa abstrakcyjna
    //W java klasa abstrakcyjna nie może być bezpośrednio instancjonowana i służy jako baza dla innych klas.
    // Klasa abstrakcyjna może zawierać zarówno metody abstrakcyjne (bez implementacji), jak i metody zdefiniowane (z implementacją).
    // Służy do definiowania wspólnego zachowania, które mogą dziedziczyć i implementować klasy pochodne.
    //Klasę abstrakcyjną używamy gdy:
    //- wspólne zachowanie: kiedy mamy wspólne zachowanie lub stan, który powinien być współdzielony przez różne klasy.
    //- częściowa implementacja: kiedy chcemy dostarczyć częściową implementację metod, które mogą być wspólne dla różnych klas.
    //- Hierarchia klas: Kiedy chcemy stworzyć hierarchię klas, w której niektóre klasy bazowe nie powinny być instancjonowane,
    // ale powinny dostarczać wspólną funkcjonalność.

    // Interfejs
    // Interfejs w Javie to specjalny typ, który definiuje zestaw metod, które klasa musi implementować. Interfejsy służą do
    // definiowania kontraktów (umów), między różnymi klasami, pozwalając na osiągnięcie polimorfizmu i wielodziedziczenia w Javie.
    //Cechy:
    //- interfejsy mogą zawierać tylko deklaracje metod (od javy 8), które muszą być implementowane.
    //- umożliwia polimorficzne zachowanie, gdzie obiekty różnych klas mogą być traktowane jako obiekty typu interfejsu.
    //- klasa może implementować wiele interfejsów, co pozwala na osiągnięcie wielodziedziczenia, które nie jest możliwe w przypadku klas.
    //- interfejsy mogą zawierać stałe (zmienne statyczne i finalne).
    //
    //Interfejs vs Klasa abstrakcyjna
    //1.	Dziedziczenie:
    //- Interfejs: klasa może zawierać wiele interfejsów.
    //- Klasa abstrakcyjna: może dziedziczyć tylko po jednej klasie.
    //2.	Metody:
    //- Interfejs: może zawierać tylko deklaracje metod (do Javy 8). Od Javy 8 może zawierać metody domyślne i statyczne.
    //- Klasa abstrakcyjna: może zawierać zarówno metody abstrakcyjne, jak i zdefiniowane.
    //3.	Pola:
    //- Interfejs: może zawierać tylko publiczne, statyczne i finalne pola (konstanty).
    //- Klasa abstrakcyjna: może zawierać zmienne instancji.
    //4.	Konstruktory:
    //- Interfejs: nie może mieć konstruktorów.
    //- Klasa abstrakcyjna: może mieć konstruktor.
}

