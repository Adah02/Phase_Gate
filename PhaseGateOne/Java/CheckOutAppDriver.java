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

	System.out.println("Would you like to continue. Press \"1\" > Yes or \"0\" > No: ");
		String usersChoice = input.next();
		switch (usersChoice){
			case "1":{
				 	purchase = true;
					break;
				}
			case "yes": {
					purchase = true;
					break;
				}
			case "0": {
					purchase = false;
					break;
				}
			default : {
					purchase = true;
					break;
				} 
			}
		}
	System.out.println("Enter customer's name: ");
	String customersName = input.next(); 	

	String cashiers = """
		Cashier on duty;-
		1 > Sikiru I. J
		2 > Emmanuel  K. A
		3 > Eze-Kiel C. A
		4 > Olawole R. O
		""";

	String cashiersName = "";
	System.out.println(cashiers);

	boolean cashier = true;
	while(cashier == true){

	System.out.println("Select name of cashier on duty: ");
	cashiersName = input.nextLine(); 

	switch(cashiersName){
		case "1":{
				cashiersName = "Sikiru I. J";
				cashier = false;
				break;
			}
		case "2":{
				cashiersName = "Emmanuel  K. A";
				cashier = false;
				break;
			}
		case "3":{
				cashiersName = "Eze-Kiel C. A";
				cashier = false;
				break;
			}
		case "4":{
				cashiersName = "Olawole R. O";
				cashier = false;
				break;
			}
		default : {
				cashier = true;
			}
		}
	}
	String dashes = "";
	for (int dash = 0; dash < 56; dash++){
		dashes += "=";
	}
	ArrayList<Double> totalProductPrice = new ArrayList<>();

	for (int index = 0; index < productPrice.size(); index++){
		totalProductPrice.add(productPrice.get(index) * productQuantity.get(index));
		}

		System.out.println(dashes);
		System.out.println(quiz.storeAddress());
		System.out.println("Date: ");
		System.out.println("Cashier: " + cashiersName);
		System.out.println("Customers Name: " +customersName);
		System.out.println(dashes);
		System.out.printf("%15s %8s  %11s %15s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
		System.out.println(dashes);
		for (int count = 0; count < productPrice.size(); count++ ){
		System.out.printf("%15s \t%d\t%.2f \t%.2f%n", purchasedproducts.get(count), productQuantity.get(count), productPrice.get(count), totalProductPrice.get(count));
		}
		System.out.println(dashes);		double purchaseAmount = 0;

		for (int index = 0; index < productPrice.size(); index++){
		purchaseAmount += (productPrice.get(index) * productQuantity.get(index));
		}
		System.out.printf(" \t Sub-Total: %.2f%n", purchaseAmount);

		double discountPercentage = 3.8;
		final double PERCENTAGE = 100;
		double discount = (purchaseAmount / PERCENTAGE) * discountPercentage;
		System.out.printf(" \t Discount:  %.2f%n", discount);

		double taxPercentage = 7.5;
		double vat = (purchaseAmount / PERCENTAGE) * taxPercentage;
		System.out.printf(" \t VAT@ 7.5%%:  %.2f%n", vat);

		System.out.println(dashes);
		double billTotal = (purchaseAmount + vat) - discount;
		System.out.printf(" \t Bill Total: %.2f%n", billTotal);

		System.out.println(dashes);
		System.out.printf(" \t THIS IS NOT A RECEIPT, KINDLY PAY %.2f%n", billTotal);
		System.out.println(dashes);
		
		System.out.println("");

			System.out.println("How much did the customer pay? ");
			double amountPaid = input.nextDouble(); 

		System.out.println(dashes);
		System.out.println(quiz.storeAddress());
		System.out.println("Date: ");
		System.out.println("Cashier: " + cashiersName);
		System.out.println("Customers Name: " +customersName);
		System.out.println(dashes);
		System.out.printf("%15s %8s  %11s %15s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
		System.out.println(dashes);

			for (int count = 0; count < productPrice.size(); count++ ){
			System.out.printf("%15s \t%d\t%.2f \t%.2f%n", purchasedproducts.get(count), productQuantity.get(count), productPrice.get(count), totalProductPrice.get(count));
			}
		System.out.println(dashes);
		System.out.printf(" \t Sub-Total: %.2f%n", purchaseAmount);
		System.out.printf(" \t Discount:  %.2f%n", discount);
		System.out.printf(" \t VAT@ 7.5%% : %.2f%n ", vat);
		System.out.println(dashes);

		System.out.printf(" \t Bill Total:  \t %.2f%n", billTotal);
		System.out.printf("\t Amount Paid: \t %.2f%n", amountPaid);
		System.out.printf("\t Balance:   \t %.2f%n", ( amountPaid - billTotal));
	
		System.out.println(dashes);
		System.out.println("  \t  THANKS FOR YOUR PATRONAGE");
		System.out.println(dashes);

	}	
}
