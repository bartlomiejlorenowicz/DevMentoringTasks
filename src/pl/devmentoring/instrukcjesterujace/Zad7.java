package pl.devmentoring.instrukcjesterujace;

import java.util.Scanner;

public class Zad7 {
    // Jak zrefaktoryzujesz poniższy kod?
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Choose your Zodiac sign: Aquarius, Pisces, Aries, Taurus, " +
//                "Gemini, Cancer, Leo, Virgo, Libra, Scorpio, Sagittarius, Capricorn");
//        String s = scanner.next();
//
//        if (s.equals("Aquarius")) {
//            System.out.println("You're born between " + "20 Jan and 18 Feb");
//        } else if (s.equals("Pisces")) {
//            System.out.println("You're born between " + "19 Feb and 19 Mar");
//        } else if (s.equals("Aries")) {
//            System.out.println("You're born between " + "21 Mar and 19 Apr");
//        } else if (s.equals("Taurus")) {
//            System.out.println("You're born between " + "20 Apr and 22 May");
//        } else if (s.equals("Gemini")) {
//            System.out.println("You're born between " + "20 Apr and 22 May");
//        } else if (s.equals("Cancer")) {
//            System.out.println("You're born between " + "22 Jun and 22 Jul");
//        } else if (s.equals("Leo")) {
//            System.out.println("You're born between " + "23 Jul and 22 Aug");
//        } else if (s.equals("Virgo")) {
//            System.out.println("You're born between " + "24 Aug and 22 Sep");
//        } else if (s.equals("Libra")) {
//            System.out.println("You're born between " + "23 Sep and 22 May");
//        } else if (s.equals("Scorpio")) {
//            System.out.println("You're born between " + "23 Oct and 21 Nov");
//        } else if (s.equals("Sagittarius")) {
//            System.out.println("You're born between " + "22 Nov and 21 Dec");
//        } else if (s.equals("Capricorn")) {
//            System.out.println("You're born between " + "22 Dec and 19 Jan");
//        }

        Scanner scanner = new Scanner(System.in);

        ZodiacMenu zodiacMenu = new ZodiacMenu();

        // wyswietlenie menu
        zodiacMenu.displayMenu();

        // pobranie znaku zodiaku od uzytkownika
        String userZodiacSign = scanner.next();

        // metoda, ktora sprawdza czy dany znak istnieje w tablicy, a nastepnie ja wyswietla
        zodiacMenu.displayZodiacSigns(userZodiacSign);
        scanner.close();
    }
}
