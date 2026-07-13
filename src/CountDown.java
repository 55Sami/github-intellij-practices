import java.util.Scanner;

public class CountDown {
    public static void main(String[] args)throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many seconds to count down from?: ");
        int start = scanner.nextInt();

        for(int i =start; i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR🎉🎉🎉🎉🎉🎉");
        scanner.close();
    }
}
