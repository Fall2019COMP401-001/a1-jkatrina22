package a1;

import java.util.Scanner;

public class A1Adept {
	String name;
	double amount;
	
	A1Adept() {
		this.name = "";
		this.amount = 0;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Your code follows here.
		A1Adept biggest = new A1Adept();
		A1Adept smallest = new A1Adept();
		
		int numberOfItems = scan.nextInt();
		String[] itemNames = new String[numberOfItems];
		double[] itemPrice = new double[numberOfItems];
		
		double finalForCustomer = 0;
		double overallTotal = 0;
		for (int i = 0; i<numberOfItems; i++) {
			itemNames[i] = scan.next();
			itemPrice[i] = scan.nextDouble();
		}
		
		int numberOfCustomers = scan.nextInt();
		String[] customerNames = new String[numberOfCustomers];
		
		for (int i = 0; i < numberOfCustomers; i++) {
			customerNames[i] = scan.next();
			customerNames[i] += " " + scan.next();
			
			int totalAmtBought = scan.nextInt();
			finalForCustomer = 0;
			
			for (int x = 0; x < totalAmtBought; x++) {
				int amount = scan.nextInt();
				String item = scan.next();
				finalForCustomer += (amount * itemPrices(itemNames, item,
						itemPrice));
			}
			
			overallTotal += finalForCustomer;
			
			if (finalForCustomer > biggest.amount) {
				biggest.name = customerNames[i];
				biggest.amount = finalForCustomer;
			}
			if (finalForCustomer < smallest.amount) {
				smallest.name = customerNames[i];
				smallest.amount = finalForCustomer;
			}
			if (smallest.amount == 0) {
				smallest.name = customerNames[i];
				smallest.amount = finalForCustomer;
			}
		}
		
		String mostSpent = String.format("%.2f", biggest.amount);
		String leastSpent = String.format("%.2f", smallest.amount);
		String average = String.format("%.2f", (overallTotal/numberOfCustomers));
		System.out.println("Biggest: " + biggest.name + " (" + mostSpent + ")");
		System.out.println("Smallest: " + smallest.name + " (" + leastSpent + ")");
		System.out.println("Average: " + average);
		
	}
	public static double itemPrices(String[] arr, String item, 
	double[] price) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(item)) {
				return price[i];
			}
		}
		return 0.00;
	}
	
}
