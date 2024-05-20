package pl.devmentoring.zadania_dodatkowe;

import java.util.Arrays;

public class Zad3 {
    // Write a function that when given a number >= 0, returns an Array of ascending length subarrays.

    //pyramid(0) => [ ]
    //pyramid(1) => [ [1] ]
    //pyramid(2) => [ [1], [1, 1] ]
    //pyramid(3) => [ [1], [1, 1], [1, 1, 1] ]

    // Note: the subarrays should be filled with 1s (edited)

    public static void main(String[] args) {
        int[][] pyramid = pyramid(3);
        System.out.println(Arrays.deepToString(pyramid));
    }

    static int[][] pyramid(int number) {

        int[][] arr = new int[number][];
        for (int i = 0; i < number; i++) {
                arr[i] = new int[i + 1];
                Arrays.fill(arr[i], 1);
        }
        return arr;
    }
}


