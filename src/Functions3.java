import java.util.Scanner;

public class Functions3 {
    public static int calculateProduct(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int product =  calculateProduct(a,b);
        System.out.println("The product of two numbers is "+product);

    }
}
