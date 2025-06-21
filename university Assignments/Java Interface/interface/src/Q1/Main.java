package Q1;
import java.util.Scanner;


interface shape {
    double area();
}

class Circle implements shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        shape circle = new Circle(radius);
        System.out.println("Circle Area: " + circle.area());

        System.out.print("Enter length and width of rectangle: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        shape rectangle = new Rectangle(length, width);
        System.out.println("Rectangle Area: " + rectangle.area());

        sc.close();
    }
}