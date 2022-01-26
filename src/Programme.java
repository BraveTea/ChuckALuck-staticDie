public class Programme {

    public static void main(String[] args){
        System.out.println("config");

        ChuckALuck game1 = new ChuckALuck(100);

        for (int i = 0; i < 10; i++) {
            game1.playRound(1,5);
            System.out.println(game1);
        }

    }

}
