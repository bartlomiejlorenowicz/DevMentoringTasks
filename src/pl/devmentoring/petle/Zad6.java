package pl.devmentoring.petle;

import java.util.Scanner;

public class Zad6 {

    // Napisz program, wyświetlający n kolejnych potęg liczby 2. Wartość n podaje użytkownik.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            double result = Math.pow(2, i);
            System.out.println("2 raised to the power " + i + " = " + result);
        }
        scanner.close();
    }
}
