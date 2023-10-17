package Task3;

import java.util.HashMap;
import java.util.Map;

public class WordsSpeeching {
    public static void main(String[] args) {
        String tekst = "Ala na kota, kot ma Alę, a ja chciałbym mieć psa a nie kota";
        Map<String, Integer> wystapienia = zliczWystapienia(tekst);
        wyswietlWystapienia(wystapienia);
    }

    public static Map<String, Integer> zliczWystapienia(String tekst) {
        Map<String, Integer> wystapienia = new HashMap<>();

        // Usuniecie znakow interpunkcyjnych i zmiana na male litery
        tekst = tekst.replaceAll("[^a-zA-ZąćęłńóśźżĄĆĘŁŃÓŚŹŻ ]", "").toLowerCase();

        // Podzial tekstu na slowa
        String[] slowa = tekst.split("\\s+");

        // Zliczenie wystapien slow
        for (String slowo : slowa) {
            if (wystapienia.containsKey(slowo)) {
                int ilosc = wystapienia.get(slowo);
                wystapienia.put(slowo, ilosc + 1);
            } else {
                wystapienia.put(slowo, 1);
            }
        }
        return wystapienia;
    }

    public static void wyswietlWystapienia(Map<String, Integer> wystapienia) {
        for (Map.Entry<String, Integer> entry : wystapienia.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
