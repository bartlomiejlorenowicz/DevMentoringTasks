package pl.devmentoring.zaawansowaneOOP;

public class CalculationSystem {
    private Calculator calculator;

    public CalculationSystem(Calculator calculator) {
        this.calculator = calculator;
    }

        public void performCalculations (int a, int b) {
            System.out.println("Subtraction: " + calculator.substract(a, b));
            System.out.println("Addition: " + calculator.add(a, b));
            System.out.println("Multiplication: " + calculator.multiply(a, b));
            System.out.println("Division: " + calculator.divide(a, b));
        }
    }

