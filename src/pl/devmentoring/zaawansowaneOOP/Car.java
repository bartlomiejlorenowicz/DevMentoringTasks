package pl.devmentoring.zaawansowaneOOP;

public class Car extends Vehicle {
    public Car(double maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public String getInfo() {
        return "max speed Car: " + maxSpeed;
    }
}
