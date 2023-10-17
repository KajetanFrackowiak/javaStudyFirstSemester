public class Triangle extends Shape{
    private int a;
    private int b;
    private int c;
    private int h;

    Triangle(int a,int b, int c, int h) {
        if (a+b > c && a + c > b && b + c > a) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.h = h;
        } else {
            System.out.println("Such triangle doesn't exist");
        }
    }
    @Override
    protected double getArea() {
        return ((double) (a + b + c) / 2);
    }

    @Override
    protected double getPerimeter() {
        return (double) (a * h) / 2;
    }
}
