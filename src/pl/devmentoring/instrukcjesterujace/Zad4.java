package pl.devmentoring.instrukcjesterujace;

import java.util.Scanner;

public class Zad4 {

    // Napisz program, który pobierze od użytkownika dowolną liczbę całkowitą.
    // Następnie na podstawie danych wejściowych, wyświetlaj komunikat “liczba parzysta” lub “nieparzysta”.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("the number  is odd");
        }
        scanner.close();
    }
}
