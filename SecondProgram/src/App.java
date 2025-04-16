
class Student {

    String name;
    int age;
    String dep;

    //print information
    public void printInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Department : " + this.dep);

    }

    Student(String name, int age, String dep) {
        this.name = name;
        this.age = age;
        this.dep = dep;

    }
}

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to student management system");
        Student s1 = new Student("Hashid", 21, "Computer Science");
        s1.printInfo();

        Student s2 = new Student("Bilal", 20, "Computer Science");
        s2.printInfo();

    }
}
