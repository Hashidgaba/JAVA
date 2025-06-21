
package Q3;

public class Main {

	public static void main(String[] args) {
		Countdowntimer C = new Countdowntimer();
		C.run();
	}
}
class Countdowntimer extends Thread{
	public void run () {
		try {
		for(int i = 10;i>=1;i--) {
			System.out.println(i);
				Thread.sleep(1000);
		}
		} catch (Exception e) {
			
		}
	}
}
