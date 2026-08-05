package inheritance_practices;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        plant.photosynthesize();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        cat.eat();

        System.out.println(dog.name+" has "+dog.lives+" lives.");
        System.out.println(cat.name+" has "+cat.lives+" lives.");

        dog.speak();
        cat.speak();



    }
}
