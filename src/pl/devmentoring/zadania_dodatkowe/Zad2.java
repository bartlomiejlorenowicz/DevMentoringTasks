package pl.devmentoring.zadania_dodatkowe;

import java.util.Arrays;

public class Zad2 {
    //  The objective is to return all pairs of integers from a given array of integers that have a difference of 2.
    //The result array should be sorted in ascending order of values.
    //Assume there are no duplicate integers in the array. The order of the integers in the input array should not matter.
    //Examples
    //[1, 2, 3, 4]  should return [[1, 3], [2, 4]]
    //
    //[4, 1, 2, 3]  should also return [[1, 3], [2, 4]]
    //
    //[1, 23, 3, 4, 7] should return [[1, 3]]
    //
    //[4, 3, 1, 5, 6] should return [[1, 3], [3, 5], [4, 6]]
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 1, 2, 3};
        int[] arr3 = {1, 23, 3, 4, 7};
        int[] arr4 = {4, 3, 1, 5, 6};

        System.out.println(Arrays.deepToString(returnPairsOfIntegers(arr4)));

    }

    public static int[][] returnPairsOfIntegers(int[] arr) {

        // zliczenie ilosci wierszy, dla tablicy dwuwymiarowej
        int countRows = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] == 2) {
                    countRows++;
                }
            }
        }
        // utworzenie tablicy dwuwymiarowej
        int[][] newArr = new int[countRows][2];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] == 2) {
                    newArr[index][0] = arr[i];
                    newArr[index][1] = arr[j];
                    index++;
                }
            }
        }
        return newArr;
    }
}
