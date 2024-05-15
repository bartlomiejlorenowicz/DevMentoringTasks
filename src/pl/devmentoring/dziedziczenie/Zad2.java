package pl.devmentoring.dziedziczenie;

public class Zad2 {
    // Stwórz klasę Shape i jej podklasę Square. Square ma posiadać konstruktor, który przyjmie length jako argument.
    // Obie klasy mają posiadać metodę obliczającą pole figury. Domyślnie Shape ma zwracać wartość 0.
    public static void main(String[] args) {
        Shape square = new Square(2);
        System.out.println(square.figureArea());
    }
}
