/*
Zadanie 3:

Napisz program, który za pomocą pętli wydrukuje tabelkę (od 1 do 10):

Miles Kilometers

1 1.609

2 3.218

...

9 14.481

10 16.090
 */
package Lab1;

public class zad3 {
    public static void main(String[] args) {
        double num = 1.609;

        double neww = 0;
        System.out.println("Miles Kilometers");
        for (int i = 1; i <= 10; ++i) {
            neww += num;
            System.out.printf("%d %.3f\n", i,neww);
            
        }
    }
}