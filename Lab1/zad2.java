/*
Zadanie 2:

Napisz program, który przekonwertuje podane przez użytkownika stopnie Celsjusza na Fahrenheity według wzoru:

fahrenheit = (9 / 5) * celsius + 32

43 stopnie Celsjusza to 109,4 F.
 */

package Lab1;

import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        double fahrenheit;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj liczbę: ");
            int celcius = scanner.nextInt();
            fahrenheit = (9.0 / 5) * celcius + 32;
        }

        System.out.println(fahrenheit);
    }
}