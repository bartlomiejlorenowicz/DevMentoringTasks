package pl.devmentoring.zaawansowaneOOP;

public class Tram extends PublicTransportVehicle {
    private int numberOfWagons;

    public Tram(double maxSpeed, int number, Depot depot, int numberOfWagons) {
        super(maxSpeed, number, depot);
        this.numberOfWagons = numberOfWagons;
    }

    public int numberOfWagons() {
        return numberOfWagons;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " number of wagons: " + numberOfWagons;
    }
}
