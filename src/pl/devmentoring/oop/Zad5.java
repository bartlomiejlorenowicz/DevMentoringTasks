package pl.devmentoring.oop;

public class Zad5 {
    // Stwórz klasę reprezentującą pojazd. Dodaj do niej pola określające maksymalną prędkość obiektu oraz jego przebieg
    // (który inicjalizowac na początku będziesz wartością 0). Dodaj do klasy metodę, która zwiększać będzie wartość pola
    // przebiegu o przesłaną wartość typu float. W klasie tej dodatkowo mają się znaleźć settery i gettery do każdego z pól.
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle);

        vehicle.setMaxSpeed(200);
        vehicle.setMileage(100000);

        System.out.println(vehicle);
    }
}
