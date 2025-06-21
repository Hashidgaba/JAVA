package Q2;
//Abstract class
abstract class Shape {
 abstract double getArea(); // Abstract method
}

//Circle class
class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 double getArea() {
     return Math.PI * radius * radius;
 }
}

//Rectangle class
class Rectangle extends Shape {
 private double width, height;

 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 @Override
 double getArea() {
     return width * height;
 }
}

//Test class
public class Main {
 public static void main(String[] args) {
     Shape circle = new Circle(5);
     Shape rectangle = new Rectangle(4, 6);

     System.out.println("Circle Area: " + circle.getArea());
     System.out.println("Rectangle Area: " + rectangle.getArea());
 }
}