package Task1;/*
              Każde z poniższych zadań wykonaj w osobnym projekcie/ewentualnie pakiecie wewnątrz jednego projektu. Pamiętaj o właściwym stosowaniu modyfikatorów dostępu i enkapsulacji detali implementacji,
              które nie powinny być widoczne dla innych klas.
              
              Zadanie 1. Napisz grę ‘zgadnij liczbę’. Program powinien składać się z 2 klas: Main oraz Gra z logiką gry.
              Na początku gry użytkownik definiuje zakres liczb, następnie komputer losuje jedną liczbę z podanego zakresu i odpytuje użytkownika o liczbę.
              Jeśli liczba jest inna od wylosowanej przez komputer gracz otrzymuje informację ‘za mała’, ‘za duża’ po 5 nieudanych próbach wyświetla się komunikat o porażce oraz wartość nieodgadniętej liczby.
              */

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Give a range of number.\nFirst minimum number and next maximum number:");

            int min = scanner.nextInt();
            int max = scanner.nextInt();

            GraZLogika game = new GraZLogika(min, max);
            game.startGame();
        }

    }
}