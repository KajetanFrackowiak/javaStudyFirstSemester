package Lab10.Task5And6;

public class Triangle implements Figura, Comparable<Triangle> {
    private final float a;
    private final float b;
    private final float c;

    Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public float obliczObwod() {
        return a + b + c;
    }

    @Override
    public float obliczPole() {
        double s = 0.5 * (a + b + c);
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    public int compareTo(Triangle other) {
        float thisArea = this.obliczPole();
        float otherArea = other.obliczPole();

        return Float.compare(thisArea, otherArea);
    }
}
