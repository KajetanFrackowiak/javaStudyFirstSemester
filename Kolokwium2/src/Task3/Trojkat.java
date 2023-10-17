package Task3;

public class Trojkat {
    private int a;
    private int h;

    public Trojkat() {
        this.a = 1;
        this.h = 2;
    }

    public Trojkat(int h) {
        this(); // wywołanie konstruktora bezargumentowego
        this.h = h;
    }

    public void obliczPole() {
        double pole = 0.5 * a * h;
        System.out.println("Pole trójkąta: " + pole);
    }
}

