public class Rectangle extends Shape{
    private int a;
    private int b;
    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    protected double getArea() {
        return (a * b);
    }
    @Override
    protected double getPerimeter() {
        return (2 * (a+b));
    }
}
