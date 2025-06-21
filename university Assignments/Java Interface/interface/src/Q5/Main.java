package Q5;


interface Greeting {
    void sayHello(String name);

    default void sayGoodbye() {
        System.out.println("Goodbye!");
    }

    static void staticGreet() {
        System.out.println("Static Greeting: Hello from interface!");
    }
}

class Welcome implements Greeting {
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

public class Main {
    public static void main(String[] args) {
        Greeting.staticGreet();

        Greeting g = new Welcome();
        g.sayHello("Alex");
        g.sayGoodbye();
    }
}

