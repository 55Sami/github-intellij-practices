import java.util.*;

public class Methods2 {

    public static void printName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        printName((name));
    }
}
