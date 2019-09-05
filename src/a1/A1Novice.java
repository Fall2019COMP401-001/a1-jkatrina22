package a1;

import java.util.Scanner;

public class A1Novice {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		int numberOfCustomers;
		String[] firstName;
		String[] lastName;
		int numberBought;
		int[] quantityBought;
		String itemName;
		double[] price;
		double total;

		numberOfCustomers = scan.nextInt();
		firstName = new String[numberOfCustomers];
		lastName = new String[numberOfCustomers];
		for (int i=0; i<numberOfCustomers; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			numberBought = scan.nextInt();
				
			quantityBought = new int[numberBought];
			price = new double[numberBought];
			total = 0;
			for (int x=0; x<numberBought; x++) {
				quantityBought[x] = scan.nextInt();
				itemName = scan.next();
				price[x] = scan.nextDouble();
				total += (quantityBought[x] * price[x]);
			}	
			
			
			System.out.println(firstName[i].charAt(0)+". "+
			lastName[i]+": "+total);
		}
		
	
		
		scan.close();
	}
}





