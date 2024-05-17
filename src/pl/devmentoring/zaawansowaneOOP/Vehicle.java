package pl.devmentoring.zaawansowaneOOP;

abstract class Vehicle {
    protected double maxSpeed;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double maxSpeed() {
        return maxSpeed;
    }

    public abstract String getInfo();
}
