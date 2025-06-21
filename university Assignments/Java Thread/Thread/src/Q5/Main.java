package Q5;

public class Main {

	public static void main(String[] args) {
		 Multipletimers m = new  Multipletimers();
		 m.time();
	}
}
class Multipletimers extends Thread{
	public void time () {
		try {
				Thread.sleep(2000);
				System.out.println("2 seconds");
				Thread.sleep(4000);
				System.out.println("4 seconds");
				Thread.sleep(6000);
				System.out.println("6 seconds");
			
		}catch (Exception e) {
			
		}
	}
}