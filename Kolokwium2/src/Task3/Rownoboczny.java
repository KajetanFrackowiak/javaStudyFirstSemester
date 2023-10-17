package Task3;

public class Rownoboczny extends Trojkat {
    private double bok;

    public Rownoboczny(double bok) {
        this.bok = bok;
    }

    @Override
    public void obliczPole() {
        double pole = (Math.sqrt(3) / 4) * bok * bok;
        System.out.println("Pole trójkąta równobocznego: " + pole);
    }
}

