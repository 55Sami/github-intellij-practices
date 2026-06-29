import java.util.Random;

public class flippingCoin {
    public static void main(String[] args) {
        Random random = new Random();

        boolean coin1;
        boolean coin2;
        boolean coin3;
        boolean coin4;
        boolean coin5;

        coin1 =random.nextBoolean();
        coin2 = random.nextBoolean();
        coin3 = random.nextBoolean();
        coin4 = random.nextBoolean();
        coin5 = random.nextBoolean();

       if(coin1){
           System.out.println("HEADS");
       }else{
           System.out.println("TAILS");

       }
    }


}
