import java.util.Scanner;

public class FunctionProduct {

    public static double productOfNum(double a,double b){
        double product = a*b;
        return product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double product =productOfNum(a,b);
        System.out.print("Product: "+product);

        scanner.close();
    }
}
