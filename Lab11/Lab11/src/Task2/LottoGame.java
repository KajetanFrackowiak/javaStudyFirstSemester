package Task2;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoGame {
    public static void main(String[] args) {
        Set<Integer> userNumbers = getUserNumbers();
        Set<Integer> randomNumbers = getRandomNumbers();

        System.out.println("Wybrane przez Ciebie liczby: " + userNumbers);
        System.out.println("Liczby z losowania lotto: " + randomNumbers);

        int matches = countMatches(userNumbers, randomNumbers);
        double percentage = (double) matches / 6 * 100;
        String formattedPercentage = String.format("%.2f", percentage);
        System.out.println("Liczba trafień: " + matches + "/6 " + formattedPercentage + "%");

    }

    private static Set<Integer> getUserNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give 6 numbers in the range from 1-49");

        while (numbers.size() < 6) {
            System.out.println("Give a number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= 1 && number <= 49) {
                    numbers.add(number);
                } else {
                    System.out.println("The number is out of range");
                }
            } else {
                System.out.println("Not correct format. Give an integer number: ");
                scanner.next();
            }
        }
        return numbers;
    }

    private static Set<Integer> getRandomNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();

        while (numbers.size() < 6) {
            int number = random.nextInt(49) + 1;
            numbers.add(number);
        }
        return numbers;
    }

    private static int countMatches(Set<Integer> userNumbers, Set<Integer> randomNumbers) {
        int count = 0;
        for (int number : userNumbers) {
            if (randomNumbers.contains(number)) { //If random.numbers is in number next count++
                count++;
            }
        }
        return count;
    }
}
