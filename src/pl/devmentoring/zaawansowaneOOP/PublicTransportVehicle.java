package pl.devmentoring.zaawansowaneOOP;

public class PublicTransportVehicle extends Vehicle{
    private int number;
    private Depot depot;

    public PublicTransportVehicle(double maxSpeed, int number, Depot depot) {
        super(maxSpeed);
        this.number = number;
        this.depot = depot;
    }

    public int number() {
        return number;
    }

    public Depot depot() {
        return depot;
    }

    @Override
    public String getInfo() {
        return "Number: " + number + ", max speed: " + maxSpeed() + " Depot: " + depot.name();
    }
}
