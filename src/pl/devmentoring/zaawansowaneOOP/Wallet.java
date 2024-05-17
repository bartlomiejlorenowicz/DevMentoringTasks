package pl.devmentoring.zaawansowaneOOP;

import java.math.BigDecimal;
import java.util.List;

public class Wallet {
    private List<Securities> securities;

    public Wallet(List<Securities> securities) {
        this.securities = securities;
    }

    public void step() {
        for (Securities security : securities) {
            security.step();
        }
    }

    public BigDecimal getTotalValue() {
        BigDecimal totalValue = BigDecimal.ZERO;
        for (Securities securitie : securities) {
            totalValue = totalValue.add(securitie.value());
        }
        return totalValue;
    }
}