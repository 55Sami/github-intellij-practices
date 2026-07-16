import java.util.Scanner;

public class PasswordStrength {

    //this method promise to return a String (weak medium etc..)
    public static String checkStrength(String password){
        //change to look at ranges 8 0r more character
        if(password.length()>=8){
            return ("Strong Password!"); //return the strength text directly
        }else{
            return ("Weak Password!");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password ;
        System.out.print("Enter New Password: ");
        password = scanner.nextLine();

        //call the method: pass the password in and catch the return
        String check =checkStrength(password);
        System.out.println("Your password strength is "+check);

        scanner.close();
    }
}
