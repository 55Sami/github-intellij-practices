
public class CartTotaler {
    public static Double calculateTotal(double...prices){
        double sum=0;
        for(double price : prices){
            sum+=price;
            System.out.println(price);
        }
        return sum;
    }
    public static void main(String[] args) {
        double total= calculateTotal(34.60,78,67.322);
        System.out.println("Your total is: "+total);
    }
}

