
class Subclass_Student extends Superclass_Person {

}

class Superclass_Person {
    public String name = "RAFAY";
    public int age = 17;

    void introduce() {
        System.out.println("My name is " + name + '\n');
        System.out.println("I am " + age + " years old");
    }
}

public class Main {

    public static void main(String[] args) {
        Subclass_Student s = new Subclass_Student();
        s.introduce();
    }

}
