import java.util.Scanner;

public class BankLoan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int creditScore;
        double monthlyIncome;
        boolean hasExistingDebt;

        System.out.print("Enter Your Credit Score: ");
        creditScore = scanner.nextInt();

        if(creditScore<600){
            System.out.println("You are DENIED due to not enough credit score");
        }else if(creditScore>=700){
            System.out.print("Enter your monthly Income: ");
            monthlyIncome = scanner.nextDouble();
            System.out.print("Do you have existing debt?(true or false): ");
            hasExistingDebt = scanner.nextBoolean();

            if(monthlyIncome>=4000){
              if(hasExistingDebt){
                  System.out.println("LOAN APPROVED but You need to pay Down Time Payment");
              }else{
                  System.out.println("LOAN APPROVED");
              }

            }else{
                System.out.println("LOAN DENIED");
            }

        }else{
            System.out.print("Enter your monthly Income: ");
            monthlyIncome = scanner.nextDouble();
            System.out.print("Do you have existing debt?(true or false): ");
            hasExistingDebt = scanner.nextBoolean();
            if(monthlyIncome>=6000 && !hasExistingDebt){
                System.out.println("LOAN APPROVED");
            }else{
                System.out.println("LOAN DENIED");
            }

        }
        scanner.close();
    }
}
