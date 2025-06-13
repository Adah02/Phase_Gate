import java.util.Scanner;
import java.util.ArrayList;
public class CheckOutApp {

	public static double valueAddedTax(ArrayList<Double> productPrice, ArrayList<Double> productQuantity){

	double total = 0;
	for (int index = 0; index < productPrice.size(); index++){
		total += (productPrice.get(index) * productQuantity.get(index));
		}
	double taxPercentage = 7.5;
	final double PERCENTAGE = 100;
	double vat = (total / PERCENTAGE) * taxPercentage;
	
	return vat;
	}

	public static double purchaseDiscount(ArrayList<Double> productPrice, ArrayList<Double> productQuantity){

	double totalAmount = 0;
	for (int index = 0; index < productPrice.size(); index++){
		totalAmount += (productPrice.get(index) * productQuantity.get(index));
		}
	double discountPercentage = 3.8;
	final double PERCENTAGE = 100;
	double discount = (totalAmount / PERCENTAGE) * discountPercentage;
	
	return discount;
	}

	public static double amountToPay(ArrayList<Double> productPrice, ArrayList<Double> productQuantity){
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

	public static double balance(ArrayList<Double> productPrice, ArrayList<Double> productQuantity, double amountPaid){

	double totalPurchase = 0;
		for (int index = 0; index < productPrice.size(); index++){
		totalPurchase += (productPrice.get(index) * productQuantity.get(index));
		}
		double customersBalance = (amountPaid - totalPurchase);

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

}