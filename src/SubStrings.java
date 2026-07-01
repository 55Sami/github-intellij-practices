import java.util.Scanner;

public class SubStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;

        System.out.print("Enter Your E-mail: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            String username = email.substring(0,email.indexOf("@"));
            String domain = email.substring(email.indexOf("@")+1);

            System.out.println(username);   //0 to 7 but does not include 7
            System.out.println(domain);
        }
        else{
            System.out.println("E-mails must contains @ ");
        }


        scanner.close();

    }
}
