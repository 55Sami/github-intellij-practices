import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion");
        System.out.println("1.Conversion lbs to kgs");
        System.out.println("2.Conversion kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            double netWeight = weight * 0.453592;
            System.out.println(weight+" lbs in kgs is  "+netWeight);
        }else if(choice ==2){
                System.out.print("Enter the weight in kgs: ");
                weight = scanner.nextDouble();
                double netWeight = weight / 0.453592;
                System.out.printf(weight+" kgs in lbs is  "+netWeight);
        }else{
            System.out.println("The choice was not valid point");
        }
        scanner.close();
    }

}
