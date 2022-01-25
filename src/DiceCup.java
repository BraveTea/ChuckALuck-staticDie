import java.util.Arrays;

public class DiceCup {

    protected int[] throwResults = new int[3];

    DiceCup(){}

    public void throwDice(){
        for (int i = 0; i < 3; i++){
            throwResults[i] = Die.roll();
        }
    }

    @Override
    public String toString() {
        return "DiceCup{" +
                "throwResults=" + Arrays.toString(throwResults) +
                '}';
    }
}
