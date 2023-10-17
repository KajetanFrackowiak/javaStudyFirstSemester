
/*
* Zadanie 1. Napisz metodę, która przyjmuje 2 tablice 1wym. o tej samej długości i
* zwraca nową tablicę stanowiącą sumę przekazanych tablic.
* W sytuacji gdy długości tablic się różnią metoda powinna zwrócić pustą tablicę.

Przykład: [1,2,3], [4,5,6] -> [5,7,9] */

import java.util.Scanner;

public class Zadd1 {

    public static int[] sumArrays(int[] arr1, int[] arr2) {
        try (Scanner scanner = new Scanner(System.in)) {

            if (arr1.length != arr2.length) {
                return new int[0];
            } else {
                for (int i = 0; i < arr1.length; i++) {
                    System.out.print("Podaj do pierwszej tablicy " + (i + 1) + " liczbę: ");
                    arr1[i] += scanner.nextInt();
                }

                for (int i = 0; i < arr2.length; i++) {
                    System.out.print("Podaj do drugiej tablicy " + (i + 1) + " liczbę: ");
                    arr2[i] += scanner.nextInt();
                }
                int[] arr3 = new int[arr1.length];
                for (int i = 0; i < arr1.length; i++) {
                    arr3[i] += arr1[i] + arr2[i];
                    System.out.println(arr3[i]);
                }
                return arr3;

            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num1;
            int num2;

            System.out.println("Podaj liczbę jak wielka ma byc tablica numer 1: ");
            num1 = scanner.nextInt();

            System.out.println("Podaj jak wielka ma być tablica numer 2: ");
            num2 = scanner.nextInt();

            int[] arr1 = new int[num1];
            int[] arr2 = new int[num2];

            System.out.println(sumArrays(arr1, arr2));
        }
    }
}
