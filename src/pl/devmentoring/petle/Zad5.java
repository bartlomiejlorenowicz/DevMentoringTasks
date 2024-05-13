package pl.devmentoring.petle;

public class Zad5 {

    // Napisz program wyświetlający liczby z przedziału <0, 5, 10, 15, …, 100>

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i += 5) {
            System.out.print(i + " ");
        }
    }
}
