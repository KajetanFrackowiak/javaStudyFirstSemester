package Task3;

import java.util.Scanner;
/*
Zadanie 3. Symulator rzutu monetą. Zdefiniuj klasy Moneta oraz Symulacja. W klasie Symulacja utwórz metodę symulującą, w której program odpyta użytkownika o ilość prób i wygeneruje wskazaną liczbę symulacji wyświetlając
na koniec procentową szansę na uzyskanie wyniku orzeł i reszka np. 23% orzeł | 77% reszka dla 20 rzutów
 */

public class Symulacja {
    private Moneta moneta = new Moneta();

    public void simulate() {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter the number of attempts: ");
            int numberAttepts = scanner.nextInt();

            int numberOfHeads = 0;
            for (int i = 0; i < numberAttepts; i++) {
                String rollResult = moneta.toss();
                if (rollResult.equals("heads")) {
                    numberOfHeads++;
                }
                System.out.println(rollResult);
            }

            double percentHeads = (double) numberOfHeads / numberAttepts * 100;
            double percentTails = 100 - percentHeads;

            System.out.printf("%.0f%% heads | %.0f%% tails", percentHeads, percentTails);
        }
    }
}

/*
 * public class Symulacja {
 * 
 * // utworzenie obiektu klasy Moneta, który będzie wykorzystywany w tej klasie
 * private Moneta moneta = new Moneta();
 * 
 * public void simulate() {
 * Scanner scanner = new Scanner(System.in);
 * 
 * // pobranie od użytkownika liczby prób
 * System.out.println("Enter the number of attempts: ");
 * int numberAttepts = scanner.nextInt();
 * 
 * // zmienna, która będzie przechowywała liczbę wyników "orzeł"
 * int numberOfHeads = 0;
 * 
 * // pętla, która wykonuje tyle prób, ile podał użytkownik
 * for (int i = 0; i < numberAttepts; i++) {
 * // wywołanie metody toss() z obiektu Moneta, która symuluje rzut monetą i
 * zwraca wynik ("orzeł" lub "reszka")
 * String rollResult = moneta.toss();
 * // jeśli wynik to "orzeł", to zwiększamy wartość zmiennej numberOfHeads o 1
 * if (rollResult.equals("heads")) {
 * numberOfHeads++;
 * }
 * // wyświetlenie wyniku rzutu monetą
 * System.out.println(rollResult);
 * }
 * 
 * // obliczenie procentowej szansy na wypadnięcie "orła" i "reszki" oraz ich
 * wyświetlenie
 * double percentHeads = (double) numberOfHeads / numberAttepts * 100;
 * double percentTails = 100 - percentHeads;
 * 
 * System.out.printf("%.0f%% heads | %.0f%% tails", percentHeads, percentTails);
 * }
 * }
 */
