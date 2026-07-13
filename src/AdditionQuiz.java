import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 5;
        int num2 = 7;
        int correct = num1+num2;
        int userAnswer = 0;

        do{
            System.out.print("What is "+num1+"+"+num2+"?");
            userAnswer=scanner.nextInt();
            if(userAnswer!=correct){
                System.out.println("Wrong! try again.");
            }
        }while(userAnswer != correct);

        System.out.println("You are correct");

        scanner.close();
    }
}
