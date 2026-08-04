public class Figure {
    String character;
    double price;

    Figure(String character,double price){
        this.character = character;
        this.price = price;

    }
    void purchase(){
        System.out.println("Your brought "+this.character+" figure "+"and the price is "+this.price);
    }
}
