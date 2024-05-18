package pl.devmentoring.zaawansowaneOOP;

import java.util.ArrayList;
import java.util.List;

public class Zad9 {
    // Zaprojektuj odpowiednią hierarchię klas z przykładową funkcjonalnością (może ona bazować na prostych printach),
    // która odzwierciedlać będzie pojazdy: Motorcycle, Car, Tram i Vehicle (która będzie klasą abstrakcyjną).
    //
    //Stwórz po 3 obiekty każdej klasy, a następnie umieść je w jednej ArrayList. Dzięki jakiemu zjawisku możemy
    // przechowywać różne klasy w odpowiednio zdefiniowanej liście?
    //
    //Wywołaj wybraną metodę z każdego obiektu w przechowywanej liście.

    public static void main(String[] args) {
        Vehicle car = new Car(200);
        Vehicle tram = new Tram(90);
        Vehicle motorcycle = new Motorcycle(300);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(tram);
        vehicles.add(motorcycle);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getInfo());
        }
    }
}
