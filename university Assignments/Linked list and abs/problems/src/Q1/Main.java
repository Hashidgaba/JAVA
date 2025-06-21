package Q1;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> elements = new LinkedList<String>();
		elements.add("Rafay");
		elements.add("Hamza");
		elements.add("Bulbul");
		elements.add("Bilal");
		elements.add("Azan");
		elements.add("Ali");
		System.out.println("NAMES");
		for(String arr:elements) {
			System.out.println("-)"+arr);
		}
		System.out.println("");
		for(int i = 5;i>=0;i--) {
			System.out.println("-)"+elements.get(i));
		}
		System.out.println("");
		elements.remove("Rafay");
		elements.remove("Ali");
		for(String arr:elements) {
			System.out.println("-)"+arr);
		}
	}

}