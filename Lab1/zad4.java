/*
 
Zadanie 4:

Napisz program, który pobierze od użytkownika liczbę od 1 do 7 i wypisze, który to dzień tygodnia. Poniedziałek to 1, niedziela to 7.
 */
package Lab1;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Podaj dzień tygodnia: ");
            int day = scanner.nextInt();
            switch (day) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("ERROR");
            }
        }
    }
}
