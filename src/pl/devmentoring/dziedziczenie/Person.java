package pl.devmentoring.dziedziczenie;

public class Person {
    protected String name;
    protected int phoneNumber;
    protected String email;
    protected Address address;

    public Person(String name, int phoneNumber, String email, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public void purchaseParkingPass() {
        System.out.println("Parking pass purchased");
    }

    public String name() {
        return name;
    }

    public int phoneNumber() {
        return phoneNumber;
    }

    public String email() {
        return email;
    }

    public Address address() {
        return address;
    }
}
