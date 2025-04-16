import java.util.Scanner;
public class square {
    public void sqr(){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter any number ");
        double num = sn.nextDouble();
        double squareRoot = Math.sqrt(num);
        System.out.println("Square root of " + num + " is: " + squareRoot);
      
    }
}
