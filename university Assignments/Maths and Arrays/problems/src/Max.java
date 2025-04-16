import java.util.Scanner;

public class Max {
    public void maxNumber(){
        int num1,num2,num3;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter number 1");
        num1 = sn.nextInt();

        System.out.println("Enter number 2");
        num2 = sn.nextInt();

        System.out.println("Enter number 3");
        num3 = sn.nextInt();

        int large = Math.max(num1, num2);
        System.out.println("largest one is : " + Math.max(large, num3));

    }
}
