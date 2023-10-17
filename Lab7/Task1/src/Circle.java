public class Circle extends Shape{
    private int r;
    Circle(int r) {
        this.r = r;
    }
    @Override
    protected double getArea() {
        return Math.PI * Math.pow(r,2);
    }

    @Override
    protected double getPerimeter() {
        return 2 * Math.PI * r;
    }
}
