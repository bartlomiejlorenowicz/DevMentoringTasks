package pl.devmentoring.zadania_dodatkowe;

import java.util.HashMap;
import java.util.Map;

public class Zad4 {
    // Given a lowercase string that has alphabetic characters only and no spaces, return the highest value of consonant substrings.
    // Consonants are any letters of the alphabet except "aeiou".
    //We shall assign the following values: a = 1, b = 2, c = 3, .... z = 26.
    //For example, for the word "zodiacs", let's cross out the vowels. We get: "z o d ia cs"
    //-- The consonant substrings are: "z", "d" and "cs" and the values are z = 26, d = 4 and cs = 3 + 19 = 22. The highest is 26.
    //solve("zodiacs") = 26
    //
    //For the word "strength", solve("strength") = 57
    //-- The consonant substrings are: "str" and "ngth" with values "str" = 19 + 20 + 18 = 57 and "ngth" = 14 + 7 + 20 + 8 = 49. The highest is 57.
    public static void main(String[] args) {

        Map<Character, Integer> characterIntegerMap = generateAlphabet();
        System.out.println(characterIntegerMap);
        int solve = solve("strength");
        System.out.println(solve);

    }

    static Map<Character, Integer> generateAlphabet() {
        Map<Character, Integer> alphabetSet = new HashMap<>();
        int number = 1;
        for (char letter = 'a'; letter <= 'z'; letter++) {
            alphabetSet.put(letter, number);
            number++;
        }
        return alphabetSet;
    }

    static int solve(String str) {
        Map<Character, Integer> integerMap = generateAlphabet();
        char[] chars = str.toCharArray();
        int result = 0;
        int sum = 0;
        for (char c : chars) {
            if (isVowel(c)) {
                result = Math.max(result, sum);
                sum = 0;
            } else {
                sum += integerMap.get(c);
            }
        }
        return result;
    }

    static boolean isVowel(char a) {
        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u';
    }


//    static int solve(String str) {
//        char[] chars = str.toCharArray();
//        Map<Character, Integer> characterMap = generateAlphabet();
//        int sum = 0;
//        int result = 0;
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
//                if (sum > result) {
//                    result = sum;
//                }
//                sum = 0;
//            }
//            else if (characterMap.containsKey(chars[i])) {
//                sum += characterMap.get(chars[i]);
//            }
//        }
//        return Math.max(sum, result);
//    }
}

