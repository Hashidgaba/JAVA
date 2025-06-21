import java.util.Scanner;

 class Manager {
	private int pass = 1234;
	
	void changepassword(int oldpass,int newpass) {
		if(oldpass!=pass){
			System.out.println("The old password is invalid");
		}else if (pass==oldpass) {
			pass=newpass;
			System.out.println("Password update");
		}	
	}
	void validatepassword(int newpass) {
		if(newpass==pass) {
			System.out.println("Correct Password");
		}else {
			System.out.println("Invalid Password");
		}
	}
	
}



public class Main {
    public static void main(String[] args) {
		int oldpass;
		int newpass;
		
		 Manager m1 = new Manager ();
		 Scanner input = new Scanner (System.in);
		 
		 System.out.println("Enter old password ");
		 oldpass=input.nextInt();
		 
		 System.out.println("Enter new password ");
		 newpass=input.nextInt();
		 
		 m1.changepassword(oldpass, newpass);
		 
		 System.out.println("\nEnter password ");
		 newpass=input.nextInt();
		 m1.validatepassword(newpass);
	}

}
