package pl.devmentoring.petle;

public class Menu {

    static void printData(int selectedNumber) {
        switch (selectedNumber) {
            case 1 :
                System.out.println("70");
                break;
            case 2 :
                System.out.println("Devs-Mentoring.pl");
                break;
            case 3 :
                System.out.println("2021");
                break;
            case 4:
                System.out.println("Closing the program");
                break;
        }
    }

    static void printMenu() {
        System.out.println("1. Wyświetl ilość kursantów.");
        System.out.println("2. Wyświetl nazwę firmy.");
        System.out.println("3. Wyświetl rok założenia firmy.");
        System.out.println("4. Wyjdź.");
        System.out.print("Wybierz opcję: ");
    }
}
