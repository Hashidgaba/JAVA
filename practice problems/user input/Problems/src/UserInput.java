import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String name;
        int age;
        String dep;

        System.out.println("Enter your Name");
        name = cin.nextLine();
        System.out.println("Enter your age : ");
        age = cin.nextInt();
        cin.nextLine();
        System.out.println("Enter your Department");
        dep = cin.nextLine();


        System.out.println("Information you have provided us:");
        System.out.println("Student name is : " + name);
        System.out.println("Student age is : " + age);
        System.out.println("Student department is : " + dep);

    }
}
