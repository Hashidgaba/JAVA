
class Calculate {
	
public int add (int a,int b) {
	int res = a+b;
	return res;
}
public int add (int a,int b,int c) {
	int res = a+b+c;
	return res;
}
}

public class Main {

	public static void main(String[] args) {
		
		Calculate c = new Calculate();
		
		System.out.println("Method Overloading");
		System.out.println("->"+c.add(16, 58));
		System.out.println("->"+c.add(55, 55, 55));

	}

}
