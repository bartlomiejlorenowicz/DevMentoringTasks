package pl.devmentoring.konstruktory;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    Map<Order, Integer> orders = new HashMap<>();

    public void addOrder(Order order) {
        if (orders.containsKey(order)) {
            orders.put(order, orders.get(order) + 1);
        } else {
            orders.put(order, 1);
        }
    }

    public void deleteOrder(Order order) {
        if (orders.containsKey(order)) {
            int currentlyQuantity = orders.get(order);
            if (currentlyQuantity > 1) {
                orders.put(order, currentlyQuantity - 1);
            } else {
                orders.remove(order);
            }
        }
    }
}
