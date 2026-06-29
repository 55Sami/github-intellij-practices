import java.util.Scanner;
public class ifStatements {
    public static void main(String[]args){

        //if statement= performs a block of code if its condition is true
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter Your Name: ");
        name = scanner.nextLine();

        System.out.print("Enter you age: ");
        age = scanner.nextInt();

        System.out.print("Are you an student? (true or false): ");
        isStudent = scanner.nextBoolean();


        //GROUP1
        if(name.isEmpty()){
            System.out.println("You didn't enter your name");
        }else{
            System.out.println("Hello "+name+" !");
        }

        //GROUP2

        if(age>=65){
            System.out.println("You are a senior!");
        }
        else if(age >= 18){
            System.out.println("Your an adult!");
        }else if(age<0){
            System.out.println("Your are yet to be born!");
        }else if(age == 0){
            System.out.println("You are a baby!");
        }
        else{
            System.out.println("Your are a minor!");
        }

        //GROUP 3
        if(isStudent){
            System.out.println("You are a student!");
        }else{
            System.out.println("you are not a student");
        }

        scanner.close();
    }
}
