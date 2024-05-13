package pl.devmentoring.tablice;

public class Zad11 {
    // Z podanej tablicy:
    // Wyświetl tylko te podtablice składowe, które nie mają w sobie wartości “Unknown”. Wykorzystaj metodę .contains().
    public static void main(String[] args) {

        String[][] names2D = {
                {"John", "Jasper"},
                {"Casper", "Jonathan"},
                {"Unknown", "Unknown"},
                {"Alice", "Bob"},
                {"Stanley", "Unknown"}};

        printArrayWithoutUnknown(names2D);

    }
    static void printArrayWithoutUnknown(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int rowLength = arr[i].length;
            boolean containsUnknown = false;
            for (int j = 0; j < rowLength; j++) {
                if (arr[i][j].contains("Unknown")) {
                    containsUnknown = true;
                    break;
                }
            }
            if (!containsUnknown) {
                for (int j = 0; j < rowLength; j++) {
                    System.out.println(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
