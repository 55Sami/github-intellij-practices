
import java.util.Random;
public class HeadOrTail {
    public static void main(String[] args){
        Random random = new Random();

        boolean isHead1 =random.nextBoolean();

        //System.out.println(isHead);

        if(isHead1){
            System.out.println("it's a HEAD");
        }else{
            System.out.println("it's a TAIL");
        }
    }
}
