package Task1;

public class Samochod extends Pojazd {
    protected String rodzajSilnika;

    Samochod(int liczbKolWPojezdzie,String kolor,String sygnal,String rodzajSilnika) {
        super(liczbKolWPojezdzie,kolor,sygnal);
        this.rodzajSilnika = rodzajSilnika;
    }
    @Override
    protected void informacje() {
        System.out.println(liczbKolWPojezdzie + " " + kolor + " " + sygnal + " " + rodzajSilnika);
    }
}
