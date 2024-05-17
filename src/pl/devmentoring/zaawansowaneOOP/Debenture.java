package pl.devmentoring.zaawansowaneOOP;

import java.math.BigDecimal;

public class Debenture extends Securities {
    private BigDecimal interest;

    public Debenture(BigDecimal value, int id, BigDecimal interest) {
        super(value, id);
        this.interest = interest;
    }

    @Override
    public void step() {
        BigDecimal interestVal = value().multiply(interest);
        setValue(value().add(interestVal).setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println("Debenture with ID: " + id() + " has new value: "  + value());
    }

    public BigDecimal interest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }
}
