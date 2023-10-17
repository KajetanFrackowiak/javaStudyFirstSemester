/*
Zadanie 4. Stwórz klasę MyCircle. Klasa ma posiadać:

· pole radius, które będzie przechowywać promień

· konstruktor który w argumencie przyjmuje promień

· metodę która oblicza obwód koła

· metodę która oblicza pole koła

· metodę która zwraca średnicę koła

Żeby uzyskać PI można użyć Math.PI.
 */

import java.util.Scanner;

class MyCirle {
    public MyCirle(double r) {
    }

    public static double calculateCircuit(double r) { // oblicza obwód koła
        return Math.PI * r * 2; // 3.14 * promien * 2
    }

    public static double calculateArea(double r) { // oblicza pole koła
        return Math.PI * Math.pow(r, 2); // 3.14 ** 2
    }

    public static double calculateDiameter(double r) {
        return r * 2;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Give a number and I will show you Circuit, Field and Diameter of this Circle: ");
            double r = scanner.nextDouble();

            System.out.println("Obwód koła: " + calculateCircuit(r));
            System.out.println("Pole koła: " + calculateArea(r));
            System.out.println("Średnica koła: " + calculateDiameter(r));
        }
    }
}
