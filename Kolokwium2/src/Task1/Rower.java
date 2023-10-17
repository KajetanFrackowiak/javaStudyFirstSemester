package Task1;

public class Rower extends Pojazd {
    protected String rodzajRoweru;

    Rower(int liczbKolWPojezdzie, String kolor, String sygnal, String rodzajRoweru) {
        super(liczbKolWPojezdzie, kolor, sygnal);
        this.rodzajRoweru = rodzajRoweru;
    }

    @Override
    protected void informacje() {
        System.out.println(liczbKolWPojezdzie + " " + kolor + " " + sygnal + " " + rodzajRoweru);
    }
}
