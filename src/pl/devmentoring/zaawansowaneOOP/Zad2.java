package pl.devmentoring.zaawansowaneOOP;

public class Zad2 {
    // Przemodeluj rozwiązanie zadania 4. z poprzedniego szkolenia na takie, w którym wykorzystasz klasy abstrakcyjne (lub interfejsy).

    public static void main(String[] args) {
        TramDepot tramDepot = new TramDepot("Central Tram Depot");
        BusDepot busDepot = new BusDepot("Bus depot");

        Tram tram = new Tram(120, 70, tramDepot, 2);
        Bus bus = new Bus(130, 60, busDepot, 4);

        System.out.println(tramDepot.getInfo());
        System.out.println(busDepot.getInfo());
    }
}
