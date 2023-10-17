/*
Zadanie 6.

Napisz program, który pobiera od użytkownika wielkość tablicy, wartość pierwszego elementu (int),
a następnie uzupełnia pozostałe elementy tablicy kolejnymi liczbami
parzystymi większymi od zadanego pierwszego elementu Np. 5,1 -> [1,2,4,6,8].

Następnie :

a.Napisz metodę która zwraca najmniejszy element tablicy

b.Napisz metodę która zwraca największy element tablicy

c.Napisz metodę, która zwraca sumę wszystkich elementów w tablicy

d.Napisz metodę, która zwraca wartość średnią dla elementów tablicy

e.Napisz metodę, która zwraca medianę dla przekazanej tablicy

f.Wykorzystaj napisane w punktach a-e metody i wyświetl na koniec statystyki dotyczące utworzonej tablicy w formie :

Min: [liczba]

Max:[liczba]

Suma: [liczba]

Średnia: [liczba typu zmiennoprzecinkowego]

Mediana : [liczba typu zmiennoprzecinkowego]
 */

package Lab1;

import java.util.Arrays;
import java.util.Scanner;
public class zad6 {

    public static int findMinimum (int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMaximum (int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int calculateSum (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double calculateAverage (int[] array) {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        return average / array.length;
    }

    public static double calculateMedium (int[] array) {
        Arrays.sort(array);

        int middle = array.length / 2;
        if (array.length % 2 == 0) {
            return (array[middle-1] + array[middle]) / 2.0;
        }
        else {
            return array[middle];
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Podaj wielkość tablicy: ");
            int size = scanner.nextInt();

            System.out.print("Podaj pierwszy element: ");
            int firstElement = scanner.nextInt();

            int[] array = new int[size];
            array[0] = firstElement;

            for (int i = 1; i < size; i++) {
                array[i] = array[i-1] + 2;
            }

            System.out.println("Tablica: " + Arrays.toString(array));

            System.out.println("Min: " + findMinimum(array));
            System.out.println("Max " + findMaximum(array));
            System.out.println("Suma: " + calculateSum(array));
            System.out.println("Średnia: " + calculateAverage(array));
            System.out.println("Mediana: " + calculateMedium(array));
        }

    }


}
/*
pobiera od użytkownika wielkość tablicy oraz pierwszy element, a następnie uzupełnia pozostałe elementy tablicy kolejnymi
liczbami parzystymi większymi od zadanego pierwszego elementu:
Wyjaśnienie:

    Program prosi użytkownika o podanie wielkości tablicy i pierwszego elementu.
    Następnie tworzy tablicę o podanej wielkości i wypełnia ją kolejnymi liczbami parzystymi większymi od pierwszego elementu.
    Program wyświetla tablicę oraz wyniki dla każdej z pięciu wymaganych metod.
    Metoda findMinimum przechodzi przez całą tablicę i zwraca najmniejszy element.
    Metoda findMaximum przechodzi przez całą tablicę i zwraca największy element.
    Metoda calculateSum przechodzi przez całą tablicę i zwraca sumę elementów.
    ...
 */