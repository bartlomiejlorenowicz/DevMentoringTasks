package pl.devmentoring.dziedziczenie;

public class Zad8 {
    // Stwórz klasę MessagingSystem, której zadaniem będzie wyświetlanie logów.
    //System będzie wyświetlał logi ostrzegawcze i informacyjne, w tym celu stwórz klasy Warning oraz Info.
    //Każda z tych klas będzie przechowywać zahardkodowanego String-a:
    //-	Warning: “Watch out! Warning here!”
    //-	Info: “Listen carefully. We have some information regarding …”
    //oraz licznik przechowujący informację, ile razy dana wiadomość została zalogowana.
    //
    //Komunikaty mają wyświetlać się w momencie, gdy wywołamy metodę execute() z ww. klas. Metoda ta będzie wywoływana
    // z poziomu MessagingSystem za pomocą metod showWarning() oraz showInfo() dla odpowiedniej klasy (sugeruj się nazwami metod podczas implementacji).
    //
    //Przy każdym wywołaniu metod show..() wyświetl również informacje ile razy sumarycznie była użyta metoda execute().
    //
    //Zaimplementuj powyższą funkcjonalność bez instancjonowania klas Info i Warning.
    public static void main(String[] args) {
        MessagingSystem messagingSystem = new MessagingSystem();

        messagingSystem.showInfo();
        messagingSystem.showWarning();
        messagingSystem.showWarning();

    }

}
