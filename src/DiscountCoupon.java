import java.util.Scanner;

public class DiscountCoupon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isStudent;
        String couponCode="SAVE50";

        System.out.print("Enter you coupon code: ");
        String userCoupon = scanner.nextLine();
        System.out.print("Are you a studrnt?(true or false): ");
        isStudent = scanner.nextBoolean();

        if(couponCode.equalsIgnoreCase(userCoupon) || isStudent){
            System.out.println("Discount Applied");
        }else{
            System.out.println("Full Price");
        }
        scanner.close();
    }
}
