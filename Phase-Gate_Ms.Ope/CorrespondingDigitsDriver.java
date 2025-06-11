import java.util.Scanner;
public class CorrespondingDigitsDriver {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	CorrespondingDigits quiz = new CorrespondingDigits();

	System.out.print("Enter number: ");
	String userInput = input.next();

	quiz.isTheSame(userInput);

	}
}