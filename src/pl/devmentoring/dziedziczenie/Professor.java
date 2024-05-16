package pl.devmentoring.dziedziczenie;

public class Professor extends Person {
    private double salary;

    public Professor(String name, int phoneNumber, String email, Address address, double salary) {
        super(name, phoneNumber, email, address);
        this.salary = salary;
    }

    @Override
    public void purchaseParkingPass() {
        super.purchaseParkingPass();
        System.out.println("University parking pass for staff purchased");
    }
}
