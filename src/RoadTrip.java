import java.util.Scanner;

public class RoadTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer;
        do{
            System.out.print("Are we there yet?(yes or No): ");
            answer = scanner.nextLine();

            if(answer.equalsIgnoreCase("yes")){
                System.out.println("you have reached your destination");
            }else{
                System.out.println("Not yet....Keep Driving");
            }
        }while(!answer.equalsIgnoreCase("yes"));

        scanner.close();
    }
}

