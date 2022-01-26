public class Programme {

    public static void main(String[] args){
        System.out.println("config");

        ChuckALuck game1 = new ChuckALuck(100);

        game1.playRound(1,5);
        System.out.println(game1);
        game1.playRound(1,5);
        System.out.println(game1);
    }

}
