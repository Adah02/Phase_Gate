import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
public class CheckOutApp {

	public static double purchaseTotal(ArrayList<Double> productPrice, ArrayList<Integer> productQuantity){

	double totalProductAmount = 0;

	for (int index = 0; index < productPrice.size(); index++){
		totalProductAmount +=  (productPrice.get(index) * productQuantity.get(index));
		}

	return totalProductAmount;
	}


	public static double[] productTotal(ArrayList<Double> productPrice, ArrayList<Integer> productQuantity){

	double[] totalProductPrice = new double[productPrice.size()];

	for (int index = 0; index < productPrice.size(); index++){
		totalProductPrice[index] =  (productPrice.get(index) * productQuantity.get(index));
		}

	return totalProductPrice;
	}

	public static double valueAddedTax(ArrayList<Double> productPrice, ArrayList<Integer> productQuantity){

	double total = 0;
	for (int index = 0; index < productPrice.size(); index++){
		total += (productPrice.get(index) * productQuantity.get(index));
		}
	double taxPercentage = 7.5;
	final double PERCENTAGE = 100;
	double vat = (total / PERCENTAGE) * taxPercentage;
	
	return vat;
	}

	public static double purchaseDiscount(ArrayList<Double> productPrice, ArrayList<Integer> productQuantity){

	double totalAmount = 0;
	for (int index = 0; index < productPrice.size(); index++){
		totalAmount += (productPrice.get(index) * productQuantity.get(index));
		}
	double discountPercentage = 3.8;
	final double PERCENTAGE = 100;
	double discount = (totalAmount / PERCENTAGE) * discountPercentage;
	
	return discount;
	}

	public static double billTotal(ArrayList<Double> productPrice, ArrayList<Integer> productQuantity){
	double total = 0;
		for (int index = 0; index < productPrice.size(); index++){
		total += (productPrice.get(index) * productQuantity.get(index));
		}
	double taxPercentage = 7.5;
	final double PERCENTAGE = 100;
	double vat = (total / PERCENTAGE) * taxPercentage;

	double totalToPay = total + vat;

	return totalToPay;
	}

	public static double balance(ArrayList<Double> productPrice, ArrayList<Integer> productQuantity, double amountPaid){

	double totalPurchase = 0;
		for (int index = 0; index < productPrice.size(); index++){
		totalPurchase += (productPrice.get(index) * productQuantity.get(index));
		}

	double taxPercentage = 7.5;
	final double PERCENTAGE = 100;
	double vat = (totalPurchase / PERCENTAGE) * taxPercentage;

		double customersBalance = (amountPaid - (totalPurchase + vat));
	return customersBalance;
	}
	
	public static String storeAddress(){

		String StoreDetails = """
	SEMICOLON STORES
	MAIN BRANCH
	LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
	TEL: 03293828343
	""";

	return StoreDetails;
	}

	public static String currentDateAndTime(){

	Date currentDate = new Date();

	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss aa");

	String dateForNow = dateFormat.format(currentDate);

	String timForNow = timeFormat.format(currentDate);

	return dateForNow + " " + timForNow;
	}


	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	ArrayList<String> purchasedproducts = new ArrayList<>();
	ArrayList<Double> productPrice = new ArrayList<>();
	ArrayList<Integer> productQuantity = new ArrayList<>();

	
	System.out.println("Enter customer's name: ");
	String customersName = input.next(); 	

	boolean purchase = true;
	while (purchase == true){
	
	System.out.print("Enter name of product: ");
	String goods = input.next();  
	purchasedproducts.add(goods);

	System.out.print("Enter price of product: ");
	double price = input.nextDouble();  
	productPrice.add(price);

	System.out.print("How many did customer buy? : ");
	int quantity = input.nextInt(); 
	productQuantity.add(quantity);

	System.out.println("Would you like to continue. Press \"1\" > Yes or \"0\" > No: ");
	String usersChoice = input.next();
	
		switch (usersChoice){
			case "1": purchase = true; break;
						
			case "0": purchase = false; break;

			default : purchase = false;  break;
			}
	}

	System.out.print("Enter cashier's name: ");	
	String cashiersName = input.next(); 

	String dashes = "";
	for (int dash = 0; dash < 56; dash++){
		dashes += "=";
	}
	
		System.out.println("\n" + dashes);
		System.out.printf("%sDate: %s%n", storeAddress(), currentDateAndTime());
		System.out.println("Cashier: " + cashiersName);
		System.out.println("Customers Name: " +customersName);
		System.out.println(dashes);
		System.out.printf("%15s %8s  %11s %15s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
		System.out.println(dashes);

		double[] productPriceTotal = productTotal(productPrice, productQuantity);

		for (int count = 0; count < productPrice.size(); count++ ){
		System.out.printf("%15s \t%d \t%.2f \t  %.2f%n", purchasedproducts.get(count), productQuantity.get(count), productPrice.get(count), productPriceTotal[count]);
		}

		System.out.println(dashes);
		System.out.printf(" \t Sub-Total: %.2f%n", purchaseTotal(productPrice, productQuantity));

		System.out.printf(" \t Discount:  %.2f%n", purchaseDiscount(productPrice, productQuantity));
		System.out.printf(" \t VAT@ 7.5%%:  %.2f%n%s%n", valueAddedTax(productPrice, productQuantity), dashes);

		System.out.printf(" \t Bill Total: %.2f%n", billTotal(productPrice, productQuantity));

		System.out.println(dashes);
		System.out.printf(" \t THIS IS NOT A RECEIPT, KINDLY PAY %.2f%n %s%n", billTotal(productPrice, productQuantity), dashes);
		
		System.out.println("");

			System.out.println("How much did the customer pay? ");
			double amountPaid = input.nextDouble(); 

		System.out.println("\n" + dashes);
		System.out.printf("%sDate: %s%n", storeAddress(), currentDateAndTime());

		System.out.printf("Cashier: %s%nCustomers Name:  %s%n%s%n", cashiersName, customersName, dashes);

		System.out.printf("%15s %8s  %11s %15s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
		System.out.println(dashes);

			for (int count = 0; count < productPrice.size(); count++ ){
			System.out.printf("%15s \t%d\t%.2f \t  %.2f%n", purchasedproducts.get(count), productQuantity.get(count), productPrice.get(count), productPriceTotal[count]);
			}

		double balance = balance(productPrice, productQuantity, amountPaid);

		System.out.println(dashes);
		System.out.printf(" \t Sub-Total: %.2f%n", purchaseTotal(productPrice, productQuantity));
		System.out.printf(" \t Discount:  %.2f%n", purchaseDiscount(productPrice, productQuantity));
		System.out.printf(" \t VAT@ 7.5%% : %.2f%n %s%n", valueAddedTax(productPrice, productQuantity), dashes);
		

		System.out.printf(" \t Bill Total:  \t %.2f%n", billTotal(productPrice, productQuantity));
		System.out.printf("\t Amount Paid: \t %.2f%n", amountPaid);
		if (balance < 0){
			System.out.printf("\t Balance:   \t %.2f%n \t You still owe %.2f. Please, pay up%n", balance, (Math.abs(balance)));
		} else {
			System.out.printf("\t Balance:   \t %.2f%n", balance);
			}
		System.out.println(dashes);
		System.out.println("  \t  THANKS FOR YOUR PATRONAGE");
		System.out.println(dashes);

		}	

}