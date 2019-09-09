package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numberOfIngredients= scan.nextInt();
		
		int[] calsPerOz = new int[numberOfIngredients];
		String[] ingredientName = new String[numberOfIngredients];
		double[] pricePerOz = new double[numberOfIngredients];
		boolean[] vegetarian = new boolean[numberOfIngredients];
		
		for (int i = 0; i < numberOfIngredients; i++) {
			ingredientName[i] = scan.next();
			pricePerOz[i] = scan.nextDouble();
			vegetarian[i] = scan.nextBoolean();
			calsPerOz[i] = scan.nextInt();
		}	
		
		int numberOfRecipes = scan.nextInt();
		String[] menu = new String[numberOfRecipes];
		double[][] recipeIngredients = new double[numberOfRecipes][numberOfIngredients];
		
		for (int i = 0; i < numberOfRecipes; i++) {
			menu[i] = scan.next();
			int numberOfRecipeIngredients = scan.nextInt();
			String[] ingredients = new String[numberOfRecipeIngredients];
			// amtNeeded[i] = scan.nextDouble();

		
			for (int j = 0; j < numberOfRecipeIngredients; j++) {
				ingredients[j] = scan.next();
				int arr = 0;
				int k = 0;
				for (k = 0; k < numberOfIngredients; k++) {
					if(ingredients[j].equals(ingredientName[k])) {
						break;
					}
				}
				recipeIngredients[i][k] = scan.nextDouble();
			}
		}
		
		int orderNumber[] = new int[numberOfRecipes];
		String menuItem = "";
			
		while (!menuItem.equals("EndOrder")) {
			menuItem = scan.next();
			for (int i = 0; i < numberOfRecipes; i++) {
				if (menuItem.equals(menu[i])) {
					orderNumber[i]++;
				}
			}
		}
		
		double amtNeeded [] = new double[numberOfIngredients];
		
		for (int i = 0; i < numberOfRecipes; i++) {
			for (int j = 0; j < numberOfIngredients; j++) {
				amtNeeded[j] += recipeIngredients[i][j] * orderNumber[i];
			}
		}
		System.out.println("This order will require:");
		for (int i = 0; i < numberOfIngredients; i++) {
			System.out.println(String.format("%.2f", amtNeeded[i]) + " ounces of " + ingredientName[i]);
		}
		
	}
					
}


