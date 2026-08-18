package Composition;

public class Computer {
    String model;

    Processor processor;

    Computer(String model, String processor){
        this.model = model;
        this.processor = new Processor(processor);
    }
    void showDetails(){
        System.out.println(this.model);
        this.processor.displaySpecs();
    }
}
