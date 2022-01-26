import java.util.Arrays;

public class DiceCup {

    protected int[] throwResults = new int[3];

    DiceCup(){}

    protected void throwDice(){
        for (int i = 0; i < 3; i++){
            throwResults[i] = Die.roll();
        }
    }


    @Override
    public String toString() {
        return Arrays.toString(throwResults);
    }
}
