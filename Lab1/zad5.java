/*
Zadanie 5:

Napisz program, który pobiera od użytkownika wielkość tablicy, a następnie uzupełnia ją wpisywanymi przez użytkownika znakami.
Na koniec program wyświetla utworzona przez użytkownika tablicę
 */

package Lab1;

import java.util.Scanner;

class zad5 {
    public static void main(String[] args) {

        try (Scanner scanner= new Scanner(System.in)) {

        System.out.print("Give how big should be your array: ");
        int how_big_array = scanner.nextInt();
        char[] arr = new char[how_big_array];

            if(how_big_array <= 0) {
            System.out.println("Błąd");
            return;
        }
            for (int i = 0; i < how_big_array; i++) {
            arr[i] = scanner.next().charAt(0);
        }

            for (int i = 0; i < how_big_array; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    }
}