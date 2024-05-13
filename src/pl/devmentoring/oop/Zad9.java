package pl.devmentoring.oop;

public class Zad9 {
    // Stwórz klasę Multiplication z metodą execute, której zadaniem będzie obliczanie iloczynu wartości i
    // będzie dostosowana pod działanie na float-ach, int-ach i argumentach typu double. Wykorzystaj przeładowanie metody.
    public static void main(String[] args) {

        Multiplication multiplication = new Multiplication();

        double execute1 = multiplication.execute(2.0, 3.0);
        int execute2 = multiplication.execute(2, 5);
        double execute3 = multiplication.execute(22, 2.0);

        System.out.println(execute1);
        System.out.println(execute2);
        System.out.println(execute3);
    }
}
