import java.util.Scanner;

public class SmartThermostat {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String weather;
        double temp;

        System.out.print("what's the weather like(summer or winter): ");
        weather = scanner.nextLine();
        boolean winter = weather.equalsIgnoreCase("winter");

        System.out.print("Current Temperature: ");
        temp = scanner.nextDouble();

        if(weather.equalsIgnoreCase("winter")){
            if (temp<=18){
                System.out.println("Heating Turned On");}
            else if (temp>=22){
                    System.out.println("Heating Turned Off");
            }else{
                    System.out.println("Ideal System");
                }
        }else {
            if (weather.equalsIgnoreCase("summer")) {
                if (temp >= 24) {
                    System.out.println("AC Turned On");
                } else if (temp <= 21) {
                    System.out.println("AC Turned Off");
                } else {
                    System.out.println("Ideal System");
                }
            }
        }
        scanner.close();
    }
}
