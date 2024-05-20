package pl.devmentoring.zadania_dodatkowe;

import java.util.HashMap;
import java.util.Map;

public class Zad5 {
    // Given a string of words, you need to find the highest scoring word.
    //Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
    //For example, the score of abad is 8 (1 + 2 + 1 + 4).
    //You need to return the highest scoring word as a string.
    //If two words score the same, return the word that appears earliest in the original string
    //All letters will be lowercase and all inputs will be valid.
    public static void main(String[] args) {

    }
    public static String high(String s) {
        String[] words = s.split(" ");
        Map<Character, Integer> newMap = generateMap();
        String topScore = "";
        int highestScore = 0;
        for (String word : words) {
            int currentScore = 0;
            for (char c : word.toCharArray()) {
                currentScore += newMap.get(c);
            }
            if (currentScore > highestScore) {
                highestScore = currentScore;
                topScore = word;
            }
        }
        return topScore;
    }

    public static Map<Character, Integer> generateMap() {
        Map<Character, Integer> lettersSet = new HashMap<>();
        int number = 1;
        for (char letter = 'a'; letter <= 'z'; letter++) {
            lettersSet.put(letter, number);
            number++;
        }
        return lettersSet;
    }
}
