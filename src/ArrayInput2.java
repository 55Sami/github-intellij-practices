import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("What number of food do you want?: ");
        size = scanner.nextInt();
        foods = new String[size];
        scanner.nextLine();

        for(int i = 0; i< foods.length;i++){
            System.out.print("Enter a Food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food:foods){
            System.out.println(food);
        }

        scanner.close();
    }
}
