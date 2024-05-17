package pl.devmentoring.zaawansowaneOOP;

import java.math.BigDecimal;
import java.util.Random;

public class Stock extends Securities {

    private Securities securities;
    private final BigDecimal TEN_PERCENT = new BigDecimal("0.10");

    public Stock(BigDecimal value, int id) {
        super(value, id);
    }

    @Override
    public void step() {
        Random random = new Random();
        boolean increase = random.nextBoolean();

        BigDecimal changeAmount = value().multiply(TEN_PERCENT);
        if (increase) {
            setValue(value().add(changeAmount));
            System.out.println("Stock with ID: " + id() + " increased by 10% new value: " + value());
        } else {
            setValue(value().subtract(changeAmount));
            System.out.println("Stock with ID: " + id() + " decreased by 10% new value: " + value());
        }
    }
}
