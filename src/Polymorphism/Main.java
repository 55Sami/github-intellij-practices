package Polymorphism;

public class Main {
    public static void main(String[] args) {

        //polymorphism = ploy - many, morph - shape
        //              object can identify as other objects
        //              Objects can be treated as objects of a common superclass

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

       Vehicle[] vehicles ={car,bike,boat};

       for(Vehicle vehicle : vehicles){
           vehicle.go(); 
       }
    }
}
