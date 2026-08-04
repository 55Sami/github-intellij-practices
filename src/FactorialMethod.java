import java.util.Scanner;

public class FactorialMethod{
    public static void calculateFactorial(int num){
        int factorial =1;
        if(num<0){
            System.out.println("Invalid Number");
            return;
        }
        for(int i =num ; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        calculateFactorial(num);
    }
}
