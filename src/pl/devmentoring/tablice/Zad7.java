package pl.devmentoring.tablice;

public class Zad7 {
    // Który sposób na iterowanie po tablicy jest “bezpieczniejszy” i efektywniejszy?
    public static void main(String[] args) {
        int[] values = {100, 200, 300, 400, 500, 600};

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(values[i]);
        }
    }

    // Sposób pierwszy jest bezpieczniejszy i efektywniejszy ponieważ używa length do określenia warunku zakończenia, nie musimy się martwić,
    // że przekroczymy zakres tablicy i wystąpi wyjątek ArrayIndexOutOfBoundException, oraz gdy długość tablicy ulegnie zmianie zastosowanie
    // pierwszego przykładu jest bezpieczniejsze i elastyczne, ponieważ automaycznie dostosowuje się do rozmiaru tablicy.
    //Sposób drugi jest mniej bezpieczny, ponieważ zakłada, że tablica zawsze będzie miała rozmiar 6, jeśli tablica będzie miała mniej
    // elementów wystąpi wyjątek ArrayIndexOutOfBoundException, lub gdy tablica będzie miała rozmiar większy od 6, nastąpi utrata danych.

}
