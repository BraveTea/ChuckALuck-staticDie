import java.util.Random;

public class Die {

    private static Random rng = new Random();

    protected static int roll() {
        return rng.nextInt(1, 7);
    }
}

