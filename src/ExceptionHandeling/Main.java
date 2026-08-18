package ExceptionHandeling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
       //exception =  try{},catch{},finally{}


        try (Scanner scanner = new Scanner(System.in);){
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);
        }
        catch(InputMismatchException e){
            System.out.println("That wasn't a number, IDIOT!");
        }
        catch(ArithmeticException e){
            System.out.println("You cannot divide by zero! IDIOT!");
        }
        catch(Exception e){
            //Safety net
            System.out.println("Something went Wrong");
        }
        finally{
            System.out.println("This always executes");
        }
    }
}
