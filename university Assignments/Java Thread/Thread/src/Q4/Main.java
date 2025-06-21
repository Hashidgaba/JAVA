package Q4;

import java.time.*;

public class Main {

	public static void main(String[] args) {
		Clockdisplay name = new Clockdisplay();
		name.time();
	}
}
class Clockdisplay extends Thread{
	public void time () {
	try {
		while(true) {
			Thread.sleep(1000);
			System.out.println(java.time.LocalTime.now());
		}
	}catch (Exception e) {
		
	}
	}
}
