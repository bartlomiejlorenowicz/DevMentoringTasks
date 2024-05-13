package pl.devmentoring.instrukcjesterujace;

public class Zad9 {

    public static void main(String[] args) {
        // Jaki będzie efekt poniższej operacji?

        String companyName = "Devs-Mentoring", brandName = "Devs-Hunting";
        System.out.println(companyName.compareTo(brandName));

        // Metoda compareTo() w java jest używana w klasie String do porównywania dwóch ciągów znaków leksykograficznie. Początek porównywanych napisów „Devs-” jest taki sam,
        // różnica pojawia się w M i H. M w tabeli ASCII ma wartość 77, a H = 72. Ponieważ M jest większe wynik będzie dodatni (77 - 72) = 5.
    }


}
