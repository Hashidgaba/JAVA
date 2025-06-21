import java.util.Scanner;

//Question -1
class Employee {

    double calculateBonus(int a) {
        return (a * 0.05);
    }

    double calculateBonus(double b, int c) {
        if (c == 5) {
            return (b * 0.2);
        }
        if (c == 4) {
            return (b * 0.15);
        }
        if (c == 3) {
            return (b * 0.1);
        }
        if (c == 2) {
            return (b * 0.05);
        }
        if (c == 1) {
            return (b * 1);
        } else {
            return (b * 0);
        }
    }
}
// Question -2

class Manager_class extends Employee_1 {
    public int salary = 5000;

    @Override
    void calculateSalary() {
        System.out.println("Manager salary : " + salary + "$");

        System.out.println("Manager salary : " + salary * 0.05 + "$ (5%) bonus");
    }
}

class Employee_1 {
    public int salary = 3000;

    void calculateSalary() {
        System.out.println("Base salary : " + salary + "$");
    }
}

class Developer_class extends Manager_class {
    public int salary = 4000;

    @Override
    void calculateSalary() {
        System.out.println("Developer salary : " + salary + "$");

        System.out.println("Developer salary : " + salary * 0.1 + "$ (10%) Project Allowance");

    }
}

// question - 3

class Animal {
    public void makeSound() {

    };
}

class Cat extends Dog {
    @Override
    public void makeSound() {
        System.out.println("Meow!!!!");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// question - 4
class Employee_2 {
    public void printDetails(int a) {
        System.out.println("Employee ID : " + a);
    }

    public void printDetails(String name) {
        System.out.println("Employee Name : " + name);
    }

    public void printDetails(int a, String name) {
        System.out.println("/////////////////////////////////");
        System.out.println("Employee Name : " + name + '\n' + "Employee ID : " + a);
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // question -4

        int id;
        String name;

        Employee_2 e3 = new Employee_2();

        System.err.println("Enter your name :");
        name = input.nextLine();
        System.err.println("Enter your id :");
        id = input.nextInt();

        e3.printDetails(name);
        e3.printDetails(id);
        e3.printDetails(id, name);

        // question -3
        Animal a1 = new Animal();
        Dog d2 = new Dog();
        Cat c1 = new Cat();

        a1.makeSound();
        d2.makeSound();
        c1.makeSound();

        // question-2

        Employee_1 e2 = new Employee_1();
        Manager_class m1 = new Manager_class();
        Developer_class d1 = new Developer_class();

        e2.calculateSalary();
        m1.calculateSalary();
        d1.calculateSalary();

        // question -1

        int basesalary;
        double basesalary2;
        double base;
        int rate;

        Employee e1 = new Employee();

        System.out.println("Enter your salary");
        basesalary = input.nextInt();

        System.out.println("Enter your salary in double");
        basesalary2 = input.nextDouble();

        System.out.println("Enter your Rating(1->5)");
        rate = input.nextInt();

        System.out.println("Bonus for your basesalary " + basesalary + " is (5%): " + e1.calculateBonus(basesalary));

        System.out.print("Bonus for your doublesalary " + basesalary2 + " and rating " + rate + " is: ");
        base = e1.calculateBonus(basesalary2, rate);
        if (base == basesalary2) {
            System.out.println("NO BONUS " + base);
        } else if (base == 0) {
            System.out.println("ERROR");
        } else {
            System.out.println(base);
        }

    }
}