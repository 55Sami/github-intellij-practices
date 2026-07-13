import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int fuel=100;
        boolean warningLight= false;

        do{
         fuel-=20;
            System.out.println("Driving...current fuel: "+fuel);
            if(fuel<=20){
               warningLight=true;
                System.out.println("WARNING...Low Fuel ON");
            }
        }
        while(fuel>0 && !warningLight);

        System.out.println("Car stopped. Final Fuel level: "+fuel);

        scanner.close();
    }
}

