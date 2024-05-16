package pl.devmentoring.dziedziczenie;

public class Zad7 {
    // Dlaczego metoda main musi być zdefiniowana jako statyczna?

    // Dzięki temu może bowiem zostać wykonana, mimo że w trakcie uruchamiania aplikacji nie powstały jeszcze żadne obiekty.
    // Jest punktem wejścia programu w Javie. JVM szuka sygnatury public static void main(String[] args) bez tej sygnatury JVM
    // nie wiedziałaby, gdzie zacząć.
}
