package pl.devmentoring.petle;

import java.util.Scanner;

public class Zad8 {
    // Zadanie polega na napisaniu programu, który będzie sumować liczby całkowite wpisane przez użytkownika tak długo,
    // aż po wczytaniu poprzedniej liczby suma zwiększyła się. Na koniec program wypisuje ostateczną sumę Początkowo suma wynosi 0.
    // Zastosuj do tego rozwiązania pętlę while.
    //Przykład:
    //Użytkownik przykładowo wprowadza kolejno liczby 1, 2, 3, 0 wtedy zwrócona suma to 1 + 2 + 3 + 0 = 6.
    // Z kolei dla liczb 1, 9, 2, -12 suma wyniesie 0.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        int previousSum = Integer.MIN_VALUE;

        while (previousSum < sum) {
            System.out.println("Enter a number:");
            num = scanner.nextInt();
            previousSum = sum;
            sum += num;
            if (previousSum >= sum) {
               sum = previousSum;
               break;
            }
        }
        System.out.println(sum);
    }
}
