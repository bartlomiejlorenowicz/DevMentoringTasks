package pl.devmentoring.zaawansowaneOOP;

public class Tram extends PublicTransportVehicle {
    private int numberOfWagons;
    private double maxSpeed;

    public Tram(double maxSpeed, int number, Depot depot, int numberOfWagons) {
        super(maxSpeed, number, depot);
        this.numberOfWagons = numberOfWagons;
    }

    public Tram(double maxSpeed) {
        super(maxSpeed, 0, null);
        this.maxSpeed = maxSpeed;
    }

    public int numberOfWagons() {
        return numberOfWagons;
    }

    @Override
    public double maxSpeed() {
        return maxSpeed;
    }

    @Override
    public String getInfo() {
        return "max speed tram: " + maxSpeed();
    }
}
