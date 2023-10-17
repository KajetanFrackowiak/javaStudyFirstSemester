package Lab12.Task3;

public class Osoba implements Comparable<Osoba>{
    private final String imie;
    private final String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String toString() {
        return "Name: " + this.imie + " and Surname: " + this.nazwisko;
    }
    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public int compareTo(Osoba other) {
        return this.getNazwisko().compareTo(other.getNazwisko());
    }
}
