/*
Zadanie 2:Stwórz klasę Dog. Niech ma trzy pola: breed (rasa), agei color. Stwórz konstruktor.
Niech ma dwie metody: bark()i sleep(). Zademonstruj jak działa.
 */
public class Zad2 {
        public static void main (String[] args) {
            Dog obiekt = new Dog();
            obiekt.breed = "West";
            System.out.println(obiekt.breed);
            obiekt.agei = 15;
            System.out.println(obiekt.agei);
            obiekt.color = "Biały";
            System.out.println(obiekt.color);

            obiekt.sleep(1);
            obiekt.bark(2);

        }
}
