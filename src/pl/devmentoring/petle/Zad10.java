package pl.devmentoring.petle;

import java.util.Scanner;

public class Zad10 {

    // Zadeklaruj trzy zmienne - pierwszą przechowującą informację o startowym poziomie paliwa,
    // drugą określającą ilość astronautów na pokładzie, a trzecią mówiącą, na jakiej wysokości znajduje się rakieta.

    //1.    Poproś użytkownika o podanie początkowego poziomu paliwa. Użytkownik ma kontynuować czynność,
    // dopóki nie poda poprawnej wartości - mieszczącej się pomiędzy 5000 a 30000 litrów.
    //2.	Stwórz drugą pętlę, która będzie prosić o użytkownika o podanie odpowiedniej ilości astronautów znajdujących na pokładzie.
    // Pętla ma walidować podaną liczbę - tak, aby była dodatnia i nie większa niż 7.
    //3.	Zasymuluj pętlą nr 3 lot statku kosmicznego. Kolejne iteracje mają zmniejszać obecny poziom paliwa o określoną wartość.
    // Zużycie paliwa co 100 km zależy od ilości astronautów na pokładzie i jest równe: 300L + 100 * ilosc_astronautow.
    //
    //Pętla więc ma uruchamiać się co 100 km i wykonać tyle iteracji, na ile wystarczy paliwa.
    // Co każdą iterację ma wyświetlać się aktualnie przebyty dystans przez statek kosmiczny.
    //
    //4.	Po wykonaniu się pętli, powinien wyświetlić się komunikat: “Statek kosmiczny dotarł do orbity”,
    // jeżeli przebyta odległość jest większa niż 2000 km lub w przypadku mniejszej odległości - “Statek kosmiczny nie dotarł do orbity”.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fuelStart = 0;
        int crewQuantity;

        // pobranie od uzytkownika wartosci poczatkowej paliwa
        do {
            System.out.println("Enter start value of fuel:");
            while (!scanner.hasNextInt()) {
                System.out.println("Enter a valid number");
                scanner.next();
            }
            fuelStart = scanner.nextInt();
        } while (fuelStart < 5000 || fuelStart > 30000);

        // pobranie od uzytkownika ilosci astronautow
        do {
            System.out.println("Enter quantity of astronauts");
            crewQuantity = scanner.nextInt();
        } while (crewQuantity <= 0 || crewQuantity > 7);

        // symulacja lotu statku
        int fuelConsumptionPer100km = 300 + (100 * crewQuantity);
        int distance = 0;

        while (fuelConsumptionPer100km <= fuelStart) {
                fuelStart -= fuelConsumptionPer100km;
                distance += 100;
                System.out.println("Actual distance: " + distance + " left fuel: " + fuelStart);
        }

        if (distance > 2000) {
            System.out.println("the spacecraft reached orbit");
        } else {
            System.out.println("the spacecraft do not reached orbit");
        }
        scanner.close();
    }
}
