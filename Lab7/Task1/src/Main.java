public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2,4);
        Square square = new Square(5);
        Circle circle = new Circle(6);
        Triangle triangle = new Triangle(7,5,10,10);

        Shape[] shapes = {rectangle, square, circle, triangle};
        for (Shape e : shapes) {
            System.out.println(e.getArea());
            System.out.println(e.getPerimeter());
        }
    }
}