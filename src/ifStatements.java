import java.util.Scanner;
public class ifStatements {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you age: ");
        int age = scanner.nextInt();

        //if statement= performs a block of code if its condition is true

        if(age >= 18){
            System.out.println("Your an adult");
        }else if(age<0){
            System.out.println("Your are yet to be born");
        }else if(age == 0){
            System.out.println("You are a baby");
        }
        else{
            System.out.println("Your are a minor");
        }
        scanner.close();
    }
}
