import java.util.Scanner;

public class PiggyBankSaver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSaved =0;
        for(int i =1; i<=14; i++){
            totalSaved+=2;
            System.out.println("Day "+i+":"+totalSaved+"$");
        }

        scanner.close();
    }


}
