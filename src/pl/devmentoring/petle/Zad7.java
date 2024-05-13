package pl.devmentoring.petle;

import java.util.Scanner;

public class Zad7 {
    // Napisz program, który wyświetli liczby z przedziału <50; 100> podzielne przez całkowitą liczbę k,
    // którą podaje użytkownik. Przekształć program tak, aby przedział podawał również użytkownik.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to divide by");
        int k = scanner.nextInt();
        while (k == 0) {
            System.out.println("You can not divide by 0! enter a number again");
            k = scanner.nextInt();
        }

        System.out.println("Enter minimum value:");
        int min = scanner.nextInt();

        System.out.println("Enter max value:");
        int max = scanner.nextInt();

        if (min > max) {
            System.out.println("min value is bigger than max");
        } else {
            printNumbersFromRange50to100DivideByK(min, max, k);
        }
        scanner.close();
    }

    static void printNumbersFromRange50to100DivideByK(int min, int max, int k) {
        for (int i = min; i <= max; i++) {
            if (i % k == 0) {
                System.out.println(i);
            }
        }
    }
}
