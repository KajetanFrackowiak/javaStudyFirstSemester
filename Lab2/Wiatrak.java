/*
Zadanie 5. Stwórz klasę Wiatrak. Klasa ma posiadać:

· trzy stałe o nazwie SLOW, MEDIUM i FAST o wartościach 1, 2 i 3 odpowiednio

· pole speed które przechowuje obecną prędkość wiatraka

· pole on które przechowuje stan wiatraka (włączony lub nie)

· pole radius które przechowuje promień wiatraka

· pole color które przechowuje kolor wiatraka

· konstruktor bezargumentowy który tworzy domyślny wiatrak

· konstruktor argumentowy

· metodę „informacje” która wyświetli w jednym Stringu wszystkie informacje o wiatraku
 */
//CLASS should be always named since big word
public class Wiatrak {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed; // pole które przechowuje obecną prędkość wiatraka
    private boolean on; // pole on które przechowuje stan wiatraka włączony czy nie
    private double radius; // pole radius które przechowuje promień wiatraka
    private String color; //· konstruktor bezargumentowy który tworzy domyślny wiatrak
    //the constructors should have the same name as the class name

    //konstruktor bezargumentowy który tworzy domyślny wiatrak
    public Wiatrak() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "white";
    }
    //konstruktor argumentowy
    public Wiatrak(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    //metoda która wyświetli wszystkie informacje o wiatraku
    public void informacje() {
        System.out.println("Current speed: " + speed);
        System.out.println("On state: " + on);
        System.out.println("Windmill radius: " + radius);
        System.out.println("Color: " + color);
    }
    public int getSpeed() { //getter allow access to the values of the fields
        return speed;
    }
    public void setSpeed(int speed) { //setter allow modification of their values
        this.speed = speed;
    }
    public boolean isOn() { //getter allow access to the values of the fields
        return on;
    }
    public void setOn(boolean on) { //setter allow modification of their values
        this.on = on;
    }
    public double getRadius() { //getter allow access to the values of the fields
        return radius;
    }
    public void setRadius(double radius) { //setter allow modification of their values
        this.radius = radius;
    }
    public String getColor() { //getter allow access to the values of the fields
        return color;
    }
    public void setColor(String color) { //setter allow modification of their values
        this.color = color;
    }

    //that is not should but I'd like to present:
    public static void main(String[] args) {
        Wiatrak wiatrak1 = new Wiatrak();
        wiatrak1.setSpeed(2);
        wiatrak1.setOn(true);
        wiatrak1.setRadius(10);
        wiatrak1.setColor("Green");
        System.out.println("Fan 1:\n");
        wiatrak1.informacje();

        Wiatrak wiatrak2 = new Wiatrak(3, true, 5, "red");
        System.out.println("\nFan 2:\n");
        wiatrak2.informacje();
    }
}
    /*
    These are getter and setter methods for the private fields (speed, on , radius and color) of the Wiatrak class.
    The getter allow access to the values of the fields, while setters allow modification of their values

    The following methods are getters:

    public int getSpeed()
    public boolean isOn()
    public double getRadius()
    public String getColor()

    The following methods are setters:

    public void setSpeed(int speed)
    public void setOn(boolean on)
    public void setRadius(double radius)
    public void setColor(String color)
     */




