package pl.devmentoring.petle;

import java.util.Scanner;

public class Zad13 {
    // Wyświetl użytkownikowi następujące menu:
    //
    //1.	Wyświetl ilość kursantów.
    //2.	Wyświetl nazwę firmy.
    //3.	Wyświetl rok założenia firmy.
    //4.	Wyjdź.
    //
    //Po wybraniu opcji nr 1, na ekranie powinna wyświetlać się liczba: 70.
    //Po wybraniu opcji n 2, na ekranie powinna wyświetlić się nazwa: “Devs-Mentoring.pl”.
    //Po wybraniu opcji nr 3, na ekranie powinien wyświetlić się rok 2021.
    //Ostatnia opcja natomiast ma przerywać działanie programu.
    //
    //Menu ma działać w oparciu o wybrany rodzaj pętli i ma wyświetlać userowi możliwe do wybrania wybory, dopóki nie wybierze opcji nr 4.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            Menu.printMenu();
            while (!scanner.hasNextInt()) {
                System.out.println("This is not a number");
                System.out.println("Enter a number:");
                scanner.next();
            }
            select = scanner.nextInt();
            Menu.printData(select);
        } while (select != 4);
        scanner.close();
    }
}
