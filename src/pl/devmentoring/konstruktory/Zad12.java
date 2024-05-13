package pl.devmentoring.konstruktory;

import java.util.Map;

public class Zad12 {
    // Zrób system, który obsługiwał będzie określone zamówienia. W programie istnieć będą 2 klasy:
    // Manager oraz Order. W Managerze ma się znajdować mapa zamówień, w którym kluczem będzie obiekt zamówienia,
    // a wartością jego ilość na stanie. W klasie Order natomiast mają znajdować się takie pola jak: id, nazwa, cena.
    //
    //Funkcjonalność programu to:
    //- Dodawanie nowego zamówienia do mapy: jeżeli dodajemy obiekt, którego id znajduje się już w mapie, to nie
    // dodajemy do niej nowego wpisu, ale zwiększamy jego ilość.
    //- Dsuwanie zamówienia: zmniejszamy ilość o 1, zastanów się jak obsłużyć sytuację gdy ilość będzie równa 0.
    //
    //Uwaga:
    //Z racji natury mapy, nie można przechowywać obiektu “standardowo zaimplementowanej klasy”. Aby to było możliwe,
    // należy nadpisać metody hashCode oraz equals w klasie, której obiekt ma być kluczem.
    //
    //Tutaj omówienie rozwiązania:
    // https://stackoverflow.com/questions/9440380/using-an-instance-of-an-object-as-a-key-in-hashmap-and-then-access-it-with-exac
    public static void main(String[] args) {
        Manager manager = new Manager();
        Map<Order, Integer> orders = manager.orders;
        Order order1 = new Order(1, "chocolate", 22.0);
        Order order2 = new Order(2, "milk", 12.0);
        Order order3 = new Order(3, "mars", 5.0);
        Order order4 = new Order(4, "orange juice", 10);
        manager.addOrder(order1);
        manager.addOrder(order2);
        manager.addOrder(order3);
        manager.addOrder(order4);
        manager.addOrder(order1);
        manager.addOrder(order1);
        System.out.println(orders);

        manager.deleteOrder(order1);
        System.out.println(orders);

    }
}
