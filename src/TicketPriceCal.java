import java.util.Scanner;

public class TicketPriceCal{

    public static double getTicketPrice(int age){
        if(age<12){
            return 5.0;
        }else if(age>=65){
            return 7.0;
        }else{
            return 10.0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double finalPrice =getTicketPrice(11);
        System.out.println("Your ticket price is "+finalPrice+"$");

        scanner.close();
    }
}
