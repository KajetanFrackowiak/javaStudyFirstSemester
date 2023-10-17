package Task1;

public class Pojazd {
    protected int liczbKolWPojezdzie;
    protected String kolor;
    protected String sygnal;

    Pojazd(int liczbKolWPojezdzie,String kolor,String sygnal) {
        this.liczbKolWPojezdzie = liczbKolWPojezdzie;
        this.kolor = kolor;
        this.sygnal = sygnal;
    }

    protected void informacje() {
        System.out.println(liczbKolWPojezdzie + " " + kolor + " " + sygnal);
    }
}
