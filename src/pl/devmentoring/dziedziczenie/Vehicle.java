package pl.devmentoring.dziedziczenie;

public class Vehicle {
    protected int noTires;
    protected int noSeats;
    protected String driverName;

    Vehicle(int noTires, int noSeats, String driverName) {
        this.noTires = noTires;
        this.noSeats = noSeats;
        this.driverName = driverName;
    }

    protected void honk() {
        System.out.println("BEEEP");
    }

    protected void showDetails() {
        System.out.println("General vehicle details: ");
        System.out.println("No tires: " + this.noTires + ", no seats: " + this.noSeats + ", driver's name: " + this.driverName);
    }
}
