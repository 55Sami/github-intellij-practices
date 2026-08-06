package Abstraction;

public class Rectangle extends Shape{

    double length;
    double base;

    Rectangle(double length, double base){
        this.length = length;
        this.base = base;
    }
    @Override
    double area(){
        return length* base;
    }
}
