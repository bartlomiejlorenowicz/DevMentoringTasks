package pl.devmentoring.petle;

import java.util.Scanner;

public class Zad15 {

    // Sprawdzanie, czy liczba jest doskonała.
    //Napisz program, który sprawdzi, czy podana przez usera liczba jest doskonała. Liczba doskonała, to taka liczba,
    // która jest sumą wszystkich swoich dzielników właściwych (czyli mniejszych od niej samej).
    //Przykłady liczb doskonałych: 6 (6 = 1 + 2 + 3), 28, 496, 8128.
    //
    //Podpowiedź:
    //Wykorzystaj również instrukcje warunkowe i modulo (%)

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        while (!scanner.hasNextInt()) {
            System.out.println("this number is not correct:");
            scanner.next();
        }

        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println("The number " + number + " is a perfect number.");
        } else {
            System.out.println("The number " + number + " is not a perfect.");
        }
        scanner.close();
    }
}
