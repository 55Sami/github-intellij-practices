import java.util.Scanner;

public class AccessControl {
    public static void main(String[] args) {
        String rating;
        Scanner scanner = new Scanner(System.in);
        boolean parentAround;
        int age;

        System.out.print("Enter the movie rating( R, PG=13, or G): ");
        rating = scanner.nextLine();
        char letter = rating.charAt(0);


        if (letter=='G' || letter=='g'){
            System.out.println("You can watch any movie");
        }else if(letter=='P' || letter=='p') {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
            if(age>=13){
                System.out.println("You can watch the movie");

            }else{
                System.out.print("Is your parent there?(true or false): ");
                parentAround=scanner.nextBoolean();
                if(parentAround){
                    System.out.println("You can watch the movie");
                }else{
                    System.out.println("Access Denied");
                }
            }
        }else{
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
            if(age>=17){
                System.out.println("You can watch the movie");
            }else{
                System.out.println("Access Denied");
            }
        }



        scanner.close();
    }
}

