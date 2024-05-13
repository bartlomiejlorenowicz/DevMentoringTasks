package pl.devmentoring.instrukcjesterujace;

import java.util.HashMap;
import java.util.Map;

public class ZodiacMenu {
    Map<String, String> zodiacDescribes = new HashMap<>();

    public ZodiacMenu() {
        zodiacDescribes.put("Aquarius", "20 Jan and 18 Feb");
        zodiacDescribes.put("Pisces", "19 Feb and 19 Mar");
        zodiacDescribes.put("Aries", "21 Mar and 19 Apr");
        zodiacDescribes.put("Taurus", "20 Apr and 22 May");
        zodiacDescribes.put("Gemini", "21 May and 21 Jun");
        zodiacDescribes.put("Cancer", "22 Jun and 22 Jul");
        zodiacDescribes.put("Leo", "23 Jul and 22 Aug");
        zodiacDescribes.put("Virgo", "23 Aug and 22 Sep");
        zodiacDescribes.put("Libra", "23 Sep and 23 Oct");
        zodiacDescribes.put("Scorpio", "24 Oct and 22 Nov");
        zodiacDescribes.put("Sagittarius", "23 Nov and 21 Dec");
        zodiacDescribes.put("Capricorn", "22 Dec and 19 Jan");
    }

    public void displayZodiacSigns(String zodiacSign) {
        if (zodiacDescribes.containsKey(zodiacSign)) {
            System.out.println(zodiacSign + " : " + zodiacDescribes.get(zodiacSign));
        } else {
            System.out.println("Invalid Zodiac sign. Please make sure you type it correctly.");
        }
    }

    public void displayMenu() {
        System.out.println("Choose your Zodiac sign:");
        zodiacDescribes.keySet().forEach(sign -> {
            System.out.print(sign + " ");
        });
        System.out.println();
    }
}
