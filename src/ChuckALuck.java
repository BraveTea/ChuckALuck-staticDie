public class ChuckALuck {
    private int balance;
    private int luckyNumber;
    private int round;

    ChuckALuck(int startingBalance){
        this.balance = startingBalance;
    }

    //Overloaded to supply a basic staring balance of 100
    ChuckALuck(){
        this.balance = 100;
    }

    public void testRunGame(){
        DiceCup diceCup1 = new DiceCup();
        diceCup1.throwDice();
        System.out.println(diceCup1);
    }

}
