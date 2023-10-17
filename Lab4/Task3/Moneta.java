package Task3;

import java.util.Random;

public class Moneta {
    private Random random = new Random();

    public String toss() {
        return random.nextBoolean() ? "heads" : "tails";
    }
}
