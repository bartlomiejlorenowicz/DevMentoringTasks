package pl.devmentoring.oop;

public class Zad4 {
    // Stwórz klasę reprezentującą studenta. Cechy studenta określaj z poziomu odpowiednich metod.
    // Dodaj do klasy metodę wyświetlającą informacje o danym obiekcie. Pamiętaj o odpowiednim podziale
    // struktury projektu (utwórz nowy plik na klasę).

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Adam");
        student.setLastname("Nowak");
        student.setAge(20);

        System.out.println(student.toString());
    }
}
