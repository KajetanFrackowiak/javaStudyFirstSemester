package Lab12.Task1;

public class Describe {
    public static void main(String[] args) {
        System.out.println(
                "Różnic pomiędzy Comparable a Comparator jest wiele, są nimi między innymi:\n" +
                        "Comparable wpływa na oryginalną klasę czyli rzeczywista klasa jest modyfikowana.\n" +
                        "Comparable udostępnia metodę compareTo() którą używaliśmy np na ostatnich labach i jest to metoda do sortowania elementów przez porównywanie(jest to chyba funkcja boolowska)" +
                        "Comparable znajduje się w pakecie java.lang a Comparator znajduje się w pakiecie java.util" +
                        "Możemy sortować elementy listy typu Comparable za pomocą metody Collections.sort(list)." +
                        "Możemy sortować elementy listy typu Comparator (tej drugiej) za pomocą innej metody Collections.sort(list, Comparator)"
        );
    }
}
