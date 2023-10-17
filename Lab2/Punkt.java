/*
Zadanie 3. Stwórz klasę Punkt która reprezentować będzie punkt w przestrzeni x i y. Klasa Punkt ma posiadać:

· pola x i y

· konstruktor bezargumentowy tworzący punkt w koordynatach (0,0)

· konstruktor pozwalający stworzyć punkt o określonych koordynatach

· metodę pozwalającą na obliczenie odległości między tym punktem a innym punktem podanym jako x i y

· metodę pozwalającą na obliczenie odległości między tym punktem a innym punktem podanym jako obiekt typu Punkt

Stwórz dwie instancje klasy Punkt i zweryfikuj poprawność utworzonych metod
 */
    public class Punkt {

        private double x;
        private double y;
        
        // konstruktor bezargumentowy tworzący punkt w koordynatach (0,0)
        public Punkt() {
            this.x = 0;
            this.y = 0;
        }

        // konstruktor pozwalający stworzyc punkt o określonych koordynatach
        public Punkt(double x, double y) {
            this.x = x;
            this.y = y;
        } 

            // metoda pozwalająca na obliczenie odległości między tym punktem a innym punktem podanym jako obiekt typu Punkt
        public double obliczOdleglosc(double x2, double y2) {
            /*
             *  wykorzystujemy wzór na odległość między punktami, który możemy zapisać jako sqrt((x2 - x1)^2 + (y2 - y1)^2).
             */
            double odległość = Math.sqrt(Math.pow(this.x - x2, 2) + Math.pow(this.y - y2, 2));
            return odległość;
        }

        public double obliczOdleglosc(Punkt p) { //jako argument przyjmujemy obiekt typu Punkt, a następnie wykorzystujemy jego pola x i y.
            double odległość = Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
            return odległość;
        }

    
    
    public static void main(String[] args) {
        // tworzenie punkty w koordynatach (0,0)
        Punkt punkt1 = new Punkt();

        // tworzenie punkty w koordynatach (3,4)
        Punkt punkt2 = new Punkt(3,4);

        //obliczanie odległości między punktami
        double odległosc = punkt1.obliczOdleglosc(punkt2);
        System.out.println("Odleglosc miedzy punktem 1 a punktem 2: " + odległosc);

        //obliczanie odległości między punktami, podając współrzędne punkty 2
        odległosc = punkt1.obliczOdleglosc(3, 4);
        System.out.println("Odleglosc miedzy punktem 1 a punktem wspólrzednych (3, 4): " + odległosc);

    }
}

