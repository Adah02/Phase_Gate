import java.util.Scanner;
import java.util.ArrayList;
public class CheckOutAppDriver {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	CheckOutApp quiz = new CheckOutApp();

	String availableProducts = 
"""
===================================
    Welcome to Semicolon Stores
===================================
    press the respective number
        to purchase product.
===================================
             Press:-
   1. Rice         2. Ice-Scream
   3. Bread        4. Yogurt
   5. Pringles     6. Vegetable-Oil
   7. Eggs         8. Mash-mallow
   9. Sadin        10. Table-water
  11. Peak Milk    12. Snackers
===================================
""";

	String[] products = {"Rice", "Ice-Scream", "Bread", "Yogurt", "Pringles", "Vegetable-Oil", "Eggs", "Mash-mallow", "Sadin", "Table-water", "Peak Milk", "Snackers"};
	double[] prices = {50000, 2500, 1600, 4500, 3750, 6000, 1500, 3000, 1000, 1900, 7400, 2500};

	ArrayList<String> purchasedproducts = new ArrayList<>();
	ArrayList<Double> productPrice = new ArrayList<>();
	ArrayList<Integer> productQuantity = new ArrayList<>();

	System.out.println(availableProducts);
	boolean purchase = true;
	while (purchase == true){
	
	System.out.print("Enter product to purchase: ");
	int goods = input.nextInt();  
	purchasedproducts.add(products[goods - 1]);

	System.out.print("How many pieces/bags? : ");
	int quantity = input.nextInt(); 
	productPrice.add(prices[goods - 1]);
	productQuantity.add(quantity);

			System.out.print("Would you like to continue. Press \"1\" > Yes or \"0\" > No: ");
			int usersChoice = input.nextInt();
			switch (usersChoice){
				case 1:{
						purchase = true;
						}
				case 0:{
						purchase = false;
						}
				default: {
						purchase = false;
						}
				}
		}
	System.out.print("How much did the customer pay? : ");
	double amountPaid = input.nextDouble(); 

	System.out.print("Enter customer's name: ");
	String amountPaid = input.nextLine(); 

	String cashier = """
		Cashier on duty;-
		1 > Sikiru 

	}
}
