
class Car extends superclass {
    public void honk() {
        System.out.println("The car honks!!");
    }
}

class superclass {

    public void startEngine() {
        System.out.println("The vechile Engine starts");
    }
}

public class Main {

    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();
        c.honk();

    }

}