/*
Zadanie 1:Stwórz metodę statycznącompare, niech przyjmuje jako argumenty dwie liczby całkowite.Niech metoda zwróci:
•1 –jeśli druga z nich jest większa•
0 –jeśli są równe•
-1 –jeśli pierwsza z nich jest większa
 */
public class Zad1 {
    static int compare(int a, int b) {
        if (a < b) {
            return 1;

        } else if (a == b) {
            return 0;

        } else  {
            return -1;
        }
    }
}
