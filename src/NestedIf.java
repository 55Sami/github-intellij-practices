public class NestedIf {
    public static void main(String[] args) {

        boolean isStudent= false;
        boolean isSenior = false;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get student discount of 15% ");
                price *=0.65;
            }else{
                System.out.println("You get 15% student discount");
                price *=0.85;
            }
        }else{
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price*=0.80;
            }else{
                price *=1 ;
            }
        }
        System.out.printf("your ticket price is ¥%.2f ",price);
    }
}
