package Lab10.Task5And6;

public class Trapezium implements Figura, Comparable<Trapezium> {
    private final float a1;
    private final float b1;
    private final float a2;
    private final float b2;
    private final float h;

    Trapezium(float a1, float b1, float a2, float b2, float h) {
        this.a1 = a1;
        this.b1 = b1;
        this.a2 = a2;
        this.b2 = b2;
        this.h = h;
    }

    @Override
    public float obliczPole() {
        return ((a1 + b1) * h) / 2;
    }

    @Override
    public float obliczObwod() {
        return a1 + b1 + a2 + b2;
    }

    @Override
    public int compareTo(Trapezium other) {
        float thisArea = this.obliczPole();
        float otherArea = other.obliczPole();

        return Float.compare(thisArea, otherArea);
    }
}
