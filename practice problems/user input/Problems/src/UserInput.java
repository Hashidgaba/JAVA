import java.util.*;
public class UserInput {

    public static void main(String[] args) {
        // Scanner cin = new Scanner(System.in);
        // String name;
        // int age;
        // String dep;

        // System.out.println("Enter your Name");
        // name = cin.nextLine();
        // System.out.println("Enter your age : ");
        // age = cin.nextInt();
        // cin.nextLine();
        // System.out.println("Enter your Department");
        // dep = cin.nextLine();


        // System.out.println("Information you have provided us:");
        // System.out.println("Student name is : " + name.toUpperCase());
        // System.out.println("Student age is : " + age);
        // System.out.println("Student department is : " + dep.toUpperCase());


        //the sum of all positive int 
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(true){
            Scanner cin = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int num = cin.nextInt();
            if(num > 0){
                sum += num;
            }else{
                
                arr.add(num);
            }
            System.out.println("are you want to continue y/n : ");
            String choice  = cin.next();
            if(choice.equals("n")){
                System.out.println("You have entered a negative and positive number");

                System.out.println("The sum of all positive number is : " + sum);
                System.out.println("The negative number you have entered is : " + arr);
                break;
            }

        }    
    }
}
