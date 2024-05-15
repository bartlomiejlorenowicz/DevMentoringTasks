package pl.devmentoring.dziedziczenie;

public class Zad1 {
    // Pod następującym linkiem znajdziesz omówienie najważniejszych zasad programowania.
    // Dokładnie zapoznaj się z każdą z nich i wskaż te, których dotyczy dziedziczenie w kodzie.

    // DRY - Don't repeat yourself : nie powtarzaj się. Dziedziczenie może być używane do centralizowania
    // wspólnego zachowania w klasie bazowej, aby uniknąć duplikacji kodu w wielu klasach.

    // Prawo Curly'ego - rób jedną rzecz. Dziedzicznie pomaga tworzyć wyspecjalizowane klasy, które rozszerzają
    // klasy bazowe, zapewniając, że jednoznaczną odpowiedzialność.

    // KISS keep it simple stupid - dziedziczenie upraszcza kod, ale może być nadużywane. Należy dążyć do jasnych i klarowanych
    // hierarchii i dziedziczenia.

    // YAGNI you ain't gonna need it. Unikaj tworzenia głębokich hierarhii dziedziczenia lub skomplikowanych struktur klasowych,
    // dopóki nie ma wyraźnej potrzeby.

    // SOLID
    // 1. Single Responsibility Principle (SRP). Używaj dziedziczenia do rozdzielenia odpowiedzialności zapewniając,
    // że każda klasa ma jedną odpowiedzialność.
    // 2. Open/Close Principle (OCP). Rozszerzaj klasy bazowe, aby dodać nową funkcjonalność bez modyfikacji istniejącego kodu.
    // 3. Liskov Substitution Principle (LSP). Upewnij się, że klasy pochodne mogą być używane zamiennie z ich klsami bazowymi bez
    // zmiany poprawności programu.
    // 4. Interface Segregation Principle (ISP). Twórz specyficzne interfejsy dla różnych klientów, umożliwiając klasom
    // implementację wielu, małych specyficznych interfejsów.
    // 5. Dependency Inversion Principe (DIP). Używaj abstrakcyjnych klas i interfejsów do definiowania zależnośći,
    // umożliwiając bardziej elastyczne i luźno powiązane projekty.
}
