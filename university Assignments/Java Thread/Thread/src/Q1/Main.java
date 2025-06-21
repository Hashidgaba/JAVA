package Q1;

public class Main {

	public static void main(String[] args) {
		Simpleprinter s = new Simpleprinter();
		s.run();

	}
}
class Simpleprinter extends Thread{
	public void run () {
		try {
			for(int i = 0;i<=5;i++) {
				System.out.println("HELLO ");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			
		}
	
	}
}