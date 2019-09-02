package a1;

import java.util.Scanner;

public class A1Novice {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		int customer = scan.nextInt();
		for(int i = 0; i < customer; i++) {
			scanCustomer();
		}
		scan.close();
	}
	
	static void scanCustomer() {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		char initial = firstName.charAt(0);
		// System.out.println(initial + ". " + lastName);
		
		int numberOfItems = scan.nextInt();
		double total = 0;
		for (int i = 0; i < numberOfItems; i++) {
			int howMany = scan.nextInt();
			// System.out.println(howMany);
			
			String itemName = scan.next();
			double itemPrice = scan.nextDouble();
			// System.out.println(itemName + " " + itemPrice);
			total +=  howMany * itemPrice;
		}
		System.out.println(initial + ". " + lastName + ": " + total);
		//scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
