package GettersAndSetters;

public class Main {
    public static void main(String[] args) {

        //they help protect data and add rules for accessing or modifying them
        //    Getters: method that make a field readable and can add additional logic when retrieving one of the attributes
        //    Setters: method that make a field writeable


        Car car = new Car("Mustang","Yellow",34000 );

        car.setColor("Purple");
        car.setPrice(-2);

        System.out.println(car.getColor() +" "+car.getModel()+" "+car.getPrice());
    }
}
