import java.util.Scanner;
//Q2

class Animal {
    final public void makesound() {
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal {
    // public void makesound() {
    // System.out.println("Animal make sound");
    // }
}

// Q3

final class Math_Constant {
    final double E = 2.718;
}

// Q4

class Circle {
    double calculateArea(double a) {
        final double pi = 3.14;
        double area;

        area = pi * (a * a);
        return area;
    }
}

// Q5
class Person {
    final String name;

    Person(String name) {
        this.name = name;
    }

    // Method to attempt modifying the final variable (this will cause an error)
    void changeName(String newName) {
        // this.name = newName; // Uncommenting this line will cause a compilation error
    }

}

public class Main {

    public static void main(String[] args) {
        // Q5
        Person p = new Person("Ray");
        System.out.println("Name: " + p.name);

        // Attempt to modify the final variable
        // p.name = "Roe"; // This will cause a compilation error

        System.out.println("Final variable cannot be changed once assigned.");

        // Q4
        final double radius_1;
        Circle c1 = new Circle();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius of circle");
        radius_1 = input.nextDouble();

        System.out.println("Area of circle is " + c1.calculateArea(radius_1));

        // Q3
        Math_Constant name_1 = new Math_Constant();
        System.out.println("constant " + name_1.E);

        // Q2
        Animal name = new Animal();
        name.makesound();

        // Can't overwrite this variable.
        // Q1
        final double pi = 3.14;

        double radius = 35.2;
        double area;

        area = pi * (radius * radius);
        System.out.println("Area of circle is A = " + area);
    }

}