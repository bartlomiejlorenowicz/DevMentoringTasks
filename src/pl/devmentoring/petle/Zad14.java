package pl.devmentoring.petle;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zad14 {

    // Napisz program, który wczytuje od użytkownika liczbę oznaczającą, ile należy wylosować liczb z zakresu -100 do 100.
    //Następnie dokonuje obliczeń stosunku liczby wylosowanych liczb dodatnich (bez zera) do liczb ujemnych oraz
    // wyświetla najmniejszą i największą znalezioną liczbę (użytkownik musi podać przynajmniej 2 liczby).
    //Wynikiem działania programu ma być informacja na temat wszystkich trzech wartości.
    //
    //Przykład dla liczby podanej przez użytkownika 3, następuje losowanie, np:
    //11 -5 93
    //W wyniku na ekran zostaje wyświetlona informacja:
    //2 -5 93
    //// bo stosunek 2 (2 liczby dodatnie / 1 liczba ujemna) oraz min: -5, max: 93
    //
    //Podpowiedź:
    //Poniżej post ukazujący, jak losować liczby z określonego przedziału:
    // https://forum.pasja-informatyki.pl/2549/generowanie-pseudo-losowych-liczb-z-zadanego-przedzialu
    //
    //Przy okazji - znajdź informacje, czym są liczby pseudolosowe w Javie.

    // Liczby pseudolosowe w Java: to liczby, które wyglądają jak losowe, ale są tak naprawdę wytwarzane przez algorytmy komputerowe.
    // Te algorytmy stosują określone matematyczne formuły, by wyprodukować ciąg liczb. Chociaż te liczby mogą wydawać się losowe na pierwszy rzut oka,
    // to są one wynikiem precyzyjnych i powtarzalnych procedur, co oznacza, że jeśli zna się sposób ich tworzenia, można przewidzieć kolejne liczby w ciągu.
    // Jeśli w aplikacji ważne jest bezpieczeństwo należy używać klasy SecureRandom, oferuje ona wyższy poziom bezpieczeństwa.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of draws:");
        //pobranie liczby losowan od uzytkownika
        int quantityOfDraws = scanner.nextInt();
        // utworzenie tablicy dla liczb wylosowanych za pomoca klasy Random
        int[] drawnNumbers = new int[quantityOfDraws];
        int positiveNumbers = 0;
        int negativeNumbers = 0;

        for (int i = 0; i < quantityOfDraws; i++) {
            // losowanie losowych liczb i zapisanie do tablicy
            drawnNumbers[i] = randomNumbers();
            if (drawnNumbers[i] >= 0) {
                positiveNumbers++;
            } else {
                negativeNumbers++;
            }
        }

        System.out.println("Drawn numbers: " + Arrays.toString(drawnNumbers));

        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < drawnNumbers.length; i++) {
            if (drawnNumbers[i] > max) {
                max = drawnNumbers[i];
            }
            if (drawnNumbers[i] < min) {
                min = drawnNumbers[i];
            }
        }
        // wyswietlenie wyniku
        printResult(quantityOfDraws, positiveNumbers, negativeNumbers, min, max);
        scanner.close();
    }

    private static int randomNumbers() {
        Random random = new Random();
        int rnd = random.nextInt(100 + 100 + 1) - 100;
        return rnd;
    }

    private static void printResult(int quantityOfDraws, int positiveNumbers, int negativeNumbers, int min, int max) {
        System.out.println("Drawn numbers: " + quantityOfDraws);
        System.out.println("Numbers bigger than zero: " + positiveNumbers);
        System.out.println("Numbers less than zero: " + negativeNumbers);
        System.out.println("the smallest number: " + min);
        System.out.println("the biggest number: " + max);
    }
}
