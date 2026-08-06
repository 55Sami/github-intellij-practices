package MethodOverriding;

public class Main {
    public static void main(String[] args) {
        //method Overriding = when a subclass(child) provides it own implementation of a method that is already defined.
        //                  allows for code reusability and give specific implementations

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish =new Fish();

        dog.move();
        cat.move();
        fish.move();

    }
}
