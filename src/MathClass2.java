import java.util.Scanner;
public class MathClass2 {
    public static void main(String[] args) {
        //hypotenuse = math.sqrt(a^2+b^2)
        double a;
        double b;
        double h;   //hypotenuse

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of side A: ");
        a =scanner.nextDouble();
        System.out.print("Enter the length of side B: ");
        b =scanner.nextDouble();

        h=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.println("The hypotenuse (side c) is "+h+" cm");

        scanner.close();
    }
}
