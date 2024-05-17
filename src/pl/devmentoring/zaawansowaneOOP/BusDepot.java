package pl.devmentoring.zaawansowaneOOP;


public class BusDepot extends Depot {
    public BusDepot(String name) {
        super(name);
    }

    @Override
    public String getInfo() {
        return "bus depot";
    }
}
