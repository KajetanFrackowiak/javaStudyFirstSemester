/*
Zadanie 7.

Napisz metodę, która zwraca największy wspólny dzielnik dla przekazanych dwóch liczb typu int.
 */

package Lab1;

import java.util.Scanner;
public class zad7 {


    public static int findGCD(int firstNum, int twiceNum) { //Metoda Euklidesa
        while (twiceNum != 0 ) {
            int temp = twiceNum;
            twiceNum = firstNum % twiceNum;
            firstNum = temp;
        }
        return firstNum;
    }
    /*
    np firstNum = 24, twiceNum = 12
    while ( 12 != 0) {
        int temp = 12;
        twiceNum = 24 % 12; = 0
        firstNum = 12
    while ( 0 != 0)
     */

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Podaj pierwszą liczbę: ");
            int firstNum = scanner.nextInt();

            System.out.print("Podaj drugą liczbę: ");
            int twiceNum = scanner.nextInt();

            System.out.println("Największy wspólny dzielnik liczb " + firstNum + " oraz " + twiceNum + " = " + findGCD(firstNum,twiceNum));
        }
    }
}
