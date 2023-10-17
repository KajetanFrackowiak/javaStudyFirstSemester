
/*
Zadanie 2. Stwórz klasę Kwadrat. Umieść w niej pole bok, a także metody do obliczania obwodu i pola. Dodaj konstruktor.

Stwórz instancję i wywołaj metody obiektu.
 */
public class Zadd3 {
    private int bok;

    public Zadd3(int naszBok) {
        this.bok = naszBok;
    }

    public int obliczPole() {
        return bok * bok;
    }

    public int obliczObwod() {
        return 4 * bok;
    }
    public static void main(String[] args) {
        Zadd3 kwadrat = new Zadd3(5);
        System.out.println("Bok: " + kwadrat.bok);
        System.out.println("Pole: " + kwadrat.obliczPole());
        System.out.println("Obwód: " + kwadrat.obliczObwod());
    }
}
//NIE MOŻNA NIGDY W JAVIE UMIEŚCIĆ 2 KLAS OSOBNO W JEDNYM PLIKU
//JEŻELI CHCEMY PARĘ KLAS W JEDNYM PLIKU MUSZĄ BYĆ ONE W JEDNEJ KLASIE (W JEDNEJ WIELKIEJ KLASIE PARĘ INNYCH KLAS)
//GŁÓWNA KLASA MUSI PRZYJMOWAC NAZWĘ PLIKU

