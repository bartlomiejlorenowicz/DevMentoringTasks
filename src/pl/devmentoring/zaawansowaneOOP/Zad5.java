package pl.devmentoring.zaawansowaneOOP;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Zad5 {
    // Zdefiniuj abstrakcyjną klasę modelującą papiery wartościowe. Klasa powinna posiadać:
    //
    //-	prywatne pole typu BigDecimal - wartość;
    //-	prywatne pole typu int - id;
    //-	potrzebne accesory (gettery i settery);
    //-	konstruktor;
    //-	publiczną abstrakcyjną bezargumentową metodę step;
    //
    //Następnie zaimplementuj dwie klasy dziedziczące po papierach wartościowych:
    //-	obligacja (Debenture)
    //-	posiadającą pole oprocentowanie oraz implementacje metody step (w każdym kroku dodajemy odsetki do wartości);
    //
    //-	akcja (Stock)
    //-	implementacje metody step (ceny akcji mogą zwiększyć się o 10% lub zmniejszyć się o 10%.
    // Korzystając z klasy Random zaproponuj losowanie wybierające wzrost lub spadek ceny).
    //
    //Napisz klasę reprezentującą portfel papierów wartościowych. Klasa składa się z:
    //-	Prywatnej kolekcji papierów wartościowych,
    //-	Konstruktora, dostającego w argumencie powyższą kolekcję,
    //-	Publicznej bezargumentowej metody step - wykonującej krok dla każdego instrumentu w portfelu,
    //-	Publicznej bezargumentowej metody zwracającej wartości całego portfela.
    //
    //Utwórz obiekt klasy portfel, a następnie wyświetl jego koszt po jednym kroku.
    public static void main(String[] args) {
        List<Securities> securities = new ArrayList<>();
        securities.add(new Debenture(new BigDecimal(1000), 100, new BigDecimal(0.05)));
        securities.add(new Stock(new BigDecimal("100"), 200));
        securities.add(new Stock(new BigDecimal("300"), 201));

        Wallet wallet = new Wallet(securities);

        System.out.println("Total in wallet: " + wallet.getTotalValue());

        wallet.step();

        System.out.println("Total value after step: " + wallet.getTotalValue());
    }
}
