import java.util.Scanner;

public class MathClass3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //circumference= 2*pie*r
        //area=pie *r^2
        //volume= 4/3pie r^3

        double r;   //radius
        double c;   //circumference
        double a;   //area
        double v;   //volume

        System.out.print("Enter the radius of circle: ");
        r = scanner.nextDouble();

        c= 2*Math.PI*r;
        a= Math.PI*Math.pow(r,2);
        v= (4.0/3.0)*Math.PI*Math.pow(r,3);

        System.out.printf("The circumference of circle is %.1fcm \n" ,c);
        System.out.printf("The area of circle is %.1fcm^2 \n", a);
        System.out.printf("The volume of circle is %.1fcm^3 \n", v);

    }
}
