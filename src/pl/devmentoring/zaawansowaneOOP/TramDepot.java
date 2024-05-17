package pl.devmentoring.zaawansowaneOOP;

import java.util.List;

public class TramDepot extends Depot {
    public TramDepot(String name) {
        super(name);
    }

    @Override
    public String getInfo() {
        return "tram depot";
    }
}
