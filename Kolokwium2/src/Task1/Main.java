package Task1;

public class Main {
    public static void main(String[] args) {
        Pojazd bwm = new Pojazd(4,"Biały", "wrrr");
        bwm.informacje();
        Samochod audi = new Samochod(4,"Czarny", "WRRRR", "Bardzo duzy silnik");
        audi.informacje();
        Rower rower = new Rower(2, "Czerwony", "skrr", "góral");
        rower.informacje();

        String arr[] = {bwm.kolor,audi.kolor,rower.kolor};
        for(String e : arr) {
            System.out.println(e);
        }
    }
}
