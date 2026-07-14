import java.util.Scanner;

public class EmailGenerator {

    public static String generateEmail(String firstName, String lastName){
        return(firstName+"."+lastName+"@gmail.com").toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();

        String email = generateEmail(firstName,lastName);
        System.out.println("Your email address is: "+email);
        scanner.close();
    }
}
