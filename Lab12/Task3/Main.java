import Lab12.Task3.Osoba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Osoba> osoby = new ArrayList<>();
        Osoba osoba = new Osoba("Kajetan", "Frackowiak");
        osoby.add(osoba);

        Osoba osoba1 = new Osoba("Adam", "Adamski");
        osoby.add(osoba1);

        Osoba osoba2 = new Osoba("Bartek", "Bartlomski");
        osoby.add(osoba2);

        System.out.println("Przed sortowaniem:");
        for (Osoba o : osoby) {
            System.out.println(o);
        }

        osoby.sort(new Comparator<Osoba>() {
            @Override
            public int compare(Osoba o1, Osoba o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println("\nPo sortowaniu:");
        for (Osoba o : osoby) {
            System.out.println(o);
        }
    }
}
