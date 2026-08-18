package Composition;

public class Processor {
    String brand;

    Processor(String brand){
        this.brand = brand;
    }

    void displaySpecs(){
        System.out.println(this.brand);
    }

}
