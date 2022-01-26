import java.util.Random;

public class Die {

    protected static int roll(){
        Random rng = new Random();
        return rng.nextInt(1,7);
    }


}
