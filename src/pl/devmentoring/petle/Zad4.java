package pl.devmentoring.petle;

public class Zad4 {

    // Napisz program wyświetlający liczby całkowite z przedziału <100; 50> w porządku malejącym. Wykonaj to na pętli for i while.
    public static void main(String[] args) {

        for (int i = 100; i >= 50; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        int i = 100;
        while (i >= 50) {
            System.out.print(i + " ");
            i--;
        }
    }
}
