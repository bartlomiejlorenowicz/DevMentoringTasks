package pl.devmentoring.tablice;

import java.util.HashMap;
import java.util.Map;

public class People {
    Map<String, String> people = generateData();

    public Map<String, String> generateData() {
        Map<String, String> localPeople = new HashMap<>();
        localPeople.put("Euzebiusz", "4567854");
        localPeople.put("Bogdan", "234554");
        localPeople.put("Robert", "4578654");
        localPeople.put("Ewa", "95667994");
        localPeople.put("Anna", "4275454");
        return localPeople;
    }
}
