import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;

        System.out.print("enter the first number: ");
        num1 =scanner.nextDouble();

        System.out.print("Enter an operator( +, -,*, /, ^ ): ");
        operator = scanner.next().charAt(0);

        System.out.print("enter the second number: ");
        num2 =scanner.nextDouble();

        switch(operator){
            case '+' -> result = num1+num2;
            case '-' -> result = num1-num2;
            case '*' -> result = num1*num2;
            case '^' -> result = num1/num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot be divided by zero!");
                }else{
                    result = Math.pow(num1,num2);
                }

            }
            default -> System.out.println("wrong operator");

        }

        scanner.close();
    }
}
