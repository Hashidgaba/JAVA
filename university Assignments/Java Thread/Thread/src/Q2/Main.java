
package Q2;

public class Main {

	public static void main(String[] args) {
    Numberprinter N = new Numberprinter();
    Characterprinter C = new Characterprinter();
    N.run();
    C.alphabets();

	}
}
class Numberprinter extends Thread{
	public void run () {
		for(int i = 1;i<=5;i++) {
			System.out.println(i);
		}
	}
}
class Characterprinter extends Thread{
	public void alphabets() {
		for (char c = 'A'; c <= 'E'; c++) {
        System.out.print(c + " ");
    }
		
	}
	
}
