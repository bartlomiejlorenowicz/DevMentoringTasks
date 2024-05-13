package pl.devmentoring.tablice;

import java.util.Arrays;

public class Zad10 {
    // Napisz program w którym będzie tablica dwuwymiarowa o rozmiarach: 10 rzędów i 3 kolumny.
    // Do elementów zerowej kolumny załaduj kolejne liczby naturalne(i), do elementów następnej kolumny
    // załaduj ich kwadraty(i*i), a do następnej sześciany (i*i*i).
    //Wypisz zawartość tej tablicy na ekranie – właśnie w postaci trzech pionowych kolumn.

    public static void main(String[] args) {
        int[][] generateTwoDimensionArray = generateTwoDimensionArray();
        printArrayInColumns(generateTwoDimensionArray);
    }

    static int[][] generateTwoDimensionArray() {
        int[][] arr = new int[10][3];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = i;
            arr[i][1] = i * i;
            arr[i][2] = i * i * i;
        }
        return arr;
    }
    static void printArrayInColumns(int[][] array) {
        System.out.println("Number | Square | Cube");
        for (int i = 0; i < array.length; i++) {
            System.out.format("%7d | %6d | %4d%n", array[i][0], array[i][1], array[i][2]);
        }
    }
}
