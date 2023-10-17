package Task2;
/*
Zadanie 2. Generowanie i wyświetlenie talii Kart. Utwórz klasę Karta z polami typu enum Kolor i Figura. Zdefiniuj oba enumy w osobnych plikach .java.
Niech Kolor przyjmuje wartości KIER, KARO, TREFL, PIK, a Figura wartości 2,3,4..,Walet,Dama,Król,As.
Nadpisz metodę .toString() klasy Karta, tak aby drukowala opis karty np. ‘As Kier’, możesz też użyć znaków ascii (♤ ♡ ♢ ♧) jako ikon.
Na koniec wygeneruj całą talie (przydatne enum.values) i wyświetl ją na ekranie.
 */
public class Karta {
    public static void main(String[] args) {

        Kolor spare = Kolor.SPARE;
        System.out.println(spare.getSymbol());
    }
}
