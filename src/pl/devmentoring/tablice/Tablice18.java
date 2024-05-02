package pl.devmentoring.tablice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tablice18 {
    // Zmodyfikuj kod z zadania 17 tak, aby możliwe było dodawanie i usuwanie przez użytkownika
    // informacji o nowych albumach do mapy.
    // Program ma zawierać proste menu.

    private static Map<String, String> bands = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        initializeBands();
        int option;
        do {
            printMenu(bands);
            option = scanner.nextInt();
            selectedOption(option);
        } while (option != 4);
        scanner.close();
    }

    static void printMenu(Map<String, String> bands) {
        System.out.println("-----------------------");
        System.out.println("    ALBUMY  ");
        System.out.println("-----------------------");
        for (Map.Entry<String, String> entry : bands.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("-----------------------");
        System.out.println("1 - wyswietl wszystkie albumy");
        System.out.println("2 - dodaj nowy album");
        System.out.println("3 - usun istniejacy album");
        System.out.println("4 - wyjscie");
    }

    static void addNewAlbum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe albumu, ktora chcesz dodac");
        String newAlbum = scanner.nextLine();
        System.out.println("Podaj zespol");
        String band = scanner.nextLine();
        bands.put(newAlbum, band);
    }

    static void removeAlbum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe albumu, ktora chcesz dodac");
        String removeAlbum = scanner.nextLine();
        if (bands.containsKey(removeAlbum)) {
            bands.remove(removeAlbum);
            System.out.println("album zostal usuniety");
        } else {
            System.out.println("nie znaleziono takiego albumu");
        }
    }

    static void initializeBands() {
        bands.put("The Sensual World", "Kate Bush");
        bands.put("Shaday", "Ofra Haza");
        bands.put("Achtung Baby", "U2");
        bands.put("Aion", "Dead Can Dance");
        bands.put("Invisible Touch", "Genesis");
    }

    static void selectedOption(int scanner) {
        System.out.println("Wybierz opcje: 1 - 2 - 3");
        int option = scanner;
        switch (option) {
            case 1:
                printMenu(bands);
                break;
            case 2:
                addNewAlbum();
                break;
            case 3:
                removeAlbum();
                break;
            case 4:
                System.out.println("wyjscie");
                break;
            default:
                System.out.println("Cos poszlo nie tak.");
        }
    }
}
