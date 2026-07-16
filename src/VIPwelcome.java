import java.util.Scanner;

public class VIPwelcome {
    public static String checkVIP(boolean isVip){
        if(isVip){
            return "Welcome VIP!";
        }else{
            return "Welcome Guest!";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you VIP guest?(true or false): ");
        boolean isVip = scanner.nextBoolean();

        //call the machine and save the answer in a temporary variable
        String message = checkVIP((isVip));
        System.out.println(message);

        scanner.close();

    }
}
