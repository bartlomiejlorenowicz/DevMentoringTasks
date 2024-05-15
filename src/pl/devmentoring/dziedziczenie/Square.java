package pl.devmentoring.dziedziczenie;

public class Square extends Shape {

    double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double figureArea() {
        System.out.print("Square area: ");
        return Math.pow(length, 2);
    }
}
