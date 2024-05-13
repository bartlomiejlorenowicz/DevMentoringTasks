package pl.devmentoring.petle;

import java.util.Scanner;

public class Zad3 {
    // Napisz program wyświetlający liczby całkowite z przedziału <0; y>, gdzie y podaje użytkownik. Wykonaj to na pętli for i while.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a range: ");
        int maxRangeLimit = scanner.nextInt();

        for (int i = 0; i <= maxRangeLimit; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int index = 0;
        while (index <= maxRangeLimit) {
            System.out.println(index + " ");
            index++;
        }
        scanner.close();
    }
}
