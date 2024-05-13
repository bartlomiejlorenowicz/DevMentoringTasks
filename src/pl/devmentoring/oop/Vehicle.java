package pl.devmentoring.oop;

public class Vehicle {
    private float maxSpeed;
    private float mileage = 0f;

    public void increaseMileage(float mileage) {
        this.mileage += mileage;
    }

    public double maxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float mileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maxSpeed=" + maxSpeed +
                ", mileage=" + mileage +
                '}';
    }
}
