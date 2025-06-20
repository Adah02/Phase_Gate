import java.util.Scanner;
public class CreditCardValidator {

	public static String cardValidity(String myCardNumber){
	String cardNumber = myCardNumber.replaceAll("\\s+", "");

	boolean cardValid = false;
		if (cardNumber.charAt(0) > '2' && cardNumber.charAt(0) < '7'){
			if (cardNumber.length() >= 13 && cardNumber.length() <= 16){
				if (cardNumber.charAt(0) == '3' && cardNumber.charAt(1) != '7'){
				cardValid = false;
				}else {
				cardValid = true;
				}
			}else {
				cardValid = false;
				}
		} else {
			cardValid = false;
			}
	String validity = (cardValid) ? "Valid" : "Invalid";
	return validity;
	}

	public static String myCardNumber(String myCardNumber){
	String myNumber = myCardNumber.replaceAll("\\s+", "");

	if (myNumber.length() <13 || myNumber.length() > 16) myNumber = "Invalid";
	for (int index = 0; index < myNumber.length(); index++){
		if (myNumber.charAt(index) < '0' || myNumber.charAt(index) > '9' &&  myNumber.charAt(index) != ' '){
			myNumber = "Invalid";
		} 
		if (myNumber == "Invalid") break;
	}
	return myNumber;
	}

	public static String creditCardType(String myCardNumber){
	String cardType = "";
	String cardNumber = myCardNumber.replaceAll("\\s+", "");

	for (int index = 0; index < cardNumber.length(); index++){
		if (cardNumber.charAt(index) < '0' || cardNumber.charAt(index) > '9' &&  cardNumber.charAt(index) != ' '){
			cardType = "Invalid";
			break;
			}
		}
	if (cardNumber.length() >= 13 && cardNumber.length() <= 16 && cardType != "Invalid"){
		if (cardNumber.charAt(0) == '4'){
			cardType = "VisaCard";
		} else if (cardNumber.charAt(0) == '5'){
			cardType = "MasterCard";
		} else if (cardNumber.charAt(0) == '6'){
			cardType = "DiscoverCard";
		} else if (cardNumber.charAt(0) == '3' && cardNumber.charAt(1) == '7'){
			cardType = "AmericanExpressCard";
		} else { cardType = "Invalid Card"; }
	} else { 
		cardType = "Invalid Card";
	}
	return cardType;
	}

	public static String validityStatus(String myCardNumber){
	int sum = 0;  int sumOdd = 0;
	String cardNumber = myCardNumber.replaceAll("\\s+", "");

	for (int index = cardNumber.length() - 1; index >= 0; index--){
		sumOdd += Integer.parseInt(String.valueOf(cardNumber.charAt(index)));
	
		if (index > 0){ index -= 1; } else { break; }
		int integerValue = Integer.parseInt(String.valueOf(cardNumber.charAt(index))) * 2;
			if (integerValue > 9){
				int firstDigit = integerValue / 10;  int secondDigit =  integerValue % 10;
				sum += (firstDigit + secondDigit);	
			} else{
				sum += integerValue;
			}
		}
	int total = sum + sumOdd;
	String validator = (total % 10 == 0) ? "Valid" : "Invalid";
	return validator;
	}

	public static int cardNumberLength(String myCardNumber){
	String cardNumber = myCardNumber.replaceAll("\\s+", "");

	int digitLength = cardNumber.length();

	return digitLength;
	}



	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter card number to verify: ");
	String myCardNumber = input.nextLine();

	for (int index = 0; index < 42; index++){ System.out.print("*"); } System.out.println();
	System.out.println("** Credit Card Type: " + creditCardType(myCardNumber));
	System.out.println("** Credit Card Number: " + myCardNumber(myCardNumber));
	System.out.println("** Credit Card Digit Length: " + cardNumberLength(myCardNumber));
	System.out.println("** Credit Card Validity Status: " + validityStatus(myCardNumber));
	for (int index = 0; index < 42; index++){ System.out.print("*"); } System.out.println();
	}
	
}

