import java.util.Scanner;

public class MultiplierTable{

    public static void printMultipleTable(int num){
        if(num<=0){
            System.out.println("Your number is invalid!");
            return;
        }
       for(int i=1; i<=10; i++){
           System.out.println(num*i);
       }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        printMultipleTable(num);
        scanner.close();
    }
}

