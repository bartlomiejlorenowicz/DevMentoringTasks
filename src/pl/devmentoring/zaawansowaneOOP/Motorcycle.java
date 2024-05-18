package pl.devmentoring.zaawansowaneOOP;

public class Motorcycle extends Vehicle {
    public Motorcycle(double maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public String getInfo() {
        return "max speedm motorcycle " + maxSpeed;
    }
}
