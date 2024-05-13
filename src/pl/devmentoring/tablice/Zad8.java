package pl.devmentoring.tablice;

public class Zad8 {
    // Mając do dyspozycji następujące tablice (wśród nich znajduje się również dwuwymiarowa):
    // Napisz program, który policzy, ile znajduje się liczb trzycyfrowych w każdej z nich.

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 100, 50, 2000};
        int[][] numbers2D = {{100, 20}, {500, 1000}, {300, 200}, {1000, 50000}};

        System.out.println(countHundredsInArray(numbers));

        System.out.println(countHundredsInTwoDimensionArray(numbers2D));

    }
    static int countHundredsInArray(int[] arr) {
        if (arr == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 99 && arr[i] < 1000) {
                count++;
            }
        }
        return count;
    }

    static int countHundredsInTwoDimensionArray(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int rowLength = arr[i].length;
            for (int j = 0; j < rowLength; j++) {
                if (arr[i][j] > 99 && arr[i][j] < 1000) {
                    count++;
                }
            }
        }
        return count;
    }
}
