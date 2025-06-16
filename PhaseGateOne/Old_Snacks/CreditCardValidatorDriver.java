import java.util.Scanner;
public class CreditCardValidatorDriver {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	CreditCardValidator quiz = new CreditCardValidator();
	
	System.out.print("Enter card number to verify: ");
	String myCardNumber = input.nextLine();	

	for (int index = 0; index < 42; index++){ System.out.print("*"); } System.out.println();
	System.out.println("** Credit Card Type: " + quiz.creditCardType(myCardNumber));
	System.out.println("** Credit Card Number: " + quiz.myCardNumber(myCardNumber));
	System.out.println("** Credit Card Digit Length: " + quiz.cardNumberLength(myCardNumber));
	System.out.println("** Credit Card Validity Status: " + quiz.validityStatus(myCardNumber));
	for (int index = 0; index < 42; index++){ System.out.print("*"); } System.out.println();


	}
}