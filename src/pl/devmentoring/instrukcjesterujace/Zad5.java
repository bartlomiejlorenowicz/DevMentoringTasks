package pl.devmentoring.instrukcjesterujace;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        // Napisz program “FizzBuzz”, który będzie pobierał od użytkownika dowolną liczbę całkowitą i będzie wyświetlał komunikat:
        //-	“Fizz”, gdy liczba ta jest podzielna przez 3
        //-	“Buzz”, gdy liczba ta jest podzielna przez 4
        //-	“FizzBuzz”, gdy liczba ta jest podzielna przez 3 i 4 równocześnie
        //-	“N/A”, gdy liczba ta nie jest podzielna ani przez 3, ani przez 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 4 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 4 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("N/A");
        }
        scanner.close();
    }
}
