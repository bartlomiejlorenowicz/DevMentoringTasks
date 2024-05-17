package pl.devmentoring.zaawansowaneOOP;

import java.util.List;

abstract class Depot {
    String name;
    private List<PublicTransportVehicle> vehicles;

    public Depot(String name) {
        this.name = name;
    }

    public void addVehicle(PublicTransportVehicle vehicle) {
        vehicles.add(vehicle);
    }

    public String name() {
        return name;
    }

    public List<PublicTransportVehicle> vehicles() {
        return vehicles;
    }

    public abstract String getInfo();
}
