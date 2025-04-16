import java.util.Scanner;
public class Absolut {
    public void abs(){
        int num1,num2;
        Scanner sn1 = new Scanner(System.in);

        System.out.println("Enter number 1");
        num1 = sn1.nextInt();
        System.out.println("Enter number 2");
        num2 = sn1.nextInt();

        System.out.println("Absolute Difference is : " + Math.abs(num1 - num2));
       
    }
}
