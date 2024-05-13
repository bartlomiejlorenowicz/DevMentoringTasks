package pl.devmentoring.instrukcjesterujace;

import java.util.Scanner;

public class Zad3 {
    // Napisz program, który odczyta od użytkownika takie dane jak:
    //-	Imię
    //-	Nazwisko
    //-	Wiek
    //-	Wzrost
    //A następnie na podstawie pobranych informacji wyświetli komunikat: “Hello <Twoje imię i nazwisko>! Thank you for joining us.
    // You are <Twój wiek> years old and your height is <Twój wzrost>”.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your lastname:");
        String lastname = scanner.nextLine();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Enter your height:");
        double height = scanner.nextDouble();
        scanner.close();

        System.out.println("Hello " + name + " " + lastname + "! Thank you for joining us. You are " + age + " years old and your height is " + height);

    }
}
