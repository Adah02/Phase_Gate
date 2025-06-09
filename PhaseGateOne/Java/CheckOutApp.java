import java.util.Scanner;
import java.util.ArrayList;
public class CheckOutApp {

	public static double[] productTotal (ArrayList<Double> productPrice, ArrayList<Double> productQuantity){
	
	double[] totalProductPrice = new double[productPrice.size()];

	for (int index = 0; index < productPrice.size(); index++){
		totalProductPrice[index] = (productPrice.get(index) * productQuantity.get(index));
		System.out.println(totalProductPrice);
		}
	return totalProductPrice;
	}

	public static double totalPurchaseAmount (ArrayList<Double> productPrice, ArrayList<Double> productQuantity){
	double purchaseAmount = 0;

	for (int index = 0; index < productPrice.size(); index++){
		purchaseAmount += (productPrice.get(index) * productQuantity.get(index));
		}
	return purchaseAmount;
	}

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

}