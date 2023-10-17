public class Square extends Shape{
    private int a;

    Square(int a) {
        this.a = a;
    }
    @Override
    protected double getArea() {
        return Math.pow(a,2);
    }


    @Override
    protected double getPerimeter() {
        return (4 * a);
    }
}
