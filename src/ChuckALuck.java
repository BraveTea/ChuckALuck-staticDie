public class ChuckALuck {
    private int round;
    private int luckyNumber;
    private DiceCup diceCup = new DiceCup();
    private int balance;


    ChuckALuck(int startingBalance){
        this.balance = startingBalance;
    }

    //Overloaded to supply a basic staring balance of 100
    ChuckALuck(){
        this.balance = 100;
    }

    public void playRound(int luckyNumber, int betAmount){
        this.luckyNumber = luckyNumber;
        increaseRound();
        diceCup.throwDice();
        runBetting(luckyNumber, betAmount);
    }

    private void runBetting(int luckyNumber, int betAmount){
        decreaseBalance(betAmount);
        int numOfDice = diceInThrowResults(luckyNumber, diceCup.throwResults);
        payOut(betAmount, betMultiplier(numOfDice));
    }

    //Name is wrong?
    private void payOut(int betAmount, int betMultiplier){
        increaseBalance(betAmount * betMultiplier);
    }


    private int betMultiplier(int diceInThrowResults){
        int betMultiplier = 0;
        if (diceInThrowResults == 1){
            betMultiplier = 1;
        }
        if (diceInThrowResults == 2){
            betMultiplier = 2;
        }
        if (diceInThrowResults == 3){
            betMultiplier = 10;
        }
        return betMultiplier;
    }

    private int diceInThrowResults(int luckyNumber, int[] throwResults){
        int diceInResults = 0;
        for (int dice : throwResults){
            if (luckyNumber == dice){
                diceInResults += 1;
            }
        }
        return diceInResults;
    }


    private void increaseBalance(int amount){
        balance += amount;
    }

    private void decreaseBalance(int amount){
        balance -= amount;
    }

    private void increaseRound(){
        round++;
    }

    @Override
    public String toString() {
        return String.format("ChuckALuck{" + "%n" +
                "round=" + round + "%n" +
                "luckyNumber=" + luckyNumber + "%n" +
                "throw=" + diceCup + "%n" +
                "balance=" + balance + "%n" +
                '}');
    }

//        private boolean contains(int luckyNumber, int[] throwResults){
//        return Arrays.asList(throwResults).contains(luckyNumber);
//    }
}
