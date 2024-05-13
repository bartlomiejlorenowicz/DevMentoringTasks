package pl.devmentoring.petle;

public class Zad9 {

    // Wypisz wartość średniej arytmetycznej pierwszych 10 liczb naturalnych.
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        double avg = sum / 10.0;
        System.out.println("average number is equal to: " + avg);
    }
}
