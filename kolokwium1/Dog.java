/*
Zadanie 2:Stwórz klasę Dog. Niech ma trzy pola: breed (rasa), agei color. Stwórz konstruktor.
Niech ma dwie metody: bark()i sleep(). Zademonstruj jak działa.
 */

public class Dog {
    String breed;
    int agei;
    String color;

    Dog() {
        System.out.println("Witam");
    }

    public void sleep(int a) {
        if (a == 1) {
            System.out.println("Pies śpi");
        } else {
            System.out.println("Pies nie śpi");
        }
    }
    public void bark(int a) {
        if (a == 1) {
            System.out.println("Bark to kora");
        } else {
            System.out.println("Bark to nie kora");
        }
    }




}
