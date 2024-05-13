package pl.devmentoring.instrukcjesterujace;

public class Zad8 {
    // Wskaż instrukcje warunkowe, w których warunek będzie prawdą. Jakim efektem zakończy się każda z operacji?

    public static void main(String[] args) {

        int value1 = 14;
        if(value1 > 0 && value1 < 20){
            System.out.println("OK!");
        }
        // Warunek będzie prawdą value mieści się w zakresie value > 0 i value < 20. Wynikiem operacji będzie „OK!”

        int value2 = 99;
        String isEven = value2 % 2 == 0 ? "parzysta" : "nieparzysta";
        // Warunek nie będzie prawdą liczba 99 jest „nieparzysta”

        char letter_k = 'k', letter_j = 'j';
        if(letter_k > letter_j){
            System.out.println("YES");
        }
        else{
            System.out.println("NO!");
        }
        // Warunek letter_k > letter_j jest prawdziwy, ponieważ litera k = 107, a litera
        // j = 106. Zostanie wyświetlony napis YES
    }
}
