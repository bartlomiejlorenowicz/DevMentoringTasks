package pl.devmentoring.zaawansowaneOOP;

import java.math.BigDecimal;

public abstract class Securities {
    private BigDecimal value;
    private int id;

    public Securities(BigDecimal value, int id) {
        this.value = value;
        this.id = id;
    }

    public abstract void step();

    public BigDecimal value() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
