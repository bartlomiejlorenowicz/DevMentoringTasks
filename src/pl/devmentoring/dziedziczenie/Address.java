package pl.devmentoring.dziedziczenie;

public class Address {
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    public Address(String street, String city, String state, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public void validate() {
        if (this.street == null || this.street.isEmpty() ||
                this.city == null || this.city.isEmpty() ||
                this.state == null || this.state.isEmpty() ||
                this.postalCode == null || this.postalCode.isEmpty() ||
                this.country == null || this.country.isEmpty()) {
            System.out.println("Arguments are not filled OK");
        } else {
            System.out.println("Arguments are filled OK");
        }
    }

    public void outputAsLabel() {
        System.out.println("street: " + this.street + " city: " + this.city + " state: " + this.state + " postal code: " + this.postalCode +
                " country: " + this.country);
    }
}
