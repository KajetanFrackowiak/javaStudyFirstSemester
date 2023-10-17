package Task1;

import java.util.Scanner;
public class GraZLogika {
    private Scanner scanner = new Scanner(System.in);
    private int min;
    private int max;
    public GraZLogika(int min, int max) {
        this.min = min;
        this.max = max;
    }

    int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public void startGame() {


        int random = getRandomNumber(min,max);


        System.out.printf("Guess what is it the number from %d to %d: ", min, max);
        int guess = scanner.nextInt();
        int i = 4;

        while (random != guess && i != 0) {
            if (guess > random) {
                System.out.printf("The number is too big, try again, you have else %d chances: ", i);
            } else if (guess < random) {
                System.out.printf("The number is too small, try again, you have else %d chances: ", i);
            }
            guess = scanner.nextInt();
            i--;
        }
        System.out.printf("You guessed!!! True number is %d\n", guess);

    }

}
