package Task4;

public class Produkt {
    protected String nazwa;
    protected double cena;
    protected int ilosc;
    protected Produkt(String nazwa, double cena, int ilosc) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
    }

    public String toString() {
        return nazwa + " | " + cena + " | " + ilosc;
    }

}
