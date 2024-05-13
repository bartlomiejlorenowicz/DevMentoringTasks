package pl.devmentoring.tablice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad13 {
    // Napisz program, który będzie pobierał od użytkownika dowolne wyrazy, dopóki nie wprowadzi on słowa “STOP”.
    // Po podaniu każdego ze słów, ma być ono umieszczane w obiekcie typu ArrayList.
    // Po tak przeprowadzonym procesie umieszczania kolejnych elementów, program ma wyświetlać długość utworzonej list wraz z informacją,
    // jaki jest jej pierwszy, ostatni i środkowy element.

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String word;
        do {
            System.out.println("Enter a word:");
            word = scanner.nextLine();
            if ("STOP".equalsIgnoreCase(word)) {
                break;
            }
            strings.add(word);
        } while (!"STOP".equalsIgnoreCase(word));
        scanner.close();

        System.out.println(strings);

        System.out.println("size of list: "  + strings.size());
        System.out.println("first element in list: " + strings.get(0));
        System.out.println("last element in list: " + strings.get(strings.size() - 1));
        System.out.println("middle element in list: " + strings.get(strings.size() / 2));
    }
}
