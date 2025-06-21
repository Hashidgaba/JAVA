package Q4;


class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting with a kick...");
    }
}


class Bus implements Vehicle {
    public void start() {
        System.out.println("Bus is starting with button ignition...");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting with key ignition...");
    }
}

 interface Vehicle {
    void start();
}


public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Bus();

        v1.start();
        v2.start();
        v3.start();
    }
}
