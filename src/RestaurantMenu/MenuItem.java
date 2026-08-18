package RestaurantMenu;

public abstract class MenuItem {
    private double price;
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        if(price >=0){
            this.price = price;
        }else{
            System.out.println("Error: Price cannot be Negative");
        }
    }
    public abstract void prepareFood();

    public void printReceipt(){
        System.out.println("Thank you for dining with us!");
    }

}
