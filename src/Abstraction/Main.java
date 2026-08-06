package Abstraction;

public class Main {
    public static void main(String[] args) {
    //abstract = used to define abstract classes and method
    //            abstraction is the process of hiding implementation details and showing only the essential features
    //              Abstract classes CAN'T be instantiated directly
    //              can contain 'abstract' methods(which must be implemented)
    //              can contain 'concrete' methods(which are inherited)

        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3.4, 5.6);
        Rectangle rectangle = new Rectangle(24,6);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
