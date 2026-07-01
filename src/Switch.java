import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day;
        System.out.print("Enter the day of the week: " );
        day = scanner.nextLine();

        switch(day){
            case "Monday" ,"Tuesday" ,"Wednesday" ,"Thursday" ,"Friday" ->
                    System.out.println("It is a weekday😫😫");
            case "Saturday","Sunday" ->
                    System.out.println("It is a weekends🤩🤩");
            default -> System.out.println(day + "is not the valid day");

        }
        scanner.close();
    }
}
