package pl.devmentoring.konstruktory;

public class Card {
    private String value;
    private String figure;

    public Card(String value, String figure) {
        this.value = value;
        this.figure = figure;
    }

    public String value() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String figure() {
        return figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value='" + value + '\'' +
                ", figure='" + figure + '\'' +
                '}';
    }
}
