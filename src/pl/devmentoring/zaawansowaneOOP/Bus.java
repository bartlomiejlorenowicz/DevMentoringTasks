package pl.devmentoring.zaawansowaneOOP;

public class Bus extends PublicTransportVehicle {
    private double fuelConsumedThisMonth;

    public Bus(double maxSpeed, int number, Depot depot, double fuelConsumedThisMonth) {
        super(maxSpeed, number, depot);
        this.fuelConsumedThisMonth = fuelConsumedThisMonth;
    }

    public double fuelConsumedThisMonth() {
        return fuelConsumedThisMonth;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " fuel consumed this month: " + fuelConsumedThisMonth;
    }
}
