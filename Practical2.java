// Practical 2: Single, Multilevel, and Hierarchical Inheritance
class Vehicle {
    void start() { System.out.println("Vehicle starts"); }
}
class Car extends Vehicle {
    void drive() { System.out.println("Car is driving"); }
}

class Person {
    void introduce() { System.out.println("I am a person"); }
}
class Employee extends Person {
    void work() { System.out.println("Employee is working"); }
}
class Manager extends Employee {
    void manage() { System.out.println("Manager manages a team"); }
}

class Shape {
    void describe() { System.out.println("This is a shape"); }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
    double area() { return Math.PI * radius * radius; }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) { this.length = length; this.width = width; }
    double area() { return length * width; }
}

public class Practical2 {
    public static void main(String[] args) {
        System.out.println("Single inheritance:");
        Car car = new Car(); car.start(); car.drive();

        System.out.println("\\nMultilevel inheritance:");
        Manager manager = new Manager();
        manager.introduce(); manager.work(); manager.manage();

        System.out.println("\\nHierarchical inheritance:");
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4, 5);
        circle.describe(); System.out.println("Circle area: " + circle.area());
        rectangle.describe(); System.out.println("Rectangle area: " + rectangle.area());
    }
}
