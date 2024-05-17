package pl.devmentoring.zaawansowaneOOP;

public class Zad4 {

    // Stwórz interfejs Calculator, w którym umieścisz sygnaturę metod:
    //-	int substract(int a, int b)
    //-	int add(int a, int b)
    //-	int multiply(int a, int b)
    //-	double divide(int a, int b).
    //Utwórz następnie klasę CalculationSystem, która będzie przyjmowała do konstruktora obiekt powyższej klasy - przekaż
    // do niej anonimową implementację interfejsu z odpowiednio zdefiniowanymi metodami.
    //
    //CalculationSystem będzie posiadała metodę performCalculations(...)  która wywoła i wyświetli wszystkie operacje Calulator-a.
    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public int substract(int a, int b) {
                return a - b;
            }

            @Override
            public int add(int a, int b) {
                return a + b;
            }

            @Override
            public int multiply(int a, int b) {
                return a * b;
            }

            @Override
            public double divide(int a, int b) {
                if (b == 0) {
                    throw new IllegalArgumentException("You can not divide byu zero!");
                }
                return (double) a / b;
            }
        };

        CalculationSystem calculationSystem = new CalculationSystem(calculator);
        calculationSystem.performCalculations(8, 4);
    }
}
