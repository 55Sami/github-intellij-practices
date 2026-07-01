import java.util.Scanner;
public class Ecommerce {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isPrimeMember;
        double orderTotal;

        System.out.print("Are you a premium user(true or false): ");
        isPrimeMember = scanner.nextBoolean();
        System.out.print("what is you total shopping amount?: ");
        orderTotal = scanner.nextDouble();


        if(isPrimeMember){
            if(orderTotal>=10){
                System.out.printf("Your get free shipping");
            }else{
                System.out.println("Your shipping fee is 2$");
            }

        }else{
            if(orderTotal>=50){
                System.out.println("Your shipping is free");
            }else{
                System.out.println("You have to pay $8 shipping fee");
            }

        }

        scanner.close();
    }
}
