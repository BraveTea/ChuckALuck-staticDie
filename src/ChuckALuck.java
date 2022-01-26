import java.util.Arrays;

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

    //TODO playRound() is now an accumulation of all different sort of code. Will need to put
    // all logic of the bet checking system in a separate method. Perhaps in several methods
    // for example: Check for how many of the luckyNumbers is in diceThrow, return int.
    // This int will go into a increase balance method.
    // int checkAmountOfNumbers(){ return int betMultiplier = 1,2,10
    // these will then be the argument for void increaseBalance(int betMultiplier)
    public void playRound(int numberChoice, int betAmount){
        luckyNumber = numberChoice;
        increaseRound();
        diceCup.throwDice();
//        payOut();
    }

    //Name is wrong?
    private void payOut(int betAmount, int betMultiplier){
        increaseBalance(betAmount *= betMultiplier);
    }


    private void increaseBalance(int amount){
        balance += amount;
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

    private int diceInThrowResults(int chosenNum, int[] throwResults){
        int diceInResults = 0;
        for (int each : throwResults){
            if (chosenNum == each){
                diceInResults += 1;
            }
        }
        return diceInResults;
    }

//    private boolean contains(int luckyNumber, int[] throwResults){
//        return Arrays.asList(throwResults).contains(luckyNumber);
//    }



    //generateLuckyNumber and assignLuckyNumber are only split
    // because I want everything to be as small as possible.
    // Also I started writing generateAndAssign which indicates 2 methods
    // Can this be one? Should it be one? Should generateLuckyNumber() have arguments?
//    private int generateLuckyNumber(){ //(I don't need these. wrong interpretation of gamerules
//        Random rng = new Random();
//        return rng.nextInt(1,7);
//    }
//
//    private void assignLuckyNumber(){
//        luckyNumber = generateLuckyNumber();
//    }

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
}
