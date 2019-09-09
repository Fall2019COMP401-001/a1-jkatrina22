package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numberOfItems = scan.nextInt();
		String[] itemNames = new String[numberOfItems];
		double[] itemPrices = new double[numberOfItems];
		
		
		
		for (int i = 0; i < numberOfItems; i++) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
		
		int numberOfCustomers = scan.nextInt();
		String[] customerNames = new String[numberOfCustomers];
		int[] numberItemsBought = new int[numberOfItems];
		int[] numberPerItem = new int[numberOfItems];
		
		for (int i = 0; i < numberOfCustomers; i++) {
			customerNames[i] = scan.next();
			customerNames[i] += " " + scan.next();
			int totalNumberItemsBought = scan.nextInt();
			String[] doubleCheck = new String[totalNumberItemsBought];
			
			for (int x = 0; x < totalNumberItemsBought; x++) {
				int amt = scan.nextInt();
				String nameOfItems = scan.next();
				
				for (int y = 0; y < amt; y++) {
					totalAmtItems(itemNames, nameOfItems, 
							numberItemsBought);
				}
				if (checkRepeat(doubleCheck, nameOfItems)) {
					totalAmtItems(itemNames, nameOfItems, 
							numberPerItem);
				}
				
				doubleCheck[x] = nameOfItems;
			}
			
		}
		scan.close();
		print(itemNames, numberItemsBought, numberPerItem);
	}
	
	public static boolean checkRepeat(String[] arr, String itemName) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				return true;
			}
			if (arr[i].equals(itemName)) {
				return false;
			}
		}
		return true;
	}
	
	public static void print(String[] arr, int[] amt,
			int[] customers) {
		for (int i = 0; i < arr.length; i++) {
			if (customers[i] == 0) {
				System.out.println("No customers bought " + arr[i]);
			} else {
				System.out.println(customers[i] + " customers bought "
			+ amt[i] + " " + arr[i]);
			}
		}
	}
	
	public static void totalAmtItems(String[] arr, String item, 
			int[] amt) {
		for (int i =0; i < arr.length; i ++) {
			if (arr[i].equals(item)) {
				amt[i]++;
			}
		}
	}
}